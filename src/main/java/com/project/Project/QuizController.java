package com.project.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.Project.dao.QuizRepo;
import com.project.Project.entity.Skills;

@Controller
public class QuizController {
	
	@Autowired
	QuizRepo qr;

	// Mapping only for testing
	@RequestMapping("/quiz")
	public ModelAndView quiz() {
		return new ModelAndView("quiz");
	}

	@PostMapping("/submitquiz")
	public ModelAndView submitquiz(@RequestParam("skills") String varSkills, @RequestParam("user_id") Integer user_id) {

		Skills quiz = new Skills();
		quiz.setSkills(varSkills);
		quiz.setUser_id(user_id);
		System.out.println(quiz);

		qr.save(quiz);

		return new ModelAndView("home", "user_id", quiz.getUserId());
	}
}
