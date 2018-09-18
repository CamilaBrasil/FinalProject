package com.project.Project;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {
	
	private static String[] keywordsArray1;
	private static String[] keywordsArray2;
	private static String[] keywordsArray3;

	// Getting answers and sending back combinations
	public static List<String> getKeywords(String keyOne, String keyTwo, String keyThree) {
	
		keywordsArray1 = Keywords.getKeywordsArray(keyOne);
		keywordsArray2 = Keywords.getKeywordsArray(keyTwo);
		keywordsArray3 = Keywords.getKeywordsArray(keyThree);

		List<String> allKeywords = new ArrayList<>();

		for (int i = 0; i < keywordsArray1.length; i++) {
			allKeywords.add(keywordsArray1[i]);
			allKeywords.add(keywordsArray2[i]);
			allKeywords.add(keywordsArray3[i]);
		}
		return allKeywords;
	}

	public static String getResult(String desc, String keyOne, String keyTwo, String keyThree) {

		
		return getRelevance(parseDesc(desc), keyOne, keyTwo, keyThree);
	}

	// Parsing the description
	public static String[] parseDesc(String desc) {
		
		String regex = "[ .,?!]+";
		String[] words = desc.split(regex);

		return words;
	}

	
	public static String getRelevance(String[] descArray, String keyOne, String keyTwo, String keyThree) {
		
		int occurrenceOne = 0;
		int occurrenceTwo = 0;
		int occurrenceThree = 0;
		String relevance = "";
		
		keywordsArray1 = Keywords.getKeywordsArray(keyOne);
		keywordsArray2 = Keywords.getKeywordsArray(keyTwo);
		keywordsArray3 = Keywords.getKeywordsArray(keyThree);
		
		
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
//		System.out.println("Total: " + total);
//		System.out.println("One: " + occurrenceOne + "Two: " + occurrenceTwo + "Three: " + occurrenceThree);
		
		
		if(occurrenceOne != 0) {
			occurrenceOne = (occurrenceOne * 100) / total;
			relevance += keywordsArray1[0] + ": " + occurrenceOne + "%  ";
//			System.out.println("Relevance 1: " + relevance);
		}
		
		if(occurrenceTwo != 0) {
			occurrenceTwo = (occurrenceTwo * 100) / total;
			relevance += keywordsArray2[0] + ": " + occurrenceTwo + "%  ";
//			System.out.println("Relevance 2: " + relevance);
		}
		
		if(occurrenceThree != 0) {
			occurrenceThree = (occurrenceThree * 100) / total;
			relevance += keywordsArray2[0] + ": " + occurrenceThree + "%  ";
//			System.out.println("Relevance 3: " + relevance);
		}

		return relevance;
	}
}

