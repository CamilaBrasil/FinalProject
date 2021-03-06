package com.project.Project;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.Project.dao.JobsRepo;
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
	@Autowired
	JobsRepo jr;

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
	public ModelAndView home(HttpSession session) {
		User user = (User) session.getAttribute("user");

		return new ModelAndView("home", "user", user);
	}

	// Calling jsp with the register form
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register");
	}

	// Submiting the registration and doing basic validation
	@PostMapping("/submit")
	public ModelAndView submit(User u1, @RequestParam("password") String p1, @RequestParam("password_confirm") String p2, HttpSession session) {

		String email = u1.getEmail();
		// Validating if the email is already register
		if (ur.findByEmail(email) != null) {
			return new ModelAndView("register", "title", "This email is being used, please enter another or log in");
			
		} else if (!p2.equals(p1)) {
			return new ModelAndView("register", "title", "The password must match");
			
		} else {
			session.setAttribute("user", u1);
			ur.save(u1);
			return new ModelAndView("sillyquestions");
		}
	}

	// Mapping only for testing
	@RequestMapping("/quiz")
	public ModelAndView quiz() {
		return new ModelAndView("sillyquestions");
	}

	@PostMapping("/submitquiz")
	public ModelAndView submitquiz(@RequestParam("quest1") String quest1, @RequestParam("quest2") String quest2, @RequestParam("quest3") String quest3, @RequestParam("quest4") String quest4, 
			@RequestParam("quest5") String quest5, @RequestParam("quest6") String quest6, HttpSession session) {
		User user = (User) session.getAttribute("user");
		Quiz quiz = new Quiz();
		quiz.setAnswer1(quest1);
		quiz.setAnswer2(quest2);
		quiz.setAnswer3(quest3);
		quiz.setAnswer4(quest4);
		quiz.setAnswer5(quest5);
		quiz.setAnswer6(quest6);
		quiz.setUserId(user.getUser_id());

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
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session, RedirectAttributes redir) {
		// invalidate clears the current user session and starts a new one.
		session.invalidate();
		
		// A flash message will only show on the very next page. Then it will go away.
		// It is useful with redirects since you can't add attributes to the mav.
		redir.addFlashAttribute("message", "Logged out.");
		return new ModelAndView("redirect:/");
	}
	
}
