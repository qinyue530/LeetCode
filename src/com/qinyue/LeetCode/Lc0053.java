package com.qinyue.LeetCode;

public class Lc0053 {
    public static void main(String[] args) {
        int a[] = {-1};
        System.out.println(maxSubArray(a));

    }
    public static int maxSubArray(int[] nums) {
        int perSum = nums[0];
        int sum = nums[0];
        int max = nums[0];
        for(int i = 1 ; i<nums.length ; i++){
            perSum = sum;
            if(perSum<0){
                sum = 0;
            }
            sum+=nums[i];
            max = Math.max(max , sum);
        }
        return max;
    }


}
