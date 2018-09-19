package com.project.Project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.project.Project.entity.GithubJob;
import com.project.Project.entity.Job;
import com.project.Project.entity.Listing;
import com.project.Project.entity.ParentJson;
import com.project.Project.entity.StringResultItems;
import com.project.Project.entity.UsaJobsJson;

public class ApiCall {

	public ArrayList<Job> getGitHubJobs(String answerOne, String answerTwo, String answerThree) {

		// Getting all keywords
		List<String> keywords = Algorithm.getKeywords(answerOne, answerTwo, answerThree);
		ArrayList<Job> matches = new ArrayList<Job>();

		RestTemplate restTemplate = new RestTemplate();
//		System.out.println(keywords);

		for (int i = 0; i < keywords.size(); i++) {

			GithubJob[] gitList = restTemplate.getForObject(
					"https://jobs.github.com/positions.json?description=" + keywords.get(i) + "&page=10",
					GithubJob[].class);

			for (int j = 0; j < gitList.length; j++) {

				String desc = gitList[j].getDescription();
//				(String jobTitle, String desc, String company, String location, String jobURL
				Job job = new Job(gitList[j].getTitle(), desc);
				job.setLocation(gitList[j].getLocation());
				job.setKeywords(Algorithm.getResult(desc, answerOne, answerTwo, answerThree));
				matches.add(job);
//				System.out.println("result: " + job.getKeywords());

				// Checking if the same job already exist in the array
//				for (int k = 0; k < matches.size(); k++) {
//					if (!matches.get(k).getDesc().equals(desc)) {
//						matches.add(job);
//					}
//				}

			}
		}
		return matches;
	}

	public ArrayList<Job> getAuthenticJobs(String answerOne, String answerTwo, String answerThree, String privateKey) {

		// Getting all keywords
		List<String> keywords = Algorithm.getKeywords(answerOne, answerTwo, answerThree);
		ArrayList<Job> matches = new ArrayList<Job>();

		RestTemplate restTemplate = new RestTemplate();

		for (int i = 0; i < keywords.size(); i++) {

			ParentJson authList = restTemplate.getForObject("https://authenticjobs.com/api/?api_key=" + privateKey
					+ "&method=aj.jobs.search&keywords=" + keywords.get(i) + "&perpage=10&format=json",
					ParentJson.class);

			List<Listing> list = authList.getTest().getListing();

			for (int j = 0; j < list.size(); j++) {

				String desc = list.get(j).getDescription();
//				(String jobTitle, String desc, String company, String location, String jobURL
				Job job = new Job(list.get(j).getTitle(), desc);
				job.setKeywords(Algorithm.getResult(desc, answerOne, answerTwo, answerThree));
			
				System.out.println(job.getJobTitle());
				matches.add(job);
//				System.out.println("result: " + job.getKeywords());
				
				// Checking if the same job already exist in the array
//				for (int k = 0; k < matches.size(); k++) {
//					if (!matches.get(k).getDesc().equals(desc)) {
//						matches.add(job);
//					}
//				}
			}
		}
		return matches;
	}

	public ArrayList<Job> getUsaJobs(String answerOne, String answerTwo, String answerThree, String jobKey2) {

		// Getting all keywords
		List<String> keywords = Algorithm.getKeywords(answerOne, answerTwo, answerThree);
		ArrayList<Job> matches = new ArrayList<Job>();

		RestTemplate restTemplate = new RestTemplate();

		// Headers to our API request
		HttpHeaders headers = new HttpHeaders();
		headers.add("Host", "data.usajobs.gov");
		headers.add("User-Agent", "mila.brasil@gmail.com");
		headers.add("Authorization-Key", jobKey2); // adding the key from the application.properties file
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		System.out.println(jobKey2);
		// to attach the headers to our request we need the HttpEntity
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

		ResponseEntity<UsaJobsJson> response = restTemplate.exchange("https://data.usajobs.gov/api/Search?Keyword="
				+ keywords.get(0) + "&KeywordFilter=ALL&JobCategoryCode=0800", HttpMethod.GET, entity,
				UsaJobsJson.class);

		ArrayList<StringResultItems> jobs = response.getBody().getSr().getItems();
		
		System.out.println(response.getBody().getSr().getItems().get(0).getMatch().getPositionTitle());

		for (int j = 0; j < jobs.size(); j++) {

			String desc = jobs.get(j).getMatch().getSum();
			Job job = new Job(jobs.get(j).getMatch().getPositionTitle(), desc);
			job.setLocation(jobs.get(j).getMatch().getLoc().toString());
			job.setJobURL(jobs.get(j).getMatch().getPositionUri());
			job.setKeywords(Algorithm.getResult(desc, answerOne, answerTwo, answerThree));
			matches.add(job);
//			System.out.println("result: " + job.getKeywords());

			// Checking if the same job already exist in the array
//			for (int k = 0; k < matches.size(); k++) {
//				if (!matches.get(k).getDesc().equals(desc)) {
//					matches.add(job);
//				}
//			}
		}
		return matches;

	}

}
