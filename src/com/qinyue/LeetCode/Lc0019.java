package com.qinyue.LeetCode;

import java.util.Scanner;

public class Lc0019 {

	static public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode result = head;
		ListNode mid = head;
		int i , j;
		if(n == 0) return head;
		
		for( i = 0 ,j=0 ;mid.next!=null;i++) {
			if(i-j>=n) {
				head = head.next;
			}
			mid= mid.next;
		}
		if(i-j<n) return head=head.next;
		head.next = head.next.next;
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
		ListNode result = removeNthFromEnd(head, n);
		while(result!=null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
