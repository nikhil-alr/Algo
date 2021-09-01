package com.company.lovebabar.linkedlist;

public class LLIntersect {

    public static void main(String args[])
    {

    }

    int intersectPoint(Node head1, Node head2)
    {
        int intersection = 0;
        Node listOneCurrent = head1;
        while (listOneCurrent!=null)
        {
            listOneCurrent.value = listOneCurrent.value+1000;
            listOneCurrent = listOneCurrent.next;
        }

        Node listTwoCurrent = head2;
        while (listOneCurrent!=null)
        {
            if(listTwoCurrent.value>1000)
            {
                intersection = listTwoCurrent.value-1000;
                break;
            }
            listTwoCurrent = listTwoCurrent.next;

        }
        return intersection;
    }

}
