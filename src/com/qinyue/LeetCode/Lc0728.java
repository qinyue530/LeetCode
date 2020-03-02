package com.qinyue.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Lc0728 {
	public static void main(String[] args) {
		int left = 1;
		int right = 22;
		System.out.println();
		List<Integer> list =selfDividingNumbers(left,right);
		for(int i : list) {
			System.out.print( i + " ");
		}
	}
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = left ; i <= right ; i++) {
			int sum = 0;
			int result = i;
			while(result>0) {
				if(result%10==0||i%(result%10)!=0) {
					sum++;
					break;
				}
				result/=10;
			}
			if(sum==0)list.add(i);
		}
		return list;
    }
}
