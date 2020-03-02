package com.qinyue.LeetCode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Lc0191 {
	public static void main(String[] args) {
		int n = 00000000000000000000000000001011;
		System.out.println(hammingWeight(n));
	}
	
	public static int hammingWeight(int n) {
		int result = 0;
        while (n != 0) {
            result++;
            n = n & (n - 1);
        }
        return result;
    }
}
