package com.project.Project;

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

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");

	}

	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	@PostMapping("/submitlogin")
	public ModelAndView loginPage(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session) {

		//ModelAndView mv = new ModelAndView("index");
		User user = ur.findByEmail(email);

		if (user != null) {
			if (user.getPassword().equals(password)) {
				session.setAttribute("user", user);

//			mv.addObject("firstname", user.getFirstname());
//			mv.addObject("lastname", user.getLastname());
//			mv.addObject("zipcode", user.getZipcode());
//			mv.addObject("password", user.getPassword());

				return new ModelAndView("index");
			} else {
				return new ModelAndView("login", "title", "The password does not match");
			}
		} else {
			return new ModelAndView("login", "title", "The account was not found, check if the email is correct.");
		}
	}

	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register");
	}

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
			return new ModelAndView("quiz", "user", u1);
		} else {

			return new ModelAndView("register", "title", "the password must match");
		}

	}

	@RequestMapping("/quiz")
	public ModelAndView quiz() {
		return new ModelAndView("quiz");
	}

	@PostMapping("/submitquiz")
	public ModelAndView submitquiz(Quiz quiz, @RequestParam("userid") int id) {

		quiz.setId(id);
		System.out.println(quiz);
		
		qr.save(quiz);

		return new ModelAndView("index", "user", ur.findById(quiz.getId()));
	}

	@RequestMapping("/about")
	public ModelAndView about() {
		return new ModelAndView("about");
	}

	@RequestMapping("/contact")
	public ModelAndView contact() {
		return new ModelAndView("contact");
	}

}
