package com.project.Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

//import com.apidemo.ApiDemo.entity.love.LoveMatcher;
import com.project.Project.dao.JobsRepo;
import com.project.Project.dao.QuizRepo;
import com.project.Project.dao.UserRepo;
import com.project.Project.entity.FavJobs;
import com.project.Project.entity.Listing;
import com.project.Project.entity.ParentJson;

@Controller
@SessionAttributes("user")
public class JobsController {

	@Autowired
	QuizRepo qr;
	@Autowired
	UserRepo ur;
	@Autowired
	JobsRepo jr;

	@Value("${privatekey}")
	private String privatekey;
	
	//Arraylist of Job objects
	ArrayList<Job> jobList = new ArrayList<>();
	
	@GetMapping("/jobid")
	public ModelAndView jobId() {
		RestTemplate restTemplate = new RestTemplate();

		ParentJson test = restTemplate.getForObject("https://authenticjobs.com/api/?api_key=" + privatekey
				+ "&method=aj.jobs.search&keywords=java&perpage=1&format=json", ParentJson.class);

		System.out.println(test);
		return new ModelAndView("jobid", "jobdata", test);
	}

	// Show the jobs
	@GetMapping("/jobs/{user_id}")
	public ModelAndView jobs(@PathVariable("user_id") Integer user_id) {

		String keywords = qr.findByUserId(user_id).getSkills();
		System.out.println("Keywords:  " + qr.findByUserId(user_id).getSkills());

		RestTemplate restTemplate = new RestTemplate();
		ParentJson test = restTemplate.getForObject("https://authenticjobs.com/api/?api_key=" + privatekey
				+ "&method=aj.jobs.search&keywords=" + keywords + "&perpage=1&format=json", ParentJson.class);

		List<Listing> list = test.getTest().getListing();

		ModelAndView mv = new ModelAndView("job_results", "list", list);
		return mv.addObject("user_id", user_id);
	}

	@RequestMapping("/savejob/{title}/{user_id}")
	public ModelAndView saveJob(@PathVariable("title") String title, @PathVariable("user_id") Integer user_id) {

		String keywords = qr.findByUserId(user_id).getSkills();
		RestTemplate restTemplate = new RestTemplate();
		ParentJson test = restTemplate.getForObject("https://authenticjobs.com/api/?api_key=" + privatekey
				+ "&method=aj.jobs.search&keywords=java&perpage=10&format=json", ParentJson.class);

		List<Listing> list = test.getTest().getListing();
		
		
		for(Listing listing : list) {
			Job job = new Job();
			job.setJobTitle(listing.getTitle());
			job.setDesc(listing.getDescription());
			jobList.add(job);
		}
		
		
		System.out.println("title:  " + title);
		FavJobs fav = new FavJobs(title, user_id);
//		fav.setDescription(job.getDescription());
		fav.setJobTitle(title);
		fav.setUser_id(user_id);
		System.out.println("FavJob: " + fav.toString());
		jr.save(fav);

		return new ModelAndView("home");
	}
	
	@RequestMapping("/sillyq")
	public ModelAndView testSillyQ() {
		
		return new ModelAndView("sillyquestions");
	}
	
	@PostMapping("/submitsillyq")
	public ModelAndView testSubmittSillyQ(@RequestParam("quest1") String quest1, @RequestParam("quest2") String quest2, 
			@RequestParam("quest2") String quest3) {
		
			ArrayList<Job> testList1 = storeKeywordJobs(quest1);
			ArrayList<Job> testList2 = new ArrayList<Job>();
			ArrayList<Job> testList3 = new ArrayList<Job>();
			
			ArrayList<Job> matchList1 = new ArrayList<Job>();
			ArrayList<Job> matchList2 = new ArrayList<Job>();
			ArrayList<Job> matchList3 = new ArrayList<Job>();
			
			
			testList2.addAll(storeKeywordJobs(quest2));
			testList3.addAll(storeKeywordJobs(quest3));
			
			
			
//			for(Job job : testList1) {
//				
////				System.out.println("ONLY QUESTION 1");
////				System.out.println(job.getJobTitle());
//			}
//			for(Job job : testList2) {
////				System.out.println("WITH QUESTION 2");
////				System.out.println(job.getJobTitle());
//			}
			
			matchList1 = checkListKeywords(testList1, testList2);
			matchList2 = checkListKeywords(testList1, testList3);
			matchList3 = checkListKeywords(testList2, testList3);
			
			
//			System.out.println("LIST 1");
//			for(Job job : testList1) {
//				System.out.println(job.getJobTitle());
//			}
//			System.out.println("");
//			System.out.println("LIST 2");
//			for(Job job : testList2) {
//				System.out.println(job.getJobTitle());
//			}
//			System.out.println("");
//			System.out.println("MATCH LIST: 1 AND 2");
//			for(Job job : matchList1) {
//				System.out.println(job.getJobTitle());
//			}
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
			System.out.println("LIST 2");
			for(Job job : testList2) {
				System.out.println(job.getJobTitle());
			}
			System.out.println("");
			System.out.println("LIST 3");
			for(Job job : testList3) {
				System.out.println(job.getJobTitle());
			}
//			System.out.println("MATCH LIST: 1 AND 3");
//			
//			for(Job job : matchList2) {
//				System.out.println(job.getJobTitle());
//			}
//			System.out.println("");
//			System.out.println("");
//			System.out.println("");
//			System.out.println("");
//			System.out.println("MATCH LIST: 2 AND 3");
//			for(Job job : matchList3) {
//				System.out.println(job.getJobTitle());
//			}
			
		return new ModelAndView("sillyquestions", "test", quest1);
	}
	
