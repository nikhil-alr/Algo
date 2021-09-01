package com.company.lovebabar.linkedlist;

import java.util.HashMap;

public class RemoveDuplicated {

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

        removeDuplicates(node);
    }

//    static Node removeDuplicates(Node head)
//    {
//        Node current = head;
//        Node nextNode = null;
//
//        while (current!=null)
//        {
//            nextNode = current.next;
//            if(nextNode!=null&&current.value==nextNode.value)
//            {
//                current.next = nextNode.next;
//                continue;
//            }
//            current = nextNode;
//        }
//       return head;
//    }

    static public Node removeDuplicates(Node head)
    {

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        Node current = head;
        Node next = current;
        while (current!=null)
        {
            next = current.next;
            if(next!=null&&hashMap.get(next.value)!=null)
            {
                current.next = next.next;
            continue;
            }

            current = next;
            hashMap.put(current.value, current.value);
        }

        return head;
    }

}
