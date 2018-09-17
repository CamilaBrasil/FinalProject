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
import com.project.Project.entity.Quiz;
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

		String email = u1.getEmail();
		String password = u1.getPassword();

		// Validating if the email is already register
		if (ur.findByEmail(email) != null) {
			return new ModelAndView("register", "title", "This email is being used, please enter another or log in");

		} else if (!UserValidation.validateEmail(email)) {
			return new ModelAndView("register", "title", "Please enter a valid email");

		} else if (!UserValidation.validatePassword(password)) {
			return new ModelAndView("register", "title",
					"The password must contain at least one number, one capital letter, one lower case and be 4 digits long");
			
		} else if (!u1.getPassword().equals(p2)) {
			return new ModelAndView("register", "title", "The password must match");
			
		} else {
			ur.save(u1);
			return new ModelAndView("quiz", "user_id", u1.getUser_id());
		}
	}

	// Mapping only for testing
	@RequestMapping("/quiz")
	public ModelAndView quiz() {
		return new ModelAndView("sillyquestions");
	}

	@PostMapping("/submitquiz")
	public ModelAndView submitquiz(@RequestParam("quest1") String quest1, @RequestParam("quest2") String quest2, @RequestParam("quest3") String quest3) {

		Quiz quiz = new Quiz();
		quiz.setAnswer1(quest1);
		quiz.setAnswer2(quest2);
		quiz.setAnswer3(quest3);
		quiz.setUserId(1);
//		quiz.setSkills(varSkills);
//		quiz.setUser_id(user_id);
		System.out.println(quiz);

		qr.save(quiz);

		return new ModelAndView("home", "user_id", quiz.getUserId());
	}

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
