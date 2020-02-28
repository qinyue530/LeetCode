package com.qinyue.LeetCode;

import java.util.ArrayList;
import java.util.List;


public class Lc1323 {
	public static void main(String[] args) {
		int num=9666666;	
		System.out.println(maximum69Number1(num));
	}
	public static int maximum69Number (int num) {
		String str1 = String.valueOf(num);
		String str2 = "";
		int n = 0;
		for(int i = 0 ; i <str1.length() ; i++) {
			if(n==0&&str1.charAt(i)=='6') {
				str2+="9";
				n++;
			}else {
				str2+=str1.charAt(i);
			}
		}
		return Integer.valueOf(str2);
    }
	public static int maximum69Number1 (int num) {
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		int n=0;
		for(int i = 0 ; i < sb.length() ; i++) {
			if(n==0&&sb.charAt(i)=='6') {
				sb.setCharAt(i, '9');
				n++;
			}
		}
		return Integer.valueOf(sb.toString());
    }
}
