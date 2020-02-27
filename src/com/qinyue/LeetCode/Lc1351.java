package com.qinyue.LeetCode;

import java.util.Scanner;

public class Lc1351 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grid[][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		System.out.println(countNegatives(grid));
	}

	public static int countNegatives(int[][] grid) {
		int end = grid[0].length;
		int sum = 0;
		for(int i = 0 ; i < grid.length ; i++) {
			for(int j = 0 ; j < end; j++) {
				if(grid[i][j]<0) {
					sum += (grid.length-i)*(end-j);
					end = j;
				}
			}
		}
		return sum;
    }
}
