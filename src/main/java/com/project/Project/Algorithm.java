package com.project.Project;

import java.util.List;

public class Algorithm {

	private static String[] leader = { "Leader", "director", "manager", "head" };
	private static String[] energetic = { "Energetic", "active", "enthusiastic", "dynamic" };
	private static String[] peopleSkills = { "People Skills", "social", "cordial", "nice" };
	private static String[] focus = { "Focus", "diligence", "plan", "strive" };
	private static String[] organized = { "Organized", "detailed", "coordinate", "systematic" };
	private static String[] teamPlayer = { "Team Player", "Team Work", "unity", "partnership" };
	private static String[] projectManagement = { "Project Management", "administrate", "execute", "distribute" };
	private static String[] conflictResolution = { "Conflict resolution", "diplomatic", "resolve", "descalate" };
	private static String[] troubleShooting = { "Trouble Shooting", "crisis management", "critical thinking", "focus" };
	private static String[] Polite = { "Polite", "civil", "cordial", "respectful" };
	private static String[] techSmart = { "Tech Smart", "resourceful", "bright", "crafty" };
	private static String[] pressure = { "Pressure", "stress", "tension", "grit" };
	private static String[] Reliable = { "Reliable", "dependable", "responsible", "stable" };
	private static String[] adaptability = { "Adaptability", "flexibility", "versatility", "resilient"};
	private static String[] energetic =
	private static String[] energetic =
	private static String[] energetic =
	private static String[] energetic =

, ,
			},
			{ "Problem Solving", "analytical", "rational", "thorough" }, };

	static Integer[] keywords = new Integer[3];

	// TODO Get the numbers from quiz and send back a keyword
	@SuppressWarnings("null")
	public static List<String> getKeywords(int keyOne, int keyTwo, int keyThree) {
		keywords[0] = keyOne;
		keywords[1] = keyTwo;
		keywords[2] = keyThree;

		String[] keywordsArray1 = { keyArray[keyOne][0], keyArray[keyOne][1], keyArray[keyOne][2],
				keyArray[keyOne][3] };
		String[] keywordsArray2 = { keyArray[keyTwo][0], keyArray[keyTwo][1], keyArray[keyTwo][2],
				keyArray[keyTwo][3] };
		String[] keywordsArray3 = { keyArray[keyThree][0], keyArray[keyThree][1], keyArray[keyThree][2],
				keyArray[keyThree][3] };

		String keyword1 = null;
		String keyword2 = null;
		String keyword3 = null;

		List<String> allKeywordsComb = null;

		// Getting combinations

		// All 3 possible keywords
		for (int i = 0; i < keywordsArray1.length; i++) {
			keyword1 = keywordsArray1[i];
			for (int j = 0; j < keywordsArray2.length; j++) {
				keyword2 = keywordsArray2[j];
				for (int k = 0; k < keywordsArray3.length; k++) {
					keyword3 = keywordsArray3[k];
				}
			}

			String combination = keyword1 + " " + keyword2 + " " + keyword3;
			allKeywordsComb.add(combination);
		}

		// 2 keywords - First and second array;
		for (int i = 0; i < keywordsArray1.length; i++) {
			keyword1 = keywordsArray1[i];
			for (int j = 0; j < keywordsArray2.length; j++) {
				keyword2 = keywordsArray2[j];
			}

			String combination = keyword1 + " " + keyword2;
			allKeywordsComb.add(combination);
		}

		// 2 keywords - Second and third array;
		for (int i = 0; i < keywordsArray2.length; i++) {
			keyword1 = keywordsArray2[i];
			for (int j = 0; j < keywordsArray3.length; j++) {
				keyword2 = keywordsArray3[j];
			}

			String combination = keyword1 + " " + keyword2;
			allKeywordsComb.add(combination);
		}

		// 2 keywords - First and third array;
		for (int i = 0; i < keywordsArray1.length; i++) {
			keyword1 = keywordsArray1[i];
			for (int j = 0; j < keywordsArray3.length; j++) {
				keyword2 = keywordsArray3[j];
			}

			String combination = keyword1 + " " + keyword2;
			allKeywordsComb.add(combination);
		}

		// Single keywords - First array
		for (int i = 0; i < keywordsArray1.length; i++) {
			allKeywordsComb.add(keywordsArray1[i]);
		}

		// Single keywords - Second array
		for (int i = 0; i < keywordsArray2.length; i++) {
			allKeywordsComb.add(keywordsArray2[i]);
		}

		// Single keywords - Thrid array
		for (int i = 0; i < keywordsArray3.length; i++) {
			allKeywordsComb.add(keywordsArray3[i]);
		}

		return allKeywordsComb;
	}

	// TODO Get a job description - Parse, do other steps and return relevance per
	// keyword for each job
	public static String getResult(String desc) {

//		String[] descArray = parseDesc(desc);

		return getRelevance(parseDesc(desc));
	}

	// Parsing the description
	public static String[] parseDesc(String desc) {
		String regex = "[ .,?!]+";
		String[] words = desc.split(regex);

		return words;
	}

	private static String getRelevance(String[] descArray) {
	
		int occurrencyOne;
		int occurrencyTwo;
		int occurrencyThree;
		
		for (int i = 0; i < keywords.length; i++) {
			
			for (int j = 0; j < descArray.length; j++) {
				for (int k = 0; k < .length; k++) {
					
				}
				
			}
			
		}
		
		
		return null;
	}

	// TODO Get percentage per keyword
	// TODO return relevance per keyword for each job

}
