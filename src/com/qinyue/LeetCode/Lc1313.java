package com.qinyue.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Lc1313 {
	public static void main(String[] args) {
		int nums[] = {1,2,3,4};
		int result[]=decompressRLElist(nums);
		for(int i = 0 ; i < result.length; i++) {
			System.out.print(result[i] +" ");
		}
	}

	public static int[] decompressRLElist(int[] nums) {
		int length = 0;
		for(int i = 0 ; i < nums.length ; i +=2) {
			length+=nums[i];
		}
        int[] result = new int[length];
        int n = 0;
        for(int i = 0 ; i < nums.length ; i +=2) {
        	for(int j = 0 ; j < nums[i]&&i+1<nums.length ; j++) {
        		result[n] = nums[i+1];
        		n++;
        	}
        }
        
		return result;
    }
}
