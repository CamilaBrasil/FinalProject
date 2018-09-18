package com.project.Project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.project.Project.dao.JobsRepo;
import com.project.Project.dao.QuizRepo;
import com.project.Project.dao.UserRepo;
import com.project.Project.entity.FavJobs;
import com.project.Project.entity.GithubJob;
import com.project.Project.entity.Job;
import com.project.Project.entity.Listing;
import com.project.Project.entity.ParentJson;
import com.project.Project.entity.Quiz;
import com.project.Project.entity.UsaJobsJson;
import com.project.Project.entity.User;

@Controller
@SessionAttributes("user")
public class JobsController {

	@Autowired
	QuizRepo qr;
	@Autowired
	UserRepo ur;
	@Autowired
	JobsRepo jr;

	//Authentic Job
	@Value("${privatekey}")
	private String privatekey;
	
	@Value("${usajobs.key}")
	String jobKey;

	
	@RequestMapping("/findJobs")
	public ModelAndView matches(User u1) {

		ArrayList<Job> matches = new ArrayList<Job>();
		Quiz quiz = qr.findById(u1.getUser_id()).get();

		String answerOne = quiz.getAnswer1();
		String answerTwo = quiz.getAnswer2();
		String answerThree = quiz.getAnswer3();
		
		ApiCall ac = new ApiCall();
		
		matches.addAll(ac.getAuthenticJobs(answerOne, answerTwo, answerThree, privatekey));
		matches.addAll(ac.getGitHubJobs(answerOne, answerTwo, answerThree));
//		matches.addAll(ac.getUsaJobs(answerOne, answerTwo, answerThree, jobKey));

//		System.out.println("size: " + matches.size());

		return new ModelAndView("job_results", "jobs", matches);
	}

	
	
	//Use to see if has the same job twice
	public ArrayList<Job> checkListKeywords(ArrayList<Job> list1, ArrayList<Job> list2) {
		ArrayList<Job> matchList = new ArrayList<Job>();
		for (Job job1 : list1) {
			for (Job job2 : list2) {
				if (job1.getDesc().equalsIgnoreCase(job2.getDesc())) {
					matchList.add(job1);
				}
			}
		}
		return matchList;
	}
	
	@RequestMapping("/savejob/{title}/{user_id}")
	public ModelAndView saveJob(@PathVariable("title") String title, @PathVariable("user_id") Integer user_id) {

		// Arraylist of Job objects
		ArrayList<Job> jobList = new ArrayList<>();

		String keywords = "";
//		String keywords = qr.findByUserId(user_id).getSkills();
		RestTemplate restTemplate = new RestTemplate();
		ParentJson test = restTemplate.getForObject("https://authenticjobs.com/api/?api_key=" + privatekey
				+ "&method=aj.jobs.search&keywords=" + keywords + "&perpage=10&format=json", ParentJson.class);

		List<Listing> list = test.getTest().getListing();

		for (Listing listing : list) {
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


}
