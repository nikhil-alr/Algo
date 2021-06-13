package com.company.lovebabar.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MergeKList {

    public static void main(String args[])
    {
       // {{1,2,3},{5 6},{4,5},{7,8}}

        Node tmpArray[] = {null};
        Node nodea = tmpArray[0];

        Node head1 = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        head1.next = n1;
        n1.next = n2;
        Node head2 = new Node(4);
        Node n3 = new Node(5);
        head2.next = n3;
        Node head3 = new Node(5);
        Node n4 = new Node(6);
        head3.next = n4;
        Node head4 = new Node(7);
        Node n5 = new Node(8);
        head4.next = n5;
        Node array[] = {head1,head2,head3,head4};
        Node node = mergeKList(array,4);
        System.out.print(node);
    }

    static class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}


    static class Pair implements Comparable<Pair>
    {
        int data;
        int row;

        public Pair(int data, int row) {
            this.data = data;
            this.row = row;
        }

        @Override
        public int compareTo(Pair o) {
            if (o.data>data)
                return 1;
            if (o.data<data)
                return -1;


            return 0;
        }
    }

      static Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        Node head = null;
        Node list = null;
        PriorityQueue<Integer> pq = new PriorityQueue();
        for (int i=0;i<K;i++)
        {
            Node node=arr[i];
           while (node!=null)
           {
               pq.add(node.data);
               node = node.next;
           }
        }
head = new Node(pq.poll());
       list =  head;
    while (!pq.isEmpty())
    {
       list.next = new Node(pq.poll());
       list = list.next;
    }

    return head;
    }

}
