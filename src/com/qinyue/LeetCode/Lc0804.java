package com.qinyue.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Lc0804 {

	public static void main(String[] args) {
		String word[] = {"gin","zen","gig","msg"};
		
		System.out.println(uniqueMorseRepresentations(word));
	}
	static 	String str[]= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

	public static int uniqueMorseRepresentations(String[] words) {
		Set<String> hs = new HashSet<String>();
		for(String s : words) {
			StringBuilder result = new StringBuilder();
			for(int j = 0 ; j < s.length() ; j++) {
				char c = s.charAt(j);
				result.append(str[c-'a']);
			}
			hs.add(result.toString());
		}
		return hs.size();
	}
}
