package com.qinyue.LeetCode;

import java.util.Scanner;

import com.qinyue.LeetCode.Lc_LCP01.Solution;

public class Lc1252 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 2;
		int m = 3;
		int[][] indices = { { 0, 1 }, { 1, 1 } };
		System.out.println(oddCells(n, m, indices));
	}

	public static int oddCells(int n, int m, int[][] indices) {
		int result[][] = new int[n][m];
		int sum = 0;
		for (int i = 0; i < indices.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[j][indices[i][1]]++;
			}
			for (int j = 0; j < result[0].length; j++) {
				result[indices[i][0]][j]++;
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				if (result[i][j] % 2 == 1)
					sum++;
			}
		}

		return sum;
	}
	public static int oddCells1(int n, int m, int[][] indices) {
		boolean[] r = new boolean[n];
        boolean[] c = new boolean[m];
        int i;
        for (i = 0; i < indices.length; i++) {
            r[indices[i][0]] = !r[indices[i][0]];
            c[indices[i][1]] = !c[indices[i][1]];
        }
        int rr = 0, cc = 0;
        for (i = 0; i < r.length; i++) {
            if(r[i])rr++;
        }
        for (i = 0; i < c.length; i++) {
            if(c[i])cc++;
        }
        return rr * m + cc * n - rr * cc * 2;
	}
}
