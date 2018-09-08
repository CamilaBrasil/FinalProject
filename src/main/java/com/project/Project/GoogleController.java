package com.project.Project;

import java.io.IOException;
import java.util.Arrays;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.google.api.client.http.HttpHeaders;
import com.google.api.services.jobs.v3.model.Company;
import com.google.api.services.jobs.v3.model.Job;
import com.google.api.services.jobs.v3.model.JobQuery;
import com.google.api.services.jobs.v3.model.ListCompaniesResponse;
import com.google.api.services.jobs.v3.model.RequestMetadata;
import com.google.api.services.jobs.v3.model.SearchJobsRequest;
import com.google.api.services.jobs.v3.model.SearchJobsResponse;
import com.project.Project.entity.JobServiceQuickstart;

@Controller
public class GoogleController {

	@RequestMapping("/googleindex")
	public ModelAndView indexG() throws IOException {
		System.out.println("test part1");
		try {
			ListCompaniesResponse listCompaniesResponse = JobServiceQuickstart.talentSolutionClient.projects()
					.companies()

					.list("projects/finalproject1-215816").execute();
			System.out.println("test part2");

			System.out.println("Request Id is " + listCompaniesResponse.getMetadata().getRequestId());
			System.out.println(listCompaniesResponse.getCompanies());
			if (listCompaniesResponse.getCompanies() != null) {
				for (Company company : listCompaniesResponse.getCompanies()) {
					System.out.println(company.getName());
				}
			}
		} catch (IOException e) {
			System.out.println("Got exception while listing companies1");
			throw e;
		}

		return new ModelAndView("googletest");
	}

	@RequestMapping("/jobsearch")
	public ModelAndView jobsearch() throws IOException {
		 SearchJobsResponse searchJobsResponse;
		System.out.println("test part1");
		String companyName= "Google";
		String query = "projects/finalproject1-215816/companies/123";
		try {
			System.out.println("Part Test2");
					 RequestMetadata requestMetadata =
				      new RequestMetadata()
				          // Make sure to hash your userID
				          .setUserId("HashedUserId")
				          // Make sure to hash the sessionID
				          .setSessionId("HashedSessionID")
				          // Domain of the website where the search is conducted
				          .setDomain("www.google.com");
					 	  

				  // Perform a search for analyst  related jobs
				  JobQuery jobQuery = new JobQuery().setQuery(query);
				  if (companyName != null) {
				    jobQuery.setCompanyNames(Arrays.asList(companyName));
				  }

				  SearchJobsRequest searchJobsRequest =
				      new SearchJobsRequest()
				          .setRequestMetadata(requestMetadata)
				          .setJobQuery(jobQuery) // Set the actual search term as defined in the jobQurey
				          .setSearchMode("JOB_SEARCH"); // Set the search mode to a regular search

				   searchJobsResponse =
				      JobServiceQuickstart.talentSolutionClient// TEMPORARY FIX DON'T KNOW WHATS GOING ON THROWING SHIT AT THE WALL
				          .projects()
				          .jobs()
				          .search("projects/finalproject1-215816", searchJobsRequest)
				          .execute();

				  System.out.println(searchJobsResponse.toString());
//			JobQuery jobQuery = new JobQuery().setQuery("developer");
//
//			SearchJobsRequest r = new SearchJobsRequest().setJobQuery(jobQuery).setSearchMode("JOB_SEARCH");
//
//			SearchJobsResponse searchJobsResponse = JobServiceQuickstart.talentSolutionClient.projects().jobs()
//					.search("projects/finalproject1-215816", r).execute();
//
//			System.out.println(searchJobsResponse);
//
		} catch (IOException e) {
			System.out.println("Got exception while listing companies /jobsearch");
			throw e;
		}

		return new ModelAndView("googletest", "job", searchJobsResponse);
	}

	@RequestMapping("/job")
	public ModelAndView viewJobs() {
		HttpHeaders headers = new HttpHeaders();
		headers.put("Accept", "*");
		System.out.println(headers);

		// To attach the headers to our request we need the HttpEntity
		HttpEntity<Object> entity = new HttpEntity<Object>(headers);

		CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier())
				.build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);

		RestTemplate restTemp = new RestTemplate();
		ResponseEntity<?> response = restTemp.exchange(
				"https://jobs.googleapis.com/v3/projects/finalproject1/jobs?filter=companyName+%3D+%22projects%2Ffinalproject%2Fcompanies%2F123%22+&key=af872a6aa587580836acde0ad7b40be880370803",
				HttpMethod.GET, entity, Job.class);

//		Job jobList = response.getBody();
		System.out.println(response);

		return new ModelAndView("googletest", "job", "hello world");
	}

}
