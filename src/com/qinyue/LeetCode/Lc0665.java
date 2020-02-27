package com.qinyue.LeetCode;

import java.util.Scanner;

public class Lc0665 {
	
	public static void main(String[] args) {
		int a[] = {3,4,4,3};
		System.out.println(checkPossibility1(a));
	}
	public static boolean checkPossibility(int[] nums) {
		int sum = 0;
		if(nums.length<3)return true;
		for(int i = 1 ; i < nums.length-1 ; i++) {
			
			if(nums[i-1]<=nums[i]&&nums[i]>nums[i+1]) {
				if(nums[i-1]>=nums[i+1]) {
					nums[i+1] = nums[i];
					sum++;
				}else if(nums[i-1]<=nums[i+1]) {
					nums[i] = nums[i-1];
					sum++;
				}
			}else
			if(nums[i-1]>nums[i]&&nums[i]<=nums[i+1]) {
				if(nums[i-1]>=nums[i+1]) {
					nums[i-1] = nums[i];
					sum++;
				}else if(nums[i-1]<=nums[i+1]) {
					nums[i] = nums[i+1];
					sum++;
				}
			}else {
				if(nums[i-1]>nums[i]&&nums[i]>nums[i+1]) {
					return false;
				}
			}
			if(sum>1)return false;
		}
		
		return true;
    }
	public static boolean checkPossibility1(int[] nums) {
		int sum = 0;
		if (nums == null || nums.length == 0) {
            return false;
        }
		if(nums.length<3)return true;
		for(int i = 1 ; i < nums.length ; i++) {
			if(nums[i]>=nums[i-1]) {
				continue;
			}
			sum++;
			if(i>=2&&nums[i-2]>nums[i]) {
				nums[i] = nums[i-1];
			}
//			个人认为示例代码无用部分
//			else {
//	            nums[i-1] = nums[i];
//	        }
			if(sum>1)return false;
		}
		
		return true;
    }
}
