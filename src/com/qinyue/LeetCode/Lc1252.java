package com.qinyue.LeetCode;

import java.util.Scanner;

import com.qinyue.LeetCode.Lc_LCP01.Solution;

public class Lc1252 {
	static class Solution {
	    public static int oddCells(int n, int m, int[][] indices) {
	        int result[][] = new int[n][m];
	        int sum = 0;
	        for(int i = 0 ; i < indices.length ; i++) {
	        	for(int j = 0 ; j < indices.length ; j++) {
	        		result[indices[j][0]][j]++;
	        	}
	        	for(int j = 0 ; j<indices[0].length ; j++) {
	        		result[j][indices[j][1]]++;
	        	}
	        }
	        for(int i = 0 ; i < result[0].length ; i++) {
	        	for(int j = 0 ; j < result.length ; j++) {
	        		if(result[i][j]%2==1)sum++;
	        	}
	        }
	        
	        return sum;
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] indices ={{40,5}};
		System.out.println(Solution.oddCells(n, m , indices));
	}
}
