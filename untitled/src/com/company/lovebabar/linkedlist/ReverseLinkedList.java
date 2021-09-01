package com.company.lovebabar.linkedlist;

import java.util.Stack;

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}
class A
{
   A(int a)
   {
       this.a = a;
   }
    int a = 10;
}
public class ReverseLinkedList {



    public static void main(String args[])
    {

        A obj = new A(10);
        A objb = new A(15);
        A objc = new A(16);

System.out.print("");
obj = objb;

        System.out.print("");
        objb = objc;

        System.out.print("");
    }
//    Node reverseList(Node head)
//    {
//        Stack<Node> stack = new Stack<>();
//        Node node = head;
//        while (node!=null)
//        {
//            stack.push(node);
//            node = node.next;
//        }
//
//        head = stack.pop();
//        while (!stack.isEmpty())
//        {
//            head.next = stack.pop();
//            head = head.next;
//        }
//        head.next = null;
//
//    return head;
//    }


//    Node reverseList(Node head)
//    {
//        Node current = head;
//        Node nextNode = null;
//        Node prevNode = null;
//
//
//        while (current!=null)
//       {
//           nextNode = current.next;
//          current.next = prevNode;
//          prevNode = current;
//          current = nextNode;
//       }
//
//        return head;
//    }

    Node reverseList(Node head)
    {
if(head.next==null)
    return head;

       Node newHead =  reverseList(head.next);
       head.next.next = head;
       head.next = null;
       return newHead;
    }

}
