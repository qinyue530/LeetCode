package com.qinyue.LeetCode;

import java.util.Scanner;

public class Lc0009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome1(int x) {
        //非字符串方式回文串
        if(x%10==0||x<0)return  false;
        int result=0;
        for(int i = x ; i>0 ; i/=10){
            result=result*10+ i%10;
        }
        if(result==x)return true;
        return  false;
    }
    public static boolean isPalindrome(int x) {
        if(x<0||x%10==0)return false;
        String str = String.valueOf(x);
        for(int i = 0 , strLength = str.length() -1; i< strLength; i++ , strLength-- ){
            if (str.charAt(i)!=str.charAt(strLength))return false;
        }
        return true;
    }
}
