package com.project.Project;

public enum Keywords {

	LEADER("leader", "director", "manager", "head"), 
	ENERGETIC("energetic", "active", "enthusiastic", "dynamic"),
	FRIENDLY("friendly", "social", "cordial", "nice"), 
	FOCUS("focus", "diligence", "plan", "strive"),
	ORGANIZED("organized", "detailed", "coordinate", "systematic"),
	SUPPORTIVE("supportive", "teamwork", "unity", "partnership"),
	MANAGEMENT("management", "administrate", "execute", "distribute"),
	RESOLUTION("resolution", "diplomatic", "resolve", "descalate"),
	TROUBLESHOOTING("troubleshooting", "analytical", "critical", "focus"),
	POLITE("polite", "civil", "cordial", "respectful"), 
	RESOURCEFUL("resourceful", "complex", "bright", "crafty"),
	PRESSURE("pressure", "stress", "tension", "grit"), 
	RELIABLE("reliable", "dependable", "responsible", "stable"),
	ADAPTABILITY("adaptability", "flexibility", "versatility", "resilient"),
	ANALYTICAL("analytical", "logical", "rational", "thorough"),
	CREATIVITY("creativity", "imagination", "innovation", "experimenting"),
	ETHICAL("ethical","integrity", "responsability", "dependability"),
	PROFESSIONAL("professional","empathy", "mentoring", "diplomacy");
	

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
		} else if (answer.equals(FRIENDLY.keywordOne)) {
			String[] keywords = {FRIENDLY.keywordOne, FRIENDLY.keywordTwo, FRIENDLY.keywordThree, FRIENDLY.keywordFour};
			return keywords;
		} else if (answer.equals(FOCUS.keywordOne)) {
			String[] keywords = {FOCUS.keywordOne, FOCUS.keywordTwo, FOCUS.keywordThree, FOCUS.keywordFour};
			return keywords;
		} else if (answer.equals(ORGANIZED.keywordOne)) {
			String[] keywords = {ORGANIZED.keywordOne, ORGANIZED.keywordTwo, ORGANIZED.keywordThree, ORGANIZED.keywordFour};
			return keywords;
		} else if (answer.equals(SUPPORTIVE.keywordOne)) {
			String[] keywords = {SUPPORTIVE.keywordOne, SUPPORTIVE.keywordTwo, SUPPORTIVE.keywordThree, SUPPORTIVE.keywordFour};
			return keywords;
		} else if (answer.equals(MANAGEMENT.keywordOne)) {
			String[] keywords = {MANAGEMENT.keywordOne, MANAGEMENT.keywordTwo, MANAGEMENT.keywordThree, MANAGEMENT.keywordFour};
			return keywords;
		} else if (answer.equals(RESOLUTION.keywordOne)) {
			String[] keywords = {RESOLUTION.keywordOne, RESOLUTION.keywordTwo, RESOLUTION.keywordThree, RESOLUTION.keywordFour};
			return keywords;
		} else if (answer.equals(TROUBLESHOOTING.keywordOne)) {
			String[] keywords = {TROUBLESHOOTING.keywordOne, TROUBLESHOOTING.keywordTwo, TROUBLESHOOTING.keywordThree, TROUBLESHOOTING.keywordFour};
			return keywords;
		} else if (answer.equals(POLITE.keywordOne)) {
			String[] keywords = {POLITE.keywordOne, POLITE.keywordTwo, POLITE.keywordThree, POLITE.keywordFour};
			return keywords;
		} else if (answer.equals(RESOURCEFUL.keywordOne)) {
			String[] keywords = {RESOURCEFUL.keywordOne, RESOURCEFUL.keywordTwo, RESOURCEFUL.keywordThree, RESOURCEFUL.keywordFour};
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
		} else if (answer.equals(ANALYTICAL.keywordOne)) {
			String[] keywords = {ANALYTICAL.keywordOne, ANALYTICAL.keywordTwo, ANALYTICAL.keywordThree, ANALYTICAL.keywordFour};
			return keywords;
		} else if (answer.equals(CREATIVITY.keywordOne)) {
			String[] keywords = {CREATIVITY.keywordOne, CREATIVITY.keywordTwo, CREATIVITY.keywordThree, CREATIVITY.keywordFour};
			return keywords;
		} else if (answer.equals(ETHICAL.keywordOne)) {
			String[] keywords = {ETHICAL.keywordOne, ETHICAL.keywordTwo, ETHICAL.keywordThree, ETHICAL.keywordFour};
			return keywords;
		} else if (answer.equals(PROFESSIONAL.keywordOne)) {
			String[] keywords = {PROFESSIONAL.keywordOne, PROFESSIONAL.keywordTwo, PROFESSIONAL.keywordThree, PROFESSIONAL.keywordFour};
			return keywords;
		} else {
			return null;
		}
	}
}
