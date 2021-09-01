package com.company.lovebabar.stack_queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegativeInteger {

    public static void main(String args[])
    {
        int N = 5;
        long A[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int K = 3;
        printFirstNegativeInteger(A,N,K);
    }

    static public long[] printFirstNegativeInteger(long A[], int N, int K)
    {

        ArrayList<Long> ansList = new ArrayList<>();
        Deque<Long> deque = new LinkedList();

int i=0;
        for (i=0;i<K;i++)
        {
            deque.addLast(A[i]);
        }
        long firstNeg = deque.pollFirst();
        while (!deque.isEmpty()&&firstNeg>0)
        {
            firstNeg = deque.pollFirst();
        }

        if (firstNeg<0)
        {
       deque.addFirst(firstNeg);
        }
        else
            firstNeg = 0;

        ansList.add(firstNeg);
        for (;i<A.length;i++)
        {
            if (deque.size()==K)
            {
                deque.pollFirst();
            }
            deque.addLast(A[i]);

            firstNeg = deque.peekFirst();
            while (!deque.isEmpty()&&firstNeg>0)
            {
                deque.pollFirst();
                if(deque.size()>0)
                firstNeg = deque.peekFirst();
            }
            if (firstNeg>=0)
                firstNeg = 0;
            ansList.add(firstNeg);

        }
        long ansArray[] = new long[ansList.size()];
int ansCounter = 0;
        for (Long item:ansList)
        {
            ansArray[ansCounter] = item;
            ansCounter+=1;
        }

        return ansArray;
    }
}
