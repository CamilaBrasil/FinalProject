package com.project.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.project.Project.dao.QuizRepo;
import com.project.Project.entity.ParentJson;
import com.project.Project.entity.Skills;

@Controller
public class JobsController {

	@Autowired
	QuizRepo qr;
	
	@Value("${privatekey}")
	private String privatekey;

	@GetMapping("/jobid")
	public ModelAndView jobId() {
		RestTemplate restTemplate = new RestTemplate();

		ParentJson test = restTemplate.getForObject("https://authenticjobs.com/api/?api_key=" + privatekey
				+ "&method=aj.jobs.search&keywords=java&perpage=1&format=json", ParentJson.class);

		System.out.println(test);
		return new ModelAndView("jobid", "jobdata", test);
	}
	
//	@RequestMapping("/submitquiz1")
//	public ModelAndView jobList(Quiz quiz) {
//		ModelAndView mc = new ModelAndView("job_results");
//		
//		System.out.println(quiz);
//		qr.save(quiz);
//		return new ModelAndView ("job_results");
//	}

}
