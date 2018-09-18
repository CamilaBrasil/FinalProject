package com.project.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.Project.dao.JobsRepo;
import com.project.Project.dao.QuizRepo;
import com.project.Project.dao.UserRepo;

@Controller
public class TestingController {

	@Autowired
	QuizRepo qr;
	@Autowired
	UserRepo ur;
	@Autowired
	JobsRepo jr;

	// Test - Retrieving keywords from the ENUM Keywords.
	//		  Parsing description and getting relevance
	@RequestMapping("/testAlgorithm")
	public void testAlgorithm() {

		String keyOne = "leader";
		String keyTwo = "problem solving";
		String keyThree = "energetic";

		String description = "Our developers create industry-leading digital work for some of the most recognized brands on the planet. A successful "
				+ "candidate will bring a track record of constantly innovating and maintaining a broad knowledge of development principles, industry "
				+ "trends, and emerging technologies. Expert-level knowledge of one or more system languages, database architecture, and Unix operating "
				+ "systems is required — experience working in an agency or project-driven environment is a plus.\r\n"
				+ "\r\n" + "Primary responsibilities:\r\n" + "\r\n"
				+ "Develop back-end solutions for data-driven executions in web, mobile, and emerging technology. Projects including but not limited to "
				+ "API development, custom content management, front-end integration, image/video rendering, and other complex builds.\r\n"
				+ "Lead the way on project architecture and database structure while utilizing best practices in performance, stability, scalability and "
				+ "security.\r\n"
				+ "Contribute to concept development with multi-disciplinary teams of developers, creatives, and producers.\r\n"
				+ "Maintain proficiency in the widest possible range of back-end web development areas including Python, Java, shell scripting, database "
				+ "architecture, and Unix operating systems. Our front-end developers will lean on you to design API services, set up deployment servers, "
				+ "and more.\r\n"
				+ "A fundamental ability to use HTML, CSS, and JavaScript in various scenarios.\r\n"
				+ "Bonus points for knowledge of Redis, Gulp, Google Cloud Services (AppEngine, Compute Engine, Datastore, etc.), Android/iOS development, "
				+ "virtualization (e.g., Docker).\r\n"
				+ "This is a full-time position at our office in downtown Norfolk, VA. Grow offers paid relocation and temporary housing for selected "
				+ "candidates.\r\n"
				+ "\r\n" + "Benefits\r\n" + "\r\n"
				+ "Amazing clients and an inspiring environment come standard, but the best part is finding yourself among a close-knit group of 40+ "
				+ "incredibly talented and motivated colleagues. We’re part of a community of like-minded people in the Norfolk / Virginia Beach area who "
				+ "spend our time creating great work and building a culture around us—with lovely beaches, urban amenities, and family-friendly opportunities "
				+ "throughout the region.\r\n"
				+ "\r\n"
				+ "You’ll start with a full month of paid vacation and holiday leave, including two weeks in which the company pauses operations—one at "
				+ "midsummer, and one at the holidays. A wealth of additional company benefits include health, dental, matching 401k, disability, paid "
				+ "training, and more.";
		
		String[] descArray = Algorithm.parseDesc(description);
		
		System.out.println(Algorithm.getKeywords(keyOne, keyTwo, keyThree));
		System.out.println(descArray.toString());
		System.out.println("Relevance: " + Algorithm.getRelevance(descArray));
		
	}

}
