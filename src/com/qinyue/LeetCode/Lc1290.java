package com.qinyue.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Lc1290 {
	public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		ListNode head = listNode;
		listNode.next = new ListNode(0);
		listNode = listNode.next;
		listNode.next = new ListNode(1);
		System.out.println(getDecimalValue(head));
	}
	
	public static int getDecimalValue(ListNode head) {
		int res=0;
        while(head!=null){
            res=(res<<1)+head.val;
            head=head.next;
        }
        return res;
          
    }

}
