package com.company.lovebabar.linkedlist;

import java.util.Stack;

public class AddNumberInLL {

    public static void main(String args[])
    {
        Node node7 = new Node(8);
        Node node6 = new Node(7);
        node6.next = node7;
        Node node5 = new Node(5);
        node5.next = node6;
        Node node4 = new Node(5);
        node4.next = node5;
        Node node3 = new Node(4);
        node3.next = node4;
        Node node2 = new Node(2);
        node2.next = node3;
        Node node1 = new Node(2);
        node1.next = node2;
        Node node = new Node(1);
        node.next = node1;
        addOne(node);
    }

    public static Node addOne(Node head)
    {
        Stack<Node> stack = new Stack<>();
        Node current = head;
        while (current!=null)
       {
           stack.push(current);
           current = current.next;

       }

        int carry = 0;
       while (!stack.isEmpty())
       {
           Node node = stack.pop();
           int val = node.value+1+carry;
           if (val<10)
           {
               node.value = val;
               break;
           }
           carry = val/10;
           node.value = val%10;

       }

        return head;
    }

}
