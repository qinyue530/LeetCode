package com.qinyue.LeetCode;

import com.qinyue.LeetCode.Lc0019.ListNode;
import com.qinyue.LeetCode.Lc0021.Solution;

public class Lc0083 {
	static public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	static class Solution {
		public static ListNode deleteDuplicates(ListNode head) {
			ListNode result = head;
			while(head!=null) {
				if(head.next==null) {
					break;
				}else if(head.val == head.next.val) {
					if(head.next.next!=null) {
						head.next = head.next.next;
					}else{
						head.next=null;
					}
				}else {
					head = head.next;
				}
			}

			return result;
		}
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l1Head = l1;
		l1.next = new ListNode(1);
		l1 = l1.next;
		l1.next = new ListNode(2);
		l1 = l1.next;
		l1.next = new ListNode(3);
		l1 = l1.next;
		l1.next = new ListNode(3);
		ListNode result = Solution.deleteDuplicates(l1Head);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
