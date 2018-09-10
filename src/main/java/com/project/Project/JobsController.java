package com.project.Project;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class JobsController {

	@Value("${privatekey}")
	private String privatekey;
	
	
}
