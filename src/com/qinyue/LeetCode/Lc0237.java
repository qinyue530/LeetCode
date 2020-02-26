package com.qinyue.LeetCode;

import java.util.Scanner;

public class Lc0237 {
	static public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	static class Solution {
		public static void deleteNode(ListNode node) {
			node.val = node.next.val;
			node.next = node.next.next;
		}
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
		Solution.deleteNode(head.next.next.next.next);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}