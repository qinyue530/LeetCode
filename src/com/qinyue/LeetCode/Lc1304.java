package com.qinyue.LeetCode;

import java.util.Scanner;

public class Lc1304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sumZero1(n));
	}

	public static int[] sumZero(int n) {
		int result[] = new int[n];
		int sum = 0;
		for(int  i = 0 ; i < n-1 ; i++) {
			result[i] = i;
			sum += i;
		}
		result[n-1] -=sum;
		
		
		return result;
    }
	public static int[] sumZero1(int n) {
		 int[] res = new int[n];
	        int r = 0,l = n - 1;
	        int val = n / 2;
	        while (r < l) {
	            res[r] = 0 - val;
	            res[l] = val;
	            val--;
	            r++;
	            l--;
	        }
	        if (n % 2 == 1) {
	            res[n / 2] = 0;
	        }
	        return res;
    }
}
