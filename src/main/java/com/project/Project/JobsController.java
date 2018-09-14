package com.project.Project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

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

//	@GetMapping("/jobid")
//	public ModelAndView jobId() {
//		RestTemplate restTemplate = new RestTemplate();
//
//		ParentJson test = restTemplate.getForObject("https://authenticjobs.com/api/?api_key=" + privatekey
//				+ "&method=aj.jobs.search&keywords=java&perpage=1&format=json", ParentJson.class);
//
//		System.out.println(test);
//		return new ModelAndView("jobid", "jobdata", test);
//	}
	
	//Show the jobs
	@GetMapping("/jobs/{user_id}")
	public ModelAndView jobs(@PathVariable("user_id") Integer user_id) {

		String keywords = qr.findByUserId(user_id).getSkills();
//		System.out.println("Keywords:  " + qr.findByUserId(user_id).getSkills());
		
		RestTemplate restTemplate = new RestTemplate();
		ParentJson test = restTemplate.getForObject("https://authenticjobs.com/api/?api_key=" + privatekey
				+ "&method=aj.jobs.search&keywords=" + keywords + "&perpage=1&format=json", ParentJson.class);

		List<Listing> list = test.getTest().getListing();
		
		ModelAndView mv = new ModelAndView("job_results", "list", list);
		return mv.addObject("user_id", user_id);
	}
	
	
	@RequestMapping("/savejob/{title}")
	public ModelAndView saveJob(@PathVariable("title") String title, @RequestParam("user_id") Integer user_id) {
		
		System.out.println("title:  " + title);
		FavJobs fav = new FavJobs();
//		fav.setDescription(job.getDescription());
		fav.setJobTitle(title);
		fav.setUser_id(user_id);		
		System.out.println("FavJob: " + fav.toString());
		jr.save(fav);
		
		return new ModelAndView("job_results");
	}
	
	@RequestMapping("/testJob")
	public ModelAndView testJob () {
		
		FavJobs fav = new FavJobs("test", 1);
//		fav.setJobTitle("test");
//		fav.setUser_id(1);
		System.out.println(fav);
		jr.save(fav);
		
		return new ModelAndView ("home");
	}
	

}
