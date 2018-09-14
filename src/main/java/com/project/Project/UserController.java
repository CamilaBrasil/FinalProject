package com.project.Project;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.project.Project.dao.QuizRepo;
import com.project.Project.dao.UserRepo;
import com.project.Project.entity.Skills;
import com.project.Project.entity.User;

@Controller
@SessionAttributes("user")
public class UserController {
	@Autowired
	UserRepo ur;

	@Autowired
	QuizRepo qr;

	// Home before user is register/login
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");

	}

	// Form to login
	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	// Submitting login and validating
	@PostMapping("/submitlogin")
	public ModelAndView loginPage(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session) {

		User user = ur.findByEmail(email);

		if (user != null) {
			if (user.getPassword().equals(password)) {
				session.setAttribute("user", user);

				return new ModelAndView("home", "user", user);
			} else {
				return new ModelAndView("login", "title", "The password does not match");
			}
		} else {
			return new ModelAndView("login", "title", "The account was not found, check if the email is correct.");
		}
	}

	// Home page after the user register/login
	@RequestMapping("/home")
	public ModelAndView home(@RequestParam("user_id") Integer user_id) {
//		User user = ur.findByEmail(email);

		return new ModelAndView("home", "user_id", user_id);
	}

	// Calling jsp with the register form
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register");
	}

	// Submiting the registration and doing basic validation
	@PostMapping("/submit")
	public ModelAndView submit(User u1, @RequestParam("password_confirm") String p2) {

		// Validating if the email is already register
		System.out.println(u1);
		if (ur.findByEmail(u1.getEmail()) != null) {

			return new ModelAndView("register", "title", "This email is being used, please enter another or login");
		}

		// Validating if the password and the confirm password are matching
		if (u1.getPassword().equals(p2)) {
			ur.save(u1);
			return new ModelAndView("quiz", "user_id", u1.getUser_id());
		} else {
			return new ModelAndView("register", "title", "The password must match");
		}

	}

//	@RequestMapping("/teste")
//	public ModelAndView teste1() {
//
//		Skills quiz = new Skills();
//		quiz.setSkills("none, none2, none3");
//		quiz.setUser_id(2);
//
//		qr.save(quiz);
//
//		return new ModelAndView("FrontBack", "quiz", quiz);
//	}


	// TODO it needs to be created a second jsp for when already connected
	@RequestMapping("/about")
	public ModelAndView about() {
		return new ModelAndView("about");
	}

	// TODO it needs to be created a second jsp for when already connected
	@RequestMapping("/contact")
	public ModelAndView contact() {
		return new ModelAndView("contact");
	}

	@RequestMapping("/favorites")
	public ModelAndView favJobs(User user) {

		Optional<User> u1 = ur.findById(user.getUser_id());
		return new ModelAndView("fav_jobs", "jobs", u1.get().getFavJobs());
	}

}
