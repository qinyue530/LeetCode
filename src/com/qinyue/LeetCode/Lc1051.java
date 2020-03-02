package com.qinyue.LeetCode;

import java.util.Arrays;

public class Lc1051 {
	public static void main(String[] args) {
		int a[] = {1,1,4,2,1,3};
		System.out.println(heightChecker(a));
	}

	public static int heightChecker(int[] heights) {
		int[] result = heights.clone();
		Arrays.sort(result);
		int sum = 0;
		for(int i = 0 ; i < heights.length ; i++) {
			System.out.print(result[i] + " ");
			if(heights[i]!=result[i])sum++;
		}
		return sum;
    }
}
