package com.qinyue.LeetCode;

import java.util.Vector;

public class LcMs05 {
	public static void main(String[] args) {
		String s = "We are happy.";
		System.out.println(replaceSpace(s));
	}
	public static String replaceSpace(String s) {
		
		return s.replaceAll(" ", "%20");
    }
}
