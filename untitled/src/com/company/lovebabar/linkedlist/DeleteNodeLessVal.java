package com.company.lovebabar.linkedlist;

public class DeleteNodeLessVal {

public static void main(String args[])
{
    int array[]={31,716,946,81,512,195,926,440,876,1000,267,835,357,399,119,325,849,285,517,880,1000,814,960,863,8,237,302,883,788};
    Node head = compute(MergeSort.genrateLinkList(array));
    System.out.print("");

}
static int heighest = Integer.MIN_VALUE;
    static Node compute(Node head)
    {
     return deleteNode(head);   // your code here
    }

    static Node deleteNode(Node node)
    {
        if (node.next==null)
        {
            heighest = node.value;
            return node;
        }

        Node nextNode = deleteNode(node.next);
        if (node.next!=null)
        {

            if (node.value> heighest)
            {
            node.next = nextNode;
            nextNode = node;
            heighest = node.value;
            }

        }
        return nextNode;
    }

}
