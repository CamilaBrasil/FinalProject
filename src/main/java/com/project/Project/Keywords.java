package com.project.Project;

public enum Keywords {

	LEADER("leader", "director", "manager", "head"), 
	ENERGETIC("energetic", "active", "enthusiastic", "dynamic"),
	PEOPLESKILLS("people skills", "social", "cordial", "nice"), 
	FOCUS("focus", "diligence", "plan", "strive"),
	ORGANIZED("organized", "detailed", "coordinate", "systematic"),
	TEAMPLAYER("team player", "Team Work", "unity", "partnership"),
	PROJECTMANAGEMENT("project management", "administrate", "execute", "distribute"),
	CONFLICTRESOLUTION("conflict resolution", "diplomatic", "resolve", "descalate"),
	TROUBLESHOOTING("troubleshooting", "crisis management", "critical thinking", "focus"),
	POLITE("polite", "civil", "cordial", "respectful"), 
	TECHSMART("tech smart", "resourceful", "bright", "crafty"),
	PRESSURE("pressure", "stress", "tension", "grit"), 
	RELIABLE("reliable", "dependable", "responsible", "stable"),
	ADAPTABILITY("adaptability", "flexibility", "versatility", "resilient"),
	PROBLEMSOLVING("problem solving", "analytical", "rational", "thorough"),
	CREATIVITY("creativity", "imagination", "innovation", "experimenting"),
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

	public static String[] getKeywordsArray(String answer) {
		

		if (answer.equals(LEADER.keywordOne)) {
			String[] keywords = {LEADER.keywordOne, LEADER.keywordTwo,LEADER.keywordThree, LEADER.keywordFour};
			return keywords;
		} else if (answer.equals(ENERGETIC.keywordOne)) {
			String[] keywords = {ENERGETIC.keywordOne, ENERGETIC.keywordTwo, ENERGETIC.keywordThree, ENERGETIC.keywordFour};
			return keywords;
		} else if (answer.equals(PEOPLESKILLS.keywordOne)) {
			String[] keywords = {PEOPLESKILLS.keywordOne, PEOPLESKILLS.keywordTwo, PEOPLESKILLS.keywordThree, PEOPLESKILLS.keywordFour};
			return keywords;
		} else if (answer.equals(FOCUS.keywordOne)) {
			String[] keywords = {FOCUS.keywordOne, FOCUS.keywordTwo, FOCUS.keywordThree, FOCUS.keywordFour};
			return keywords;
		} else if (answer.equals(ORGANIZED.keywordOne)) {
			String[] keywords = {ORGANIZED.keywordOne, ORGANIZED.keywordTwo, ORGANIZED.keywordThree, ORGANIZED.keywordFour};
			return keywords;
		} else if (answer.equals(TEAMPLAYER.keywordOne)) {
			String[] keywords = {TEAMPLAYER.keywordOne, TEAMPLAYER.keywordTwo, TEAMPLAYER.keywordThree, TEAMPLAYER.keywordFour};
			return keywords;
		} else if (answer.equals(PROJECTMANAGEMENT.keywordOne)) {
			String[] keywords = {PROJECTMANAGEMENT.keywordOne, PROJECTMANAGEMENT.keywordTwo, PROJECTMANAGEMENT.keywordThree, PROJECTMANAGEMENT.keywordFour};
			return keywords;
		} else if (answer.equals(CONFLICTRESOLUTION.keywordOne)) {
			String[] keywords = {CONFLICTRESOLUTION.keywordOne, CONFLICTRESOLUTION.keywordTwo, CONFLICTRESOLUTION.keywordThree, CONFLICTRESOLUTION.keywordFour};
			return keywords;
		} else if (answer.equals(TROUBLESHOOTING.keywordOne)) {
			String[] keywords = {TROUBLESHOOTING.keywordOne, TROUBLESHOOTING.keywordTwo, TROUBLESHOOTING.keywordThree, TROUBLESHOOTING.keywordFour};
			return keywords;
		} else if (answer.equals(POLITE.keywordOne)) {
			String[] keywords = {POLITE.keywordOne, POLITE.keywordTwo, POLITE.keywordThree, POLITE.keywordFour};
			return keywords;
		} else if (answer.equals(TECHSMART.keywordOne)) {
			String[] keywords = {TECHSMART.keywordOne, TECHSMART.keywordTwo, TECHSMART.keywordThree, TECHSMART.keywordFour};
			return keywords;
		} else if (answer.equals(PRESSURE.keywordOne)) {
			String[] keywords = {PRESSURE.keywordOne, PRESSURE.keywordTwo, PRESSURE.keywordThree, PRESSURE.keywordFour};
			return keywords;
		} else if (answer.equals(RELIABLE.keywordOne)) {
			String[] keywords = {RELIABLE.keywordOne, RELIABLE.keywordTwo, RELIABLE.keywordThree, RELIABLE.keywordFour};
			return keywords;
		} else if (answer.equals(ADAPTABILITY.keywordOne)) {
			String[] keywords = {ADAPTABILITY.keywordOne, ADAPTABILITY.keywordTwo, ADAPTABILITY.keywordThree, ADAPTABILITY.keywordFour};
			return keywords;
		} else if (answer.equals(PROBLEMSOLVING.keywordOne)) {
			String[] keywords = {PROBLEMSOLVING.keywordOne, PROBLEMSOLVING.keywordTwo, PROBLEMSOLVING.keywordThree, PROBLEMSOLVING.keywordFour};
			return keywords;
		} else if (answer.equals(CREATIVITY.keywordOne)) {
			String[] keywords = {CREATIVITY.keywordOne, CREATIVITY.keywordTwo, CREATIVITY.keywordThree, CREATIVITY.keywordFour};
			return keywords;
		} else if (answer.equals(WORKETHIC.keywordOne)) {
			String[] keywords = {WORKETHIC.keywordOne, WORKETHIC.keywordTwo, WORKETHIC.keywordThree, WORKETHIC.keywordFour};
			return keywords;
		} else if (answer.equals(INTERPERSONALSKILLS.keywordOne)) {
			String[] keywords = {INTERPERSONALSKILLS.keywordOne, INTERPERSONALSKILLS.keywordTwo, INTERPERSONALSKILLS.keywordThree, INTERPERSONALSKILLS.keywordFour};
			return keywords;
		} else {
			return null;
		}
	}
}
