package com.company.lovebabar.linkedlist;

public class MiddleNode {

    public static void main(String args[])
    {

    }

     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode middleNode(ListNode head) {

        ListNode fastPointer = null;
        ListNode slowPointer = null;
        slowPointer = head;

        while (fastPointer!=null)
        {
            slowPointer = slowPointer.next;
            fastPointer.next = fastPointer.next;
            if(fastPointer==null)
                break;
            fastPointer.next = fastPointer.next;
        }

        return slowPointer;

    }

    boolean isCircular(Node head)
    {

        Node current = head;
        while (current!=null)
        {
            current = current.next;
            if(current==head)
                return true;
        }
        return false;
        // Your code here
    }


}
