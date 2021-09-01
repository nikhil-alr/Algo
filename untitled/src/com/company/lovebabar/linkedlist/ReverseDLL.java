package com.company.lovebabar.linkedlist;

public class ReverseDLL {

    static class Node
    {
        int data;
        Node next, prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String args[])
    {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
    node1.next = node2;
    node2.prev = node1;
    node2.next = node3;
    node3.prev = node2;
    System.out.print("");
        reverseDLL(node1);
    }



    public static Node reverseDLL(Node  head)
    {
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            prev.prev = current;

        }
        head = prev;
return head;
    }


}
