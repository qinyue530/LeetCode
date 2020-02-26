package com.qinyue.LeetCode;

import java.util.Scanner;

public class Lc1281 {
	public static void main(String[] args) {
		int a=4421;
		System.out.println(subtractProductAndSum(a));
	}

	public static int subtractProductAndSum(int n) {
		int sum = 0;
		int ji = 1;
		while(n>0) {
			sum += n%10;
			ji *=n%10;
			n/=10;
		}
		return ji-sum;
    }
}
