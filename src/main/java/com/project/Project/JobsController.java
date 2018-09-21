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

	// Authentic Job
	@Value("${privatekey}")
	private String privatekey;

	@Value("${usajobs.key}")
	String jobKey;

	@RequestMapping("/findJobs")
	public ModelAndView matches(HttpSession session) {

		User u1 = (User) session.getAttribute("user");

		//Set<Quiz> quiz = qr.findAllById(u1.getUser_id());
		Quiz quiz = qr.findByUserId(u1.getUser_id());

		String answerOne = quiz.getAnswer1();
		String answerTwo = quiz.getAnswer2();
		String answerThree = quiz.getAnswer3();
		String answerFour = quiz.getAnswer5();
		String answerFive = quiz.getAnswer5();
		String answerSix = quiz.getAnswer6();

		ApiCall ac = new ApiCall();
		ArrayList<Job> matches = new ArrayList<Job>();
		matches.addAll(ac.getGitHubJobs(answerOne, answerTwo, answerThree, answerFour, answerFive, answerSix));
		matches.addAll(
				ac.getAuthenticJobs(answerOne, answerTwo, answerThree, answerFour, answerFive, answerSix, privatekey));
		matches.addAll(ac.getUsaJobs(answerOne, answerTwo, answerThree, answerFour, answerFive, answerSix, jobKey));

		return new ModelAndView("job_results", "jobs", matches);
	}

	@RequestMapping("/savejob/{title}")
	public ModelAndView saveJob(@PathVariable("title") String title, HttpSession session) {

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
		matches.addAll(
				ac.getAuthenticJobs(answerOne, answerTwo, answerThree, answerFour, answerFive, answerSix, privatekey));
		matches.addAll(ac.getUsaJobs(answerOne, answerTwo, answerThree, answerFour, answerFive, answerSix, jobKey));

		for (int i = 0; i < matches.size(); i++) {
			if (title.equals(matches.get(i).getJobTitle())) {
				FavJobs fav = new FavJobs();
				fav.setJoburl(matches.get(i).getJoburl());
				fav.setUserid(u1.getUser_id());
				jr.save(fav);
				break;
			}
		}

		return new ModelAndView("job_results", "jobs", matches);
	}

	@RequestMapping("/favorites")
	public ModelAndView favorites(HttpSession session) {

		User user = (User) session.getAttribute("user");

		return new ModelAndView("fav_jobs", "jobs", jr.findByUserid(user.getUser_id()));
	}

}
