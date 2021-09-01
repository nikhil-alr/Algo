package com.company.lovebabar.linkedlist;

public class ReverseListInGroup {

    public static void main(String args[])
    {
        int array[] = {1,2,3,4,5};
         Node head = MergeSort.genrateLinkList(array);
    reverseGroup(head,3);
    }

    public static Node reverse(Node node, int k)
    {
return reverseGroup(node,k);
    }

    public static Node reverseGroup(Node node, int k)
    {

        if (node==null)
            return null;
        Node current = node;
        Node next = null;
        Node prev = null;
        int kCounter = k;

        while (current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            k-=1;

        }
        node.next = reverseGroup(current,kCounter);
       return prev;
    }

}
