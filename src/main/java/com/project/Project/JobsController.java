package com.project.Project;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
		
		
		Quiz quiz = qr.findByUserId(u1.getUser_id());

		String answerOne = quiz.getAnswer1();
		String answerTwo = quiz.getAnswer2();
		String answerThree = quiz.getAnswer3();
		String answerFour = quiz.getAnswer5();
		String answerFive = quiz.getAnswer5();
		String answerSix = quiz.getAnswer6();
		
		ApiCall ac = new ApiCall();
//		ArrayList<Job> matches = testList(answerOne, answerTwo, answerThree, ac, privatekey, jobKey);
		ArrayList<Job> matches = new ArrayList<Job>();
		matches.addAll(ac.getGitHubJobs(answerOne, answerTwo, answerThree, answerFour, answerFive, answerSix));
		matches.addAll(ac.getAuthenticJobs(answerOne, answerTwo, answerThree, answerFour, answerFive, answerSix, privatekey));
		matches.addAll(ac.getUsaJobs(answerOne, answerTwo, answerThree, answerFour, answerFive, answerSix, jobKey));

//		System.out.println("size: " + matches.size());

		return new ModelAndView("job_results", "jobs", matches);
	}


	@RequestMapping("/savejob/{index}") 
	public ModelAndView saveJob(@PathVariable("index") int index, HttpSession session) {
//		System.out.println("After Path Variable: " + u1.getUser_id());
		
		User u1 = (User) session.getAttribute("user");
		
		Quiz quiz = qr.findByUserId(u1.getUser_id());

		String answerOne = quiz.getAnswer1();
		String answerTwo = quiz.getAnswer2();
		String answerThree = quiz.getAnswer3();
		String answerFour = quiz.getAnswer4();
		String answerFive = quiz.getAnswer5();
		String answerSix = quiz.getAnswer6();
		
		
		ApiCall ac = new ApiCall();
		ArrayList<Job> matches = new ArrayList<Job>();
		matches.addAll(ac.getGitHubJobs(answerOne, answerTwo, answerThree, answerFour, answerFive, answerSix));
		matches.addAll(ac.getAuthenticJobs(answerOne, answerTwo, answerThree, answerFour, answerFive, answerSix, privatekey));
		matches.addAll(ac.getUsaJobs(answerOne, answerTwo, answerThree, answerFour, answerFive, answerSix, jobKey));

		
		FavJobs fav = new FavJobs();
		fav.setUserid(u1.getUser_id());
		System.out.println(u1.getUser_id());
		fav.setJoburl(matches.get(index).getJoburl());
		System.out.println(fav.getJoburl());
		jr.save(fav);
		

		
	
		return new ModelAndView("job_results", "jobs", matches);
	}
	
	@RequestMapping("/favorites")
	public ModelAndView favorites(HttpSession session) {
		
		User user = (User) session.getAttribute("user");
		
//		System.out.println(user.getFirstname());
//		System.out.println(saved.get().getJobTitle());
		
		return new ModelAndView("fav_jobs", "jobs", jr.findByUserid(user.getUser_id()));
	}

	@RequestMapping("/description/{desc}")
	public ModelAndView openDesc (@PathVariable("desc") String desc) {
		return new ModelAndView ("description", "desc", desc);
	}
	
}
