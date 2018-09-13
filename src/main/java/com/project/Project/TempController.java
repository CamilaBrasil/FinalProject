package com.project.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.Project.dao.QuizRepo;
import com.project.Project.dao.UserRepo;

@Controller
public class TempController {
	
	@Autowired
	UserRepo ur;
	
	@Autowired
	QuizRepo qr;
	
	
	
	//Should be moved to JobsController 
	
	@RequestMapping("/favorites")
	public ModelAndView favJobs() {
		
		
		
		return new ModelAndView("fav_jobs");
	}

}
