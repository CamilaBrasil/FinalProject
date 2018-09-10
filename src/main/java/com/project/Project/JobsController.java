package com.project.Project;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JobsController {

	@Value("${privatekey}")
	private String privatekey;
	
	
	@GetMapping("/jobid")
	public ModelAndView jobId() {
		
		
		return new ModelAndView("jobid");
	}
	
}
