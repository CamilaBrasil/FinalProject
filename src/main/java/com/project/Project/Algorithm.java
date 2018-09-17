package com.project.Project;

import java.util.List;

public class Algorithm {
	private static String[][] keyArray = { { "Leader", "director", "manager", "head" },
			{ "Energetic", "active", "enthusiastic", "dynamic" }, { "People Skills", "social", "cordial", "nice" },
			{ "Focus", "diligence", "plan", "strive" }, { "Organized", "detailed", "coordinate", "systematic" },
			{ "Team Player", "Team Work", "unity", "partnership" },
			{ "Project Management", "administrate", "execute", "distribute" },
			{ "Conflict resolution", "diplomatic", "resolve", "descalate" },
			{ "Trouble Shooting", "crisis management", "critical thinking", "focus" },
			{ "Polite", "civil", "cordial", "respectful" }, { "Tech Smart", "resourceful", "bright", "crafty" },
			{ "Pressure", "stress", "tension", "grit" }, { "Reliable", "dependable", "responsible", "stable" },
			{ "Adaptability", "flexibility", "versatility", "resilient" },
			{ "Problem Solving", "analytical", "rational", "thorough" }, };

	// TODO Get the numbers from quiz and send back a keyword
	public static List<String> getKeywords(int keyOne, int keyTwo, int keyThree) {
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
		parseDesc(desc);

		return "";
	}

	// TODO Count all 3 keywords found in the description
	public static int parseDesc(String desc) {
		String regex = "[ .,?!]+";
		String[] words = desc.split(regex);

		return 1;
	}
	// TODO Get percentage per keyword
	// TODO return relevance per keyword for each job

}
