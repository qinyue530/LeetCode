package com.qinyue.LeetCode;

import java.util.Scanner;

import com.qinyue.LeetCode.LcMs22.ListNode;

public class LcMs0202 {
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
		System.out.println(kthToLast(head, n));;
	}

	public static int kthToLast(ListNode head, int k) {
		ListNode h1 = head;
		while(head!=null) {
			head = head.next;
			if(k!=0) {
				k--;
			}else {
				h1 = h1.next;
			}
		}
		return h1.val;
    }
}
