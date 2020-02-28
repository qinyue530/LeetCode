package com.qinyue.LeetCode;

public class Lc1021 {
	public static void main(String[] args) {
		String num="(()())(())(()(()))";	
		System.out.println(removeOuterParentheses1(num));
	}
	public static String removeOuterParentheses(String S) {
		StringBuffer sb = new StringBuffer(S);
		String result = "";
		int left = 0;
		int begin = 0;
		int sum = 0;
		for(int i = 0 ; i < sb.length() ; i++) {
			if(sb.charAt(i)=='(') {
				left++;
			}else if(sb.charAt(i)==')'){
				left--;
			}
			if(left==0) {
				result += sb.substring(begin+1, i);
				begin = i+1;
			}
		}
		return result;
    }
	public static String removeOuterParentheses1(String S) {
		StringBuilder sb = new StringBuilder();
		int left = 0;
		for(char c : S.toCharArray()) {
			if(c==')'){
				left--;
			}
			if(left>0) {
				sb.append(c);
			}
			if(c=='(') {
				left++;
			}
		}
		return sb.toString();
    }
}
