package com.qinyue.LeetCode;

public class Lc0771 {
	public static void main(String[] args) {
		String J="aA";
		String S="aAAbbbb";
		System.out.println(numJewelsInStones(J,S));
	}
	
	public static int numJewelsInStones(String J, String S) {
		int sum = 0 ;
		for(char s: S.toCharArray()) {
			if(J.indexOf(s)!=-1)sum++;
		}
		return sum;
    }
//	public static int numJewelsInStones(String J, String S) {
//		int a[] = new int[27];
//		int A[] = new int[27];
//		int sum = 0;
//		for(int i = 0 ;  i < J.length() ; i++) {
//			if(Character.isUpperCase(J.charAt(i))) {
//				A[J.charAt(i)-'A']=1;
//			}else
//			if(!Character.isUpperCase(J.charAt(i))) {
//				a[J.charAt(i)-'a']=1;
//			}
//		}
//		for(int i = 0 ;  i < S.length() ; i++) {
//			if(Character.isUpperCase(S.charAt(i))&&A[S.charAt(i)-'A']==1) {
//				sum++;
//			}else
//			if(!Character.isUpperCase(S.charAt(i))&&a[S.charAt(i)-'a']==1) {
//				sum++;
//			}
//		}
//		return sum;
//    }
}
