package com.company.lovebabar.linkedlist;

public class LinkedListLoop {

    public static void main(String args[])
    {

        Node node = new Node(1);
       // node.next = node1;
System.out.print(detectLoop(node));
    }

    public static boolean detectLoop(Node head){

        Node slowPointer = head;
        Node fastPointer = head;
        boolean isLoopPresent = false;
        Node lastFastPointer = null;

        while (fastPointer!=null)
        {
            lastFastPointer = fastPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
            if(fastPointer!=null)
                fastPointer = fastPointer.next;
            if(slowPointer==fastPointer)
            {
                if(slowPointer==null&&fastPointer==null)
                    return false;


                lastFastPointer.next = null;
                return true;
            }
        }

        return isLoopPresent;
    }

}
