package com.project.Project;

import java.util.ArrayList;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.project.Project.dao.JobsRepo;
import com.project.Project.dao.QuizRepo;
import com.project.Project.dao.UserRepo;
import com.project.Project.entity.FavJobs;
import com.project.Project.entity.Job;
import com.project.Project.entity.Quiz;
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
	public ModelAndView matches(HttpSession session) {

		User u1 = (User) session.getAttribute("user");
		
		
		Quiz quiz = qr.findByUserId(u1.getUser_id());

		String answerOne = quiz.getAnswer1();
		String answerTwo = quiz.getAnswer2();
		String answerThree = quiz.getAnswer3();
		
		ApiCall ac = new ApiCall();
//		ArrayList<Job> matches = testList(answerOne, answerTwo, answerThree, ac, privatekey, jobKey);
		ArrayList<Job> matches = new ArrayList<Job>();
		matches.addAll(ac.getGitHubJobs(answerOne, answerTwo, answerThree));
		matches.addAll(ac.getAuthenticJobs(answerOne, answerTwo, answerThree, privatekey));
		matches.addAll(ac.getUsaJobs(answerOne, answerTwo, answerThree, jobKey));

//		System.out.println("size: " + matches.size());

		return new ModelAndView("job_results", "jobs", matches);
	}


	@RequestMapping("/savejob") 
	public ModelAndView saveJob(@RequestParam("jobURL") String jobURL, HttpSession session) {
		System.out.println("After Path Variable: " + jobURL);
		
		User u1 = (User) session.getAttribute("user");
		
		FavJobs fav = new FavJobs();
		fav.setUser_id(u1.getUser_id());
		fav.setJoburl(jobURL);
		jr.save(fav);
		
		Quiz quiz = qr.findByUserId(u1.getUser_id());

		String answerOne = quiz.getAnswer1();
		String answerTwo = quiz.getAnswer2();
		String answerThree = quiz.getAnswer3();
		
		ApiCall ac = new ApiCall();
		ArrayList<Job> matches = new ArrayList<Job>();
		matches.addAll(ac.getGitHubJobs(answerOne, answerTwo, answerThree));
		matches.addAll(ac.getAuthenticJobs(answerOne, answerTwo, answerThree, privatekey));
		matches.addAll(ac.getUsaJobs(answerOne, answerTwo, answerThree, jobKey));

		return new ModelAndView("job_results", "jobs", matches);
	}
	
	@RequestMapping("/favorites")
	public ModelAndView favorites(HttpSession session) {
		
		User user = (User) session.getAttribute("user");
		System.out.println(user.getFirstname());
		
		Optional<FavJobs> saved = jr.findById(user.getUser_id());
//		System.out.println(saved.get().getJobTitle());
		
		return new ModelAndView("fav_jobs", "jobs", saved);
	}


}
