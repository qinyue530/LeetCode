package com.qinyue.LeetCode;

import java.util.Scanner;

public class Lc0461 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int m = 4;
		System.out.println(hammingDistance(n,m));
	}

	public static int hammingDistance(int x, int y) {
		int i = x^y;
		int sum = 0 ; 
		while(i!=0) {
			sum++;
			i = i&(i-1);
		}
		return sum;
    }
}
