package com.project.Project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.Project.dao.JobsRepo;
import com.project.Project.dao.UserRepo;
import com.project.Project.entity.FavJobs;

@Controller
public class TempController {
	
	@Autowired
	//UserRepo ur;
//	QuizRepo qr;
	JobsRepo jr;
	
	
	
	//Should be moved to JobsController 
	
//	@RequestMapping("/favorites")
//	public ModelAndView favJobs() {
//		
//		List<FavJobs> jobs = ur.findFavJobsListByUser_id(16);
//		System.out.println(jobs.toString());
//		
//		return new ModelAndView("fav_jobs", "jobs", jobs);
//	}

}
