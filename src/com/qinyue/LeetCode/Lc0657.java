package com.qinyue.LeetCode;

public class Lc0657 {
	public static void main(String[] args) {
		String S="UD";
		System.out.println(judgeCircle(S));
	}
	
	public static boolean judgeCircle(String moves) {
		int U = 0;
		int R = 0;
		for(char c : moves.toCharArray()) {
			if(c=='U')U++;
			if(c=='D')U--;
			if(c=='R')R++;
			if(c=='L')R--;
		}
		return U==0&&R==0;
		
    }
}
