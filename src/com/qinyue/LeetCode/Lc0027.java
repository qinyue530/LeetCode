package com.qinyue.LeetCode;

public class Lc0027 {
    public static void main(String[] args) {
        int a[] = {2,1};
        int result = removeElement(a,2);
        System.out.println(result);
        for(int i = 0 ; i < result  ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
    public static int removeElement(int[] nums, int val) {
        if(nums==null||nums.length==0)return 0;
        int numsLength = nums.length;
        for (int i = 0 ; i < numsLength-1 ;){
            if(nums[i]==val){
                nums[i] = nums[numsLength-1];
                numsLength--;
            }else{
                i++;
            }
        }
        if(nums[numsLength-1]==val)return numsLength-1;
        return  numsLength;
    }
}
