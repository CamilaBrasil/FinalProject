package com.project.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.project.Project.dao.QuizRepo;
import com.project.Project.dao.UserRepo;

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
	public void editCustomer(@RequestParam(value = "skills", required = false) String checkboxValue) {
		if (checkboxValue != null) {
			System.out.println("checkbox is checked");
		} else {
			System.out.println("checkbox is not checked");
		}
		System.out.println(checkboxValue);
		System.out.println("test1");

		String[] skillz = checkboxValue.split(",");
		System.out.println(skillz.toString());
		System.out.println("test2");

		for(int i =0; i < skillz.length;i++) {
			System.out.println(skillz.length);
			System.out.println(skillz[i]);

			qr.save(skillz[i]);
		}

	}

}
