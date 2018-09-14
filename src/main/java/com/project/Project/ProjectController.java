package com.project.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.project.Project.dao.QuizRepo;
import com.project.Project.dao.UserRepo;
import com.project.Project.entity.Skills;
import com.project.Project.entity.User;

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
	public void editCustomer(@RequestParam(value = "skills", required = false) String checkboxValue, @RequestParam(value ="userid") Integer id) {
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
			Skills skill = new Skills();
			skill.setSkills(skillz[i]);
			skill.setUser_id(id);
			System.out.println(skillz.length);
			System.out.println(skill);

			qr.save(skill);
		}
	}

}
