package com.project.Project;

import java.util.ArrayList;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
		
		ArrayList<Job> matches = new ArrayList<Job>();
		Quiz quiz = qr.findByUserId(u1.getUser_id());

		String answerOne = quiz.getAnswer1();
		String answerTwo = quiz.getAnswer2();
		String answerThree = quiz.getAnswer3();
		
		ApiCall ac = new ApiCall();
		
		matches.addAll(ac.getGitHubJobs(answerOne, answerTwo, answerThree));
		matches.addAll(ac.getAuthenticJobs(answerOne, answerTwo, answerThree, privatekey));
		matches.addAll(ac.getUsaJobs(answerOne, answerTwo, answerThree, jobKey));

//		System.out.println("size: " + matches.size());

		return new ModelAndView("job_results", "jobs", matches);
	}


	@RequestMapping("/savejob")
	public ModelAndView saveJob(Job job, HttpSession session, ArrayList<Job> matches) {
		
		User user = (User) session.getAttribute("user");
		
//		FavJobs fav = new FavJobs(user.getUser_id(), job.getJobTitle(), job.getKeywords(), job.getJobURL(), job.getDesc(), job.getLocation());
		FavJobs fav = new FavJobs();
		fav.setUser_id(user.getUser_id());
		fav.setJobTitle(job.getJobTitle());
		fav.setDescription(job.getDesc());
		jr.save(fav);

		return new ModelAndView("job_results", "jobs", matches);
	}
	
	@RequestMapping("/favorites")
	public ModelAndView favorites(HttpSession session) {
		
		User user = (User) session.getAttribute("user");
		
		Optional<FavJobs> saved = jr.findById(user.getUser_id());
		
		return new ModelAndView("fav_jobs", "jobs", saved);
	}


}