	@RequestMapping("/testJobList")
	public void testJobList() {
		RestTemplate restTemplate = new RestTemplate();
		ParentJson test = restTemplate.getForObject("https://authenticjobs.com/api/?api_key=" + privatekey
				+ "&method=aj.jobs.search&keywords=java&perpage=10&format=json", ParentJson.class);

		List<Listing> list = test.getTest().getListing();

		for(Listing listing : list) {
			Job job = new Job();
			job.setJobTitle(listing.getTitle());
			job.setDesc(listing.getDescription());
			jobList.add(job);
			
			System.out.println(job.getJobTitle());
		}
		
		// using an array because the json data returns a json array as the parent
		GithubJob[] gitList = restTemplate.getForObject("https://jobs.github.com/positions.json?description=java&page=1",
				GithubJob[].class);
		
		
		for(GithubJob git : gitList) {
			Job job = new Job();
			job.setJobTitle(git.getTitle());
			job.setDesc(git.getDescription());
			jobList.add(job);

		}
	}


	@RequestMapping("/testJob")
	public ModelAndView testJob() {

		FavJobs fav = new FavJobs("test", 1);
		fav.setJobTitle("test");
		fav.setUser_id(1);
		System.out.println(fav);
		jr.save(fav);

		return new ModelAndView("home");
	}
	

	@GetMapping("/gitjobs")
	public ModelAndView index() {

		RestTemplate restTemplate = new RestTemplate();
		// using an array because the json data returns a json array as the parent
		GithubJob[] quote = restTemplate.getForObject("https://jobs.github.com/positions.json?description=java&page=1",
				GithubJob[].class);
		System.out.println(Arrays.asList(quote));
		return new ModelAndView("gitjobs", "githubresults", quote);
	}
	
	
	public ArrayList<Job> storeKeywordJobs(String keyword){
		ArrayList<Job> jobList1 = new ArrayList<>();
		
		
		RestTemplate restTemplate = new RestTemplate();
		ParentJson test = restTemplate.getForObject("https://authenticjobs.com/api/?api_key=" + privatekey
				+ "&method=aj.jobs.search&keywords="+ keyword + "&perpage=10&format=json", ParentJson.class);

		List<Listing> list = test.getTest().getListing();
		System.out.println("Jobs from AJ");
		for(Listing listing : list) {
			Job job = new Job();
			job.setJobTitle(listing.getTitle());
			job.setDesc(listing.getDescription());
			jobList1.add(job);
		}
		
		// using an array because the json data returns a json array as the parent
		GithubJob[] gitList = restTemplate.getForObject("https://jobs.github.com/positions.json?description="+ keyword+ "&page=1",
				GithubJob[].class);
		
		
		System.out.println("Jobs from github jobs");
		for(GithubJob git : gitList) {
			Job job = new Job();
			job.setJobTitle(git.getTitle());
			job.setDesc(git.getDescription());
			jobList1.add(job);
		}
		
		return jobList1;
	}
	
	public ArrayList<Job> checkListKeywords(ArrayList<Job> list1, ArrayList<Job> list2){
		ArrayList<Job> matchList = new ArrayList<Job>();
		for(Job job1 : list1) {
			for(Job job2 : list2) {
				if(job1.getDesc().equalsIgnoreCase(job2.getDesc())) {
					matchList.add(job1);
				}
			}
		}
		return matchList;
			
	}
}
//	
//	@RequestMapping("/jobid")
//	public ModelAndView teste1() {
//
//		String authKey = "RIVv8gDUbN9Q7EAfFLcfcOSkuF0VaTY2L8AeHCnL5Q";
//		
//		String host = "data.usajobs.gov";  
//		String userAgent = "mila.brasil@gmail.com";  
//    
//		            
//		      
////		    method: 'GET',      
////		    headers: {          
////		        "Host": host,          
////		        "User-Agent": userAgent,          
////		        "Authorization-Key": authKey      
////		    }  
////		}, function(error, response, body) {      
////		    var data = JSON.parse(body);  
////		});
//		
//		
////		HttpHeaders headers = new HttpHeaders();
////		headers.add("Host", host);
////		headers.add("User-Agent", userAgent);
////		headers.add("Authorization-Key", authKey);
////		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
////		
////		//To attach the headers to our request we need the HttpEntity
////		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
////		
////		RestTemplate restTemp = new RestTemplate();
////		ResponseEntity<> response = restTemp.exchange("https://data.usajobs.gov/api/search?JobCategoryCode=2210&Keyword=Software Development&LocationName=Washington, DC",
////				HttpMethod.GET, entity, LoveMatcher.class);
////		
////		//Test to make sure we are getting data back
////		System.out.println(response.getBody());
////		
////
////		
////		return new ModelAndView("love_match", "response", response);
//	}
//
//}
