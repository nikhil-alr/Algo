package com.company.lovebabar.linkedlist;

public class MergeSort {

    public static void main(String args[])
    {
        int array[] = {2,1,4,3,6,6,5};
        Node head = genrateLinkList(array);
        Node last = head;
        Node current = head;
        while (current!=null)
        {   last = current;
            current = current.next;

        }
        mergeSort(head,last);
        System.out.print(head);
    }


    static Node genrateLinkList(int array[])
    {
        Node head = new Node(array[0]);
        Node current = head;
        for (int i=1;i<array.length;i++)
        {
            current.next = new Node(array[i]);
            current = current.next;
        }
        return head;
    }

//    static Node quickSort()
//    {
//
//    }



    static Node mergeSort(Node head,Node tale)
    {
        if(head==tale)
            return head;

        Node middle = getMiddle(head,tale);
        Node middleNext = middle.next;
        middle.next = null;
        Node list1 = mergeSort(head,middle);
        Node list2 = mergeSort(middleNext,tale);
        head = merge(list1,list2);
        return head;
    }

    static Node getMiddle(Node head,Node tale)
    {
        Node fastPointer = head;
        Node slowPointer = head;

        while (fastPointer!=tale)
        {
            fastPointer = fastPointer.next;
            if (fastPointer==null||fastPointer==tale)
            {
                return slowPointer;

            }
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
slowPointer.next = null;
        return slowPointer;
    }

    static Node merge(Node list1,Node list2)
    {

        Node tmpNode = new Node(-1);
        Node curerntTmp = tmpNode;
        Node pointerOne = list1;
        Node pointerTwo = list2;
        while (pointerOne!=null&&pointerTwo!=null)
        {
            if (pointerOne.value< pointerTwo.value)
            {
                curerntTmp.next = pointerOne;
                pointerOne = pointerOne.next;

            }
            else
            {
                curerntTmp.next = pointerTwo;
                pointerTwo = pointerTwo.next;

            }
            curerntTmp = curerntTmp.next;
        }

        if(pointerOne==null)
            curerntTmp.next = pointerTwo;
        else
            curerntTmp.next = pointerOne;

        return tmpNode.next;
    }

}
