package com.qinyue.LeetCode;

public class Lc0002 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(0);
        ListNode head1  = listNode1;
//        listNode1.next = new ListNode(0);
//        listNode1 = listNode1.next;
//        listNode1.next = new ListNode(3);

        ListNode listNode2 = new ListNode(7);
        ListNode head2  = listNode2;
        listNode2.next = new ListNode(3);
//        listNode2 = listNode2.next;
//        listNode2.next = new ListNode(4);
       ListNode result =  addTwoNumbers(head1,head2);
        while(result!=null){
            System.out.println(result.val );
            result = result.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultListNode = new ListNode(0);
        ListNode resultHead = resultListNode;
        int sum = 0;
        while(l1!=null  || l2!=null){
            if(l1==null&&l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }else if(l1!=null&&l2==null){
                sum += l1.val;
                l1=l1.next;
            }else if(l1!=null&&l2!=null){
                sum +=l1.val + l2.val;
                l1=l1.next;
                l2=l2.next;
            }else if(l1==null&&l2==null){
                break;
            }
            resultListNode.next = new ListNode(sum%10);
            resultListNode = resultListNode.next;
            sum/=10;
        }
        if(sum>0){
            resultListNode.next = new ListNode(sum);
            resultListNode = resultListNode.next;
        }
        return resultHead.next;
    }
}
