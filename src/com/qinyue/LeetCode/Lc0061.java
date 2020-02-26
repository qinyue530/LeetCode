package com.qinyue.LeetCode;

import java.util.Scanner;

public class Lc0061 {
	static public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode  rotateRight(ListNode head, int k){
		ListNode result = head;
		ListNode after = head;
		ListNode before = head;
		int headLong = 0;
		while(result!=null) {
			result = result.next;
			headLong++;
		}
		if(k==0||headLong==0)return head;
		k = k%headLong;
		if(k==0)return head;
		after = before.next;
		head = before;
		while(headLong > k+1) {
			before = before.next;
			after = after.next;
			k++;
		}
		result = after;
		before.next = null;
		while(after.next!=null) {
			after = after.next;
		}
		after.next = head;
		return result;
	}

	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		ListNode head = listNode;
		listNode.next = new ListNode(2);
		listNode = listNode.next;
		listNode.next = new ListNode(3);
		listNode = listNode.next;
		listNode.next = new ListNode(4);
		listNode = listNode.next;
		listNode.next = new ListNode(5);
//		while(head!=null) {
//			System.out.println(head.val);
//			head = head.next;
//		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ListNode result = rotateRight(head, n);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
