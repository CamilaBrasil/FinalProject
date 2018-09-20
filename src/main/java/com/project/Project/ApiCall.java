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

	public ArrayList<Job> getGitHubJobs(String answerOne, String answerTwo, String answerThree, String answerFour, String answerFive, String answerSix) {

		List<String> skills = new ArrayList<>();
		skills.add(answerFour);
		skills.add(answerFive);
		skills.add(answerSix);
		ArrayList<Job> matches = new ArrayList<Job>();

		RestTemplate restTemplate = new RestTemplate();

		for (int i = 0; i < skills.size(); i++) {

			GithubJob[] gitList = restTemplate.getForObject(
					"https://jobs.github.com/positions.json?description=" + skills.get(i) + "&page=10",
					GithubJob[].class);

			for (int j = 0; j < gitList.length; j++) {

				String desc = gitList[j].getDescription();
				Job job = new Job(gitList[j].getTitle(), desc);
				job.setLocation(gitList[j].getLocation());
				job.setKeywords(Algorithm.getResult(desc, answerOne, answerTwo, answerThree));
				job.setJoburl(gitList[j].getHow_to_apply());
				matches.add(job);

			}
		}
		return matches;
	}

	public ArrayList<Job> getAuthenticJobs(String answerOne, String answerTwo, String answerThree, String answerFour, String answerFive, String answerSix, String privateKey) {

		List<String> skills = new ArrayList<>();
		skills.add(answerFour);
		skills.add(answerFive);
		skills.add(answerSix);
		ArrayList<Job> matches = new ArrayList<Job>();

		RestTemplate restTemplate = new RestTemplate();

		for (int i = 0; i < skills.size(); i++) {

			ParentJson authList = restTemplate.getForObject("https://authenticjobs.com/api/?api_key=" + privateKey
					+ "&method=aj.jobs.search&keywords=" + skills.get(i) + "&perpage=10&format=json",
					ParentJson.class);

			List<Listing> list = authList.getTest().getListing();

			for (int j = 0; j < list.size(); j++) {

				String desc = list.get(j).getDescription();
				Job job = new Job(list.get(j).getTitle(), desc);
				job.setJoburl(list.get(j).getApply_url());
				job.setKeywords(Algorithm.getResult(desc, answerOne, answerTwo, answerThree));

				matches.add(job);

			}
		}
		return matches;
	}

	public ArrayList<Job> getUsaJobs(String answerOne, String answerTwo, String answerThree, String answerFour, String answerFive, String answerSix, String jobKey2) {

		// Getting all keywords
		List<String> skills = new ArrayList<>();
		skills.add(answerFour);
		skills.add(answerFive);
		skills.add(answerSix);
		
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

		for (int i = 0; i < skills.size(); i++) {

			ResponseEntity<UsaJobsJson> response = restTemplate
					.exchange(
							"https://data.usajobs.gov/api/Search?Keyword=" + skills.get(i)
									+ "&KeywordFilter=ALL&JobCategoryCode=0800",
							HttpMethod.GET, entity, UsaJobsJson.class);

			ArrayList<StringResultItems> jobs = response.getBody().getSr().getItems();

			for (int j = 0; j < jobs.size(); j++) {

				String desc = jobs.get(j).getMatch().getSum();
				Job job = new Job(jobs.get(j).getMatch().getPositionTitle(), desc);
				job.setLocation(jobs.get(j).getMatch().getLoc().toString());
				job.setJoburl(jobs.get(j).getMatch().getPositionUri());
				job.setKeywords(Algorithm.getResult(desc, answerOne, answerTwo, answerThree));
				matches.add(job);

			}
		}
		return matches;

	}

}
