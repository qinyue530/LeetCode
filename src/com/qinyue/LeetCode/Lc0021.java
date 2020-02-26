package com.qinyue.LeetCode;

import com.qinyue.LeetCode.Lc0019.ListNode;

public class Lc0021 {
	static public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static class Solution {
		public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
			ListNode result = new ListNode(0);
			ListNode head = result;
			if (l1 == null)
				return l2;
			if (l2 == null)
				return l1;
			while (l1 != null && l2 != null) {
				if(l1.val<=l2.val) {
					result.val = l1.val;
					l1 = l1.next;
				}else if(l1.val>l2.val) {
					result.val = l2.val;
					l2 = l2.next;
				}
				if(l1==null||l2==null)break;
				result.next = new ListNode(0);
				result = result.next;
			}
			if(l1==null)result.next = l2;
			if(l2==null)result.next = l1;
			return head;
		}
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l1Head = l1;
		l1.next = new ListNode(2);
		l1 = l1.next;
		l1.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		ListNode l2Head = l2;
		l2.next = new ListNode(3);
		l2 = l2.next;
		l2.next = new ListNode(4);
		ListNode result = Solution.mergeTwoLists(l1Head, l2Head);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
