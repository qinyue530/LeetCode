package com.qinyue.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Lc1309 {

	public static void main(String[] args) {
		String str = "25#";
		System.out.println(freqAlphabets(str));
	}
	public static String freqAlphabets(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < s.length() ; i++) {
			if(i+2<s.length()&&s.charAt(i+2)=='#') {
				sb.append((char)('a' + (int)((s.charAt(i)-'0')*10) 
							  +  (int)(s.charAt(i+1)-'0'-1)));
				i+=2;
			}else {
				sb.append((char)('a' + (int)(s.charAt(i)-'0'-1)));
			}
		}
		
		return sb.toString();
    }
}
