package com.qinyue.LeetCode;

public class Lc1299 {
	public static void main(String[] args) {
		int arr[] = {17,18,5,4,6,1};
		int result[] = replaceElements(arr);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(result[i] + " ");
		}
		
	}
	
	public static int[] replaceElements(int[] arr) {
		int max = arr[arr.length-1];
		int temp = max;
		arr[arr.length-1] = -1;
		for(int i = arr.length-2 ; i >=0 ; i--) {
			temp = arr[i];
			arr[i] = max;
			if(temp>max) {
				max = temp;
			}
		}
		return arr;
    }
	
}
