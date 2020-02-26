package com.qinyue.LeetCode;

import java.util.Scanner;

public class LcMs58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		System.out.println(reverseLeftWords(str, n));
	}

	public static String reverseLeftWords(String s, int n) {
		return s.substring(n,s.length())+ s.substring(0, n);
	}
}
