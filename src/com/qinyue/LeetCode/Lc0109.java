package com.qinyue.LeetCode;

import java.util.Vector;

public class Lc0109 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	static class Solution {
		public static TreeNode sortedListToBST(ListNode head) {
			TreeNode treeNode = null;
			if (head == null) {
				return treeNode;
			}
			if (head != null) treeNode = new TreeNode(head.val);
			if (head.next != null) {
				treeNode.left = new TreeNode(head.next.val);
				if (head.next.next != null) {
					treeNode.right = new TreeNode(head.next.next.val);
					if(head.next.next.next!=null)sortedListToBST(head.next.next.next);
				}
			}
			return treeNode;
		}
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(10);
		ListNode head = list;
		list = list.next;
		list = new ListNode(-3);
		list = list.next;
		list = new ListNode(0);
		list = list.next;
		list = new ListNode(5);
		list = list.next;
		list = new ListNode(9);
		TreeNode result = Solution.sortedListToBST(head);

	}
}
