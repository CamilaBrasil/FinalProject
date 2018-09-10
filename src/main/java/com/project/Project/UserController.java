package com.project.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
		return new ModelAndView("index");
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact()  {
		return new ModelAndView("contact");
	}
	
}
