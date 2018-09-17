package com.project.Project.entity;

import java.util.regex.Pattern;

import ch.qos.logback.core.boolex.Matcher;

public class Algorithm {
	private String[][] keyArray = {
			{"Leader", "director", "manager", "head"},
			{"Energetic", "active", "enthusiastic", "dynamic"},
			{"People Skills", "social", "cordial", "nice"},
			{"Focus", "diligence", "plan", "strive"},
			{"Organized", "detailed", "coordinate", "systematic"},
			{"Team Player", "Team Work", "unity", "partnership"},
			{"Project Management", "administrate", "execute", "distribute"},
			{"Conflict resolution", "diplomatic", "resolve", "descalate"},
			{"Trouble Shooting", "crisis management", "critical thinking", "focus"},
			{"Polite", "civil", "cordial", "respectful"},
			{"Tech Smart", "resourceful", "bright", "crafty"},
			{"Pressure",  "stress", "tension", "grit"},
			{"Reliable", "dependable", "responsible", "stable"},
			{"Adaptability", "flexibility", "versatility", "resilient"},
			{"Problem Solving", "analytical", "rational", "thorough"},
	};

//TODO Get the numbers from quiz and send back a keyword 
	public String getKeyword (int row) {
		String keyword = keyArray[row][0];
		return keyword;
	}
	
	
//TODO Get a job description - Parse, do other steps and return relevance per keyword for each job
	public int getResult(String desc) {
		parseDesc(desc);
		
		
		return 1;
	}
	
//TODO Count all 3 keywords found in the description
	public int parseDesc(String desc) {
		String regex = "[ .,?!]+";
		String[] words = desc.split(regex);
		
		
		
		return 1;
	}
//TODO Get percentage per keyword 
//TODO return relevance per keyword for each job

}
