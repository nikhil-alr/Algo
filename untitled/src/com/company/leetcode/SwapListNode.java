package com.company.leetcode;

import java.util.List;

public class SwapListNode {

    public static void main(String args[])
    {
        int array[] = {1,2,3};
        ListNode list = LinkedListOperation.genrateLinkedList(array);
swapPairs(list);
    }

    static public ListNode swapPairs(ListNode head) {

        if(head.next==null||head==null)
            return head;

        ListNode firstPointer = head;
        ListNode secondPointer = head.next;
        head = secondPointer;
        ListNode prevNode = null;
        while (firstPointer!=null&&secondPointer!=null)
        {
            //do Swap

            firstPointer.next = secondPointer.next;
            secondPointer.next = firstPointer;
    if(prevNode!=null)
    {
        prevNode.next = secondPointer;
    }
            prevNode = secondPointer.next;


            firstPointer = firstPointer.next;
            if (firstPointer!=null)
                secondPointer = firstPointer.next;
            else
                break;
        }


        return head;
    }

}
