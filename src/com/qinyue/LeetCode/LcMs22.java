package com.qinyue.LeetCode;

import java.util.Vector;

public class LcMs22 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	public static void main(String[] args) {
		ListNode list = new ListNode(1);
		ListNode head = list;
		int n = 2;
		list.next = new ListNode(2);
		list = list.next;
		list.next = new ListNode(3);
		list = list.next;
		list.next = new ListNode(4);
		list = list.next;
		list.next = new ListNode(5);
		ListNode node = getKthFromEnd(head, n);
		while(node !=null) {
			System.out.print(node.val + " ");
			node = node.next;
		}

	}
	public static ListNode getKthFromEnd(ListNode head, int k) {
		ListNode h1 = head;
		while(head!=null) {
			head = head.next;
			if(k!=0)k--;
			else if(k==0) {
				h1 = h1.next;
			}
		}
		return h1;
    }
}
