package com.qinyue.LeetCode;

import java.util.Scanner;

public class Lc1266 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int points[][] = {{1,1},{3,4},{-1,0}};
		System.out.println(minTimeToVisitAllPoints(points));
	}

	public static int minTimeToVisitAllPoints(int[][] points) {
		int sum = 0;
		for(int i = 0 ;i+1< points.length; i++) {
			int x = Math.abs(points[i][0]-points[i+1][0]);
			int y = Math.abs(points[i][1]-points[i+1][1]);
			sum += Math.max(x, y);
		}
		return sum;
    }
}
