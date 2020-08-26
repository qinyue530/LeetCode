package com.qinyue.LeetCode;

import java.util.Collection;

public class Lc0035 {
    public static void main(String[] args) {
        int a[]={1};
        System.out.println(searchInsert(a,1));
    }

    public static int searchInsert(int[] nums, int target) {
        int begin = 0;
        int end = nums.length-1;
        int mid=0;
        if(nums==null||target<=nums[0])return 0;
        if(nums[end]<target)return end+1;
        while(end-begin>1){
            mid = (begin+end)/2;
            if (nums[mid]<target){
                begin = mid;
            }else if (nums[mid]>target){
                end = mid;
            }if(nums[mid]==target)return mid;
        }
        return begin+1;
    }


}
