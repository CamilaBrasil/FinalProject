package com.project.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.Project.dao.UserRepo;
import com.project.Project.entity.User;

@Controller
public class UserController {
	@Autowired
	UserRepo ur;
	
	@RequestMapping("/")
	public ModelAndView index()  {
		return new ModelAndView("index");
		
	}
	
	@RequestMapping("/submitlogin")
	public ModelAndView loginPage(@RequestParam("email") String email, @RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView("index");
		User user = ur.findByEmail(email);
		if(user.getPassword().equals(password)) {

			mv.addObject("email", user.getEmail());
			mv.addObject("firstname", user.getFirstname());
			mv.addObject("lastname", user.getLastname());
			mv.addObject("zipcode", user.getZipcode());
			mv.addObject("password", user.getPassword());
		}
		
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register()  {
		return new ModelAndView("register");
	}
	
	@RequestMapping("/about")
	public ModelAndView about()  {
		return new ModelAndView("about");
	}
	
	@RequestMapping("/login")
	public ModelAndView login()  {
		return new ModelAndView("login");
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact()  {
		return new ModelAndView("contact");
	}
	
	@PostMapping("/submit")
	public ModelAndView submit(@PathVariable("firstname") String fName, @PathVariable("lastname") String lName,
			@PathVariable("email") String email, @PathVariable("zipcode") String zipcode,
			@PathVariable("password") String p1, @PathVariable("password_confirm") String p2) {
		User u1 = new User();
		
		ModelAndView mv = new ModelAndView();
		
		if(p1 == p2) {
			u1 = new User(fName, lName, email, zipcode, p1);
			ur.save(u1);
			mv.addObject("index");
			mv.addObject("firstname", u1.getFirstname());
		} else {
			mv.addObject("register");
			mv.addObject( "title", "the password must match");
		}
		
		
		
		return mv;
	}
	
}
