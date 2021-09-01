package com.company.leetcode;

public class MergeTwoList {

    static class A
    {
        A(int a)
        {
            this.a = a;
        }
        int a=10;
    }

    public static void main(String args[])
    {
        int array1[] = {1,2,4,5};
        int array2[] = {0,3,4};
        ListNode l1 = LinkedListOperation.genrateLinkedList(array1);
        ListNode l2 = LinkedListOperation.genrateLinkedList(array2);
        mergeTwoLists(l1,l2);


    }


    static public void mergeTwoLists(ListNode l1,ListNode l2)
    {
        l1 = mergeLists(l1,l2);
        System.out.print("");
    }


    static ListNode mergeLists(ListNode l1,ListNode l2)
    {
        if (l1==null)
            return l2;
        if (l2==null)
            return l1;

        if (l1.val< l2.val)
        {
          l1.next = mergeLists(l1.next,l2);
            return l1;
        }
        else
        {
            l2.next = mergeLists(l1,l2.next);
            return l2;
        }
    }

}
