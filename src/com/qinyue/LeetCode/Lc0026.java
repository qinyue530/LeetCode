package com.qinyue.LeetCode;

public class Lc0026 {
    public static void main(String[] args) {
        int a[] = {1,1,2};
        System.out.println(removeDuplicates(a));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums==null || nums.length<1) return 0;
        int sum = 1;
        int min = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(min!=nums[i]){
                min=nums[i];
                nums[sum] = min;
                sum++;
            }
        }
        return sum;
    }
}
