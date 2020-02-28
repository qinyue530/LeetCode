package com.qinyue.LeetCode;

import java.util.ArrayList;
import java.util.List;


public class Lc1221 {
	public static void main(String[] args) {
		String str = "RLRRLLRLRL";	
		System.out.println(balancedStringSplit(str));
	}
	public static int balancedStringSplit(String s) {
		int result = 0;
		int R = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i)=='R') {
				R++;
			}else if(s.charAt(i)=='L') {
				R--;
			}
			if(R==0) {
				result++;
			}
		}
		
		return result;
    }
}
