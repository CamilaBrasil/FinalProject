package com.project.Project;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {
	
	private static String[] keywordsArray1;
	private static String[] keywordsArray2;
	private static String[] keywordsArray3;

	// Getting answers and sending back combinations
	@SuppressWarnings("null")
	public static List<String> getKeywords(String keyOne, String keyTwo, String keyThree) {
	
		keywordsArray1 = Keywords.getKeywordsArray(keyOne);
//		System.out.println("Array one: " + keywordsArray1[0] + " "+ keywordsArray1[1] + " "+ keywordsArray1[2] + " "+ keywordsArray1[3]);
		keywordsArray2 = Keywords.getKeywordsArray(keyTwo);
//		System.out.println("Array two: " + keywordsArray2[0] + " "+ keywordsArray2[1] + " "+ keywordsArray2[2] + " "+ keywordsArray2[3]);
		keywordsArray3 = Keywords.getKeywordsArray(keyThree);
//		System.out.println("Array three: " + keywordsArray3[0] + " "+ keywordsArray3[1] + " "+ keywordsArray3[2] + " "+ keywordsArray3[3]);
		
		String keyword1 = "";
		String keyword2 = "";
		String keyword3 = "";

		List<String> allKeywordsComb = new ArrayList<>();

		// Getting combinations

		// All 3 possible keywords
		for (int i = 0; i < keywordsArray1.length; i++) {
//			System.out.println("loop in i " + i);
			keyword1 = keywordsArray1[i];
//			System.out.println("Word 1: " + keywordsArray1[i]);
			
			for (int j = 0; j < keywordsArray2.length; j++) {
//				System.out.println("loop in j " + j);
				keyword2 = keywordsArray2[j];
//				System.out.println("Word 2: " + keywordsArray2[j]);
				
				for (int k = 0; k < keywordsArray3.length; k++) {
//					System.out.println("loop in k " + k);
					keyword3 = keywordsArray3[k];
//					System.out.println("Word 3: " + keywordsArray3[k]);
					
					String combination = keyword1 + " " + keyword2 + " " + keyword3;
//					System.out.println("Combination: " + combination);
					allKeywordsComb.add(combination);
				}
			}


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

		
		return getRelevance(parseDesc(desc));
	}

	// Parsing the description
	public static String[] parseDesc(String desc) {
		
//		' ', '\t'
		String regex = "[ .,?!]+";
		String[] words = desc.split(regex);

		System.out.println("Parsed desc" + words[30] + words[31] +  words[32] +  words[33] + words[34]);
		return words;
	}

	private static String getRelevance(String[] descArray) {
	
		int occurrenceOne = 0;
		int occurrenceTwo = 0;
		int occurrenceThree = 0;
		
//		loop keywords1 e compara com cada string to descArray se match soma;
		
		//Getting occurrence of the first keyword string
		for (int i = 0; i < keywordsArray1.length; i++) {
			for (int j = 0; j < descArray.length; j++) {
					if(descArray[j].equalsIgnoreCase(keywordsArray1[i])) {
						occurrenceOne++;
					}
				}
			}
		
		//Getting occurrence of the second keyword string
		for (int i = 0; i < keywordsArray2.length; i++) {
			for (int j = 0; j < descArray.length; j++) {
					if(descArray[j].equalsIgnoreCase(keywordsArray2[i])) {
						occurrenceTwo++;
					}
				}
			}
		
		//Getting occurrence of the third keyword string
		for (int i = 0; i < keywordsArray3.length; i++) {
			for (int j = 0; j < descArray.length; j++) {
					if(descArray[j].equalsIgnoreCase(keywordsArray3[i])) {
						occurrenceThree++;
					}
				}
			}
		
		int total = occurrenceOne + occurrenceTwo + occurrenceThree;
		String relevance = null;
		
		if(occurrenceOne != 0) {
			occurrenceOne = (occurrenceOne * 100) / total;
			relevance = keywordsArray1[0] + ": " + occurrenceOne + "%  ";
		}
		
		if(occurrenceTwo != 0) {
			occurrenceTwo = (occurrenceTwo * 100) / total;
			relevance = keywordsArray2[0] + ": " + occurrenceTwo + "%  ";
		}
		
		if(occurrenceThree != 0) {
			occurrenceThree = (occurrenceThree * 100) / total;
			relevance = keywordsArray2[0] + ": " + occurrenceThree + "%  ";
		}

		return relevance;
	}

}
