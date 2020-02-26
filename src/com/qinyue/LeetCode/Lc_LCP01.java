package com.qinyue.LeetCode;

public class Lc_LCP01 {
	
	static class Solution {
	    public static int game(int[] guess, int[] answer) {
	        int n = 0;
	        for(int i= 0 ; i < guess.length ; i++) {
	        	if(guess[i]==answer[i])n++;
	        }
	        
	        return n;
	    }
	}
	public static void main(String[] args) {
		int guess[] = {1,2,3};
		int answer[] = {1,2,3};
		System.out.println(Solution.game(guess, answer));
	}
}
