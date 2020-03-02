package com.qinyue.LeetCode;

import java.util.Stack;
import java.util.Vector;

public class LcMs0101 {
	public static void main(String[] args) {
		String s = "azAZaaabcd";
		System.out.println(isUnique1(s));
	}

	public static boolean isUnique(String astr) {
		int a[] = new int[26];
		int A[] = new int[26];
		for (char c : astr.toCharArray()) {
			if (c - 'a' < 0) {
				A[c - 'A']++;
				if (A[c - 'A'] > 1)
					return false;
			}
			if (c - 'a' >= 0) {
				a[c - 'a']++;
				if (a[c - 'a'] > 1)
					return false;
			}
		}

		return true;
	}

	public static boolean isUnique1(String astr) {
		for (int i = 0; i < astr.length(); i++) {
			int index = astr.lastIndexOf(astr.charAt(i));
			if (index != i)
				return false;
		}
		return true;
	}

	public static boolean isUnique2(String astr) {
		for (char c : astr.toCharArray()) {
			String s = astr;
			s= astr.replace(String.valueOf(c), "");
			if(s.length()!=astr.length()-1)return false;
		}
		return true;
	}
}
