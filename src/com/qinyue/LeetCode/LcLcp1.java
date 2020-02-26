package com.qinyue.LeetCode;

import java.util.Scanner;

public class LcLcp1 {
	public static void main(String[] args) {
		int a[] = {1,2,3};
		int b[] = {3,2,1};
		System.out.println(game(a, b));
	}

	public static int game(int[] guess, int[] answer) {
		int result = 0;
		for(int i = 0 ; i < guess.length ; i++) {
			if(guess[i]==answer[i])result++;
		}
		return result;
    }
}
