package com.company.leetcode;



class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class LinkedListOperation {

    public static void main(String args[])
    {
        int array[] = {1,2,3,4,5,6};
        ListNode listNode = genrateLinkedList(array);
        removeSecondLast(listNode);
    System.out.println("");

    }

    static ListNode genrateLinkedList(int array[])
    {
        ListNode listNode = new ListNode();
        ListNode listNodeCounter = listNode;
        for (int i=0;i<array.length;i++)
        {
            listNodeCounter.val = array[i];
            if(i== array.length-1)
                break;
            listNodeCounter.next = new ListNode();
            listNodeCounter = listNodeCounter.next;
        }
    return listNode;
    }

    static void removeSecondLast(ListNode cur)
    {
       ListNode prev = cur;

        while (cur.next.next!=null)
        {
            cur = cur.next;
        }

        cur.next = null;
    }


}
