package com.project.Project;

import java.util.List;

public class Algorithm {
	
	private static String[] keywordsArray1;
	private static String[] keywordsArray2;
	private static String[] keywordsArray3;

	// Getting answers and sending back combinations
	@SuppressWarnings("null")
	public static List<String> getKeywords(String keyOne, String keyTwo, String keyThree) {
	
		keywordsArray1 = Keywords.getKeywordsArray(keyOne);
		keywordsArray2 = Keywords.getKeywordsArray(keyTwo);
		keywordsArray3 = Keywords.getKeywordsArray(keyThree);
		
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

		String[] descArray = parseDesc(desc);

		return null;
//				getRelevance(parseDesc(desc));
	}

	// Parsing the description
	public static String[] parseDesc(String desc) {
		String regex = "[ .,?!]+";
		String[] words = desc.split(regex);

		return words;
	}

//	private static String getRelevance(String[] descArray) {
//	
//		int occurrencyOne;
//		int occurrencyTwo;
//		int occurrencyThree;
//		
//		for (int i = 0; i < keywords.length; i++) {
//			
//			for (int j = 0; j < descArray.length; j++) {
//				for (int k = 0; k < .length; k++) {
//					
//				}
//				
//			}
//			
//		}
//		
//		
//		return null;
//	}

	// TODO Get percentage per keyword
	// TODO return relevance per keyword for each job

}
