package com.project.Project;

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

@Controller
@SessionAttributes("email")
public class ProjectController {
	
		@Autowired
		UserRepo ur;
		QuizRepo qr;
	
//	@PostMapping("/submitquiz")
//	public ModelAndView submitquiz(Quiz quiz, @RequestParam("userid") int id) {
//
//		quiz.setId(id);
//		System.out.println(quiz);
//		
//		qr.save(quiz);
//
//		return new ModelAndView("index", "user", ur.findById(quiz.getId()));
//	}
	
	@PostMapping("/submitq")
	public void editCustomer(@RequestParam(value = "checkboxName", required = false) String checkboxValue) 
	{
	  if(checkboxValue != null)
	  {
	    System.out.println("checkbox is checked");
	  }
	  else
	  {
	    System.out.println("checkbox is not checked");
	  }
	}

}
