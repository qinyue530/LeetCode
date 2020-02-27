package com.qinyue.LeetCode;

import java.util.Scanner;

public class LcMs17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result[] = printNumbers(n);
		for(int i = 0 ;i < result.length ; i++) {
			System.out.print(result[i] +" ");
		}
	}

	public static int[] printNumbers(int n) {
		if(n==0)return null;
		int length = 1;
		while(n>0) {
			length *=10;
			n--;
		}
		int result[] = new int[length-1];
		for(int i = 0 ; i < length-1 ; i++) {
			result[i] = i+1;
		}
		return result;
	}
}
