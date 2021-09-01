package com.company.leetcode;

import java.util.LinkedList;

public class MergeKSortedList {

    public static void main(String args[])
    {
        int array1[] = {};
        int array2[] = {};
        int array3[] = {};

        ListNode[] lists = new ListNode[3];

//        lists[0] = LinkedListOperation.genrateLinkedList(array1);
//        lists[1] = LinkedListOperation.genrateLinkedList(array2);
//        lists[2] = LinkedListOperation.genrateLinkedList(array3);

        ListNode mList  = mergeKLists(lists);
        System.out.print("");

    }

    static public ListNode mergeKLists(ListNode[] lists) {

        int listIndex = getSmallestElementIndex(lists);
   if (listIndex!=-1)
   {
       ListNode listNode = lists[listIndex];
       lists[listIndex] = lists[listIndex].next;
       ListNode node = mergeKLists(lists);
       listNode.next = node;
       return listNode;
   }

        return null;
    }


    static int getSmallestElementIndex(ListNode[] lists)
    {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i=0;i<lists.length;i++)
        {
           if (lists[i]!=null)
           {
               if (lists[i].val<min)
               {
                   min = lists[i].val;;
                   minIndex = i;
               }
           }
        }

        return minIndex;
    }

}
