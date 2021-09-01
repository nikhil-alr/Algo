package com.company.leetcode;

import java.util.List;

public class RemoveLinkedListEnd {

    public static void main(String args[])
    {
        int array[] = {1,2,3,4,5};
ListNode listNode = LinkedListOperation.genrateLinkedList(array);
removeNthFromEnd(listNode,0);

    }

    static public ListNode removeNthFromEnd(ListNode head, int n) {

        if(n==0)
            return head;

        if (head.next==null)
            return null;

        ListNode prev = null;
        ListNode nexNode = head;
        ListNode currentNode = head;

    while (n!=0)
    {
        nexNode = nexNode.next;
        n-=1;
    }


    while (nexNode!=null)
    {
        nexNode = nexNode.next;
        ListNode tmpNode = currentNode.next;
        prev = currentNode;
        currentNode = tmpNode;
    }

    if(prev!=null)
    prev.next = prev.next.next;
else
    head = head.next;




        return head;
    }

    static int deleteNthNodeLast(ListNode head,int n)
    {
        if(head.next==null)
        {

            return 1;
        }

        int nthNode = deleteNthNodeLast(head.next,n);





        if(nthNode==n)
        {
            if (n==1)
            {
                head.next = null;
                return nthNode+1;
            }
         head.next = head.next.next;
        }

        return nthNode+1;
    }

}
