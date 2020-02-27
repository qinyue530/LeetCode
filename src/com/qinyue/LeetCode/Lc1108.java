package com.qinyue.LeetCode;

import java.util.Scanner;

public class Lc1108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(defangIPaddr(str));
	}

	public static String defangIPaddr(String address) {
		
		return address.replace(".", "[.]");
    }
}
