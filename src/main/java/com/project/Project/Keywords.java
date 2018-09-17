package com.project.Project;

public enum Keywords {

	LEADER("leader", "director", "manager", "head"), 
	ENERGETIC("Energetic", "active", "enthusiastic", "dynamic"),
	PEOPLESKILLS("People Skills", "social", "cordial", "nice"), 
	FOCUS("Focus", "diligence", "plan", "strive"),
	ORGANIZED("Organized", "detailed", "coordinate", "systematic"),
	TEAMPLAYER("Team Player", "Team Work", "unity", "partnership"),
	PROJECTMANAGEMENT("Project Management", "administrate", "execute", "distribute"),
	CONFLICTRESOLUTION("Conflict resolution", "diplomatic", "resolve", "descalate"),
	TROUBLESHOOTING("Trouble Shooting", "crisis management", "critical thinking", "focus"),
	POLITE("Polite", "civil", "cordial", "respectful"), 
	TECHSMART("Tech Smart", "resourceful", "bright", "crafty"),
	PRESSURE("Pressure", "stress", "tension", "grit"), 
	RELIABLE("Reliable", "dependable", "responsible", "stable"),
	ADAPTABILITY("Adaptability", "flexibility", "versatility", "resilient"),
	PROBLEMSOLVING("Problem Solving", "analytical", "rational", "thorough"),
	CREATIVITY("Creativity", "imagination", "innovation", "experimenting"),
	WORKETHIC("work ethic","integrity", "responsability", "dependability"),
	INTERPERSONALSKILLS("inter personal skills","empathy", "mentoring", "diplomacy");
	

	private String keywordOne;
	private String keywordTwo;
	private String keywordThree;
	private String keywordFour;

	private Keywords(String keywordOne, String keywordTwo, String keywordThree, String keywordFour) {
		this.keywordOne = keywordOne;
		this.keywordTwo = keywordTwo;
		this.keywordThree = keywordThree;
		this.keywordFour = keywordFour;
	}

	public String[] keywordsArray(String answer) {
		

		if (answer.equals(LEADER.keywordOne)) {
			String[] keywords = {LEADER.keywordOne, LEADER.keywordTwo,LEADER.keywordThree, LEADER.keywordFour};
			return keywords;
		} else if (answer.equals(ENERGETIC.keywordOne)) {
			String[] keywords = {ENERGETIC.keywordOne, ENERGETIC.keywordTwo, ENERGETIC.keywordThree, ENERGETIC.keywordFour};
			return keywords;
		} else if (answer.equals(PEOPLESKILLS.keywordOne)) {
			String[] keywords =  = {PEOPLESKILLS.keywordOne, PEOPLESKILLS.keywordTwo, PEOPLESKILLS.keywordThree, PEOPLESKILLS.keywordFour};
			return keywords;
		} else if (answer.equals(FOCUS.keywordOne)) {
			String[] keywords = {FOCUS.keywordOne, FOCUS.keywordTwo, FOCUS.keywordThree, FOCUS.keywordFour};
			return keywords;
		} else if (answer.equals(ORGANIZED.keywordOne)) {
			String[] keywords = {ORGANIZED.keywordOne, ORGANIZED.keywordTwo, ORGANIZED.keywordThree;
			keywords[3] = ORGANIZED.keywordFour;
			return keywords;
		} else if (answer.equals(TEAMPLAYER.keywordOne)) {
			String[] keywords = TEAMPLAYER.keywordOne;
			keywords[1] = TEAMPLAYER.keywordTwo;
			keywords[2] = TEAMPLAYER.keywordThree;
			keywords[3] = TEAMPLAYER.keywordFour;
			return keywords;
		} else if (answer.equals(PROJECTMANAGEMENT.keywordOne)) {
			String[] keywords = PROJECTMANAGEMENT.keywordOne;
			keywords[1] = PROJECTMANAGEMENT.keywordTwo;
			keywords[2] = PROJECTMANAGEMENT.keywordThree;
			keywords[3] = PROJECTMANAGEMENT.keywordFour;
			return keywords;
		} else if (answer.equals(CONFLICTRESOLUTION.keywordOne)) {
			String[] keywords = CONFLICTRESOLUTION.keywordOne;
			keywords[1] = CONFLICTRESOLUTION.keywordTwo;
			keywords[2] = CONFLICTRESOLUTION.keywordThree;
			keywords[3] = CONFLICTRESOLUTION.keywordFour;
			return keywords;
		} else if (answer.equals(PROJECTMANAGEMENT.keywordOne)) {
			keywords[0] = PROJECTMANAGEMENT.keywordOne;
			keywords[1] = PROJECTMANAGEMENT.keywordTwo;
			keywords[2] = PROJECTMANAGEMENT.keywordThree;
			keywords[3] = PROJECTMANAGEMENT.keywordFour;
			return keywords;
		} else if (answer.equals(PROJECTMANAGEMENT.keywordOne)) {
			keywords[0] = PROJECTMANAGEMENT.keywordOne;
			keywords[1] = PROJECTMANAGEMENT.keywordTwo;
			keywords[2] = PROJECTMANAGEMENT.keywordThree;
			keywords[3] = PROJECTMANAGEMENT.keywordFour;
			return keywords;
		} else if (answer.equals(PROJECTMANAGEMENT.keywordOne)) {
			keywords[0] = PROJECTMANAGEMENT.keywordOne;
			keywords[1] = PROJECTMANAGEMENT.keywordTwo;
			keywords[2] = PROJECTMANAGEMENT.keywordThree;
			keywords[3] = PROJECTMANAGEMENT.keywordFour;
			return keywords;
		} else if (answer.equals(PROJECTMANAGEMENT.keywordOne)) {
			keywords[0] = PROJECTMANAGEMENT.keywordOne;
			keywords[1] = PROJECTMANAGEMENT.keywordTwo;
			keywords[2] = PROJECTMANAGEMENT.keywordThree;
			keywords[3] = PROJECTMANAGEMENT.keywordFour;
		} else if (answer.equals(PROJECTMANAGEMENT.keywordOne)) {
			keywords[0] = PROJECTMANAGEMENT.keywordOne;
			keywords[1] = PROJECTMANAGEMENT.keywordTwo;
			keywords[2] = PROJECTMANAGEMENT.keywordThree;
			keywords[3] = PROJECTMANAGEMENT.keywordFour;
		} else if (answer.equals(PROJECTMANAGEMENT.keywordOne)) {
			keywords[0] = PROJECTMANAGEMENT.keywordOne;
			keywords[1] = PROJECTMANAGEMENT.keywordTwo;
			keywords[2] = PROJECTMANAGEMENT.keywordThree;
			keywords[3] = PROJECTMANAGEMENT.keywordFour;
		} else if (answer.equals(PROJECTMANAGEMENT.keywordOne)) {
			keywords[0] = PROJECTMANAGEMENT.keywordOne;
			keywords[1] = PROJECTMANAGEMENT.keywordTwo;
			keywords[2] = PROJECTMANAGEMENT.keywordThree;
			keywords[3] = PROJECTMANAGEMENT.keywordFour;
		} else if (answer.equals(PROJECTMANAGEMENT.keywordOne)) {
			keywords[0] = PROJECTMANAGEMENT.keywordOne;
			keywords[1] = PROJECTMANAGEMENT.keywordTwo;
			keywords[2] = PROJECTMANAGEMENT.keywordThree;
			keywords[3] = PROJECTMANAGEMENT.keywordFour;
		} 
	}

}
