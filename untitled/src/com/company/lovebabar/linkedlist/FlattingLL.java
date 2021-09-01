package com.company.lovebabar.linkedlist;

public class FlattingLL {

    public static void main(String args[])
    {
        int array1[]={5,7,8,30};
        Node list1 = genrateLinkList(array1);
        int array2[]={10,20};;
        Node list2 = genrateLinkList(array2);
        list1.next = list2;
        int array3[]={19,22,50};
        Node list3 = genrateLinkList(array3);
        list2.next = list3;
        int array4[]={28,35,40,45};
        Node list4 = genrateLinkList(array4);
        list3.next = list4;
        flatten(list1);
    }

    static Node genrateLinkList(int array[])
    {
       Node head = new Node(array[0]);
        Node current = head;
        for (int i=1;i<array.length;i++)
        {
            current.bottom = new Node(array[i]);
            current = current.bottom;
        }
        return head;
    }

    static class Node
    {
        int data;
        Node next;
        Node bottom;

        Node(int d)
        {
            data = d;
            next = null;
            bottom = null;
        }
    }

    static Node flatten(Node root)
    {

        Node head1 = root;
        Node current = root.next;

        while (current!=null)
        {
            head1 = merge(head1,current);
            current = current.next;
        }

        return head1;
    }



    static Node merge(Node list1,Node list2)
    {


        Node tmpNode = new Node(-1);
        Node curerntTmp = tmpNode;
        Node pointerOne = list1;
        Node pointerTwo = list2;
        while (pointerOne!=null&&pointerTwo!=null)
        {
            if (pointerOne.data< pointerTwo.data)
            {
                curerntTmp.bottom = pointerOne;
                pointerOne = pointerOne.bottom;

            }
            else
            {
                curerntTmp.bottom = pointerTwo;
                pointerTwo = pointerTwo.bottom;

            }
            curerntTmp = curerntTmp.bottom;
        }

        if(pointerOne==null)
            curerntTmp.bottom = pointerTwo;
        else
            curerntTmp.bottom = pointerOne;

        return tmpNode.bottom;
    }
}
