package com.qinyue.LeetCode;

//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//        I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//        X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
//        C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

import java.util.Scanner;

public class Lc0013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(romanToInt(str));
    }
    public static int romanToInt(String s) {
        int sum = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='I'){
                if (i+1<s.length()&&s.charAt(i+1)=='V'){
                    sum+=4;
                    i++;
                }else if (i+1<s.length()&&s.charAt(i+1)=='X'){
                    sum+=9;
                    i++;
                }else {
                    sum+=1;
                }

            }else if(s.charAt(i)=='X'){
                if (i+1<s.length()&&s.charAt(i+1)=='L'){
                    sum+=40;
                    i++;
                }else if (i+1<s.length()&&s.charAt(i+1)=='C'){
                    sum+=90;
                    i++;
                }else {
                    sum+=10;
                }

            }else if(s.charAt(i)=='C'){
                if (i+1<s.length()&&s.charAt(i+1)=='D'){
                    sum+=400;
                    i++;
                }else if (i+1<s.length()&&s.charAt(i+1)=='M'){
                    sum+=900;
                    i++;
                }else {
                    sum+=100;
                }
            } else if (s.charAt(i)=='V') {
                sum+=5;
            }else if (s.charAt(i)=='L') {
                sum+=50;
            }else if (s.charAt(i)=='D') {
                sum+=500;
            }else if (s.charAt(i)=='M') {
                sum+=1000;
            }

        }
        return sum;
    }

}
