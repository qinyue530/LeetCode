package com.qinyue.LeetCode;

public class Lc0024_______ {
	static public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode  swapPairs(ListNode head){
		if(head==null || head.next==null)return head;
		ListNode temp = new ListNode(0);
		ListNode result = temp;
		temp.next = head;
		while(temp.next!=null&&temp.next.next!=null) {
			ListNode start = temp.next;
			ListNode end = temp.next.next;
			temp.next = end;
			start.next = end.next;
			end.next = start;
			temp = temp.next.next;
		}
		return result.next;
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
		ListNode result = swapPairs(head);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
