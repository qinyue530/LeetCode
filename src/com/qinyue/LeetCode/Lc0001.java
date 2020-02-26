package com.qinyue.LeetCode;

import java.util.Scanner;

public class Lc0001 {
	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        int[] result = new int[2];
	        for(int i = 0 ; i < nums.length ; i++) {
	        	for(int j = i+1 ; j < nums.length ; j++) {
	        		if(nums[i] + nums[j] == target) {
	        			result[0] = i;
	        			result[1] = j;
	        		}
	        	}
	        }
	        
	        return result;
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		for(int i = 0 ; i < 4 ; i++) {
			a[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Solution solution = null;
		int b[] = solution.twoSum(a, target);
		for(int i = 0 ; i < b.length ; i++) {
			System.out.println(b[i]);
		}
		
	}
}
