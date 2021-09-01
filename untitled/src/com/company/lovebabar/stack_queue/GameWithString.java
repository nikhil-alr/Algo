package com.company.lovebabar.stack_queue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class GameWithString {

    public static void main(String args[])
    {
        System.out.print(minValue("aabcbcbcabcc",3));
    }

    static int minValue(String s, int k){

        char charArray[] = s.toCharArray();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(charArray);
 s  = new String(charArray);
 int charCount = 1;

 for (int i=1;i<s.length();i++)
 {
    if (s.charAt(i)==s.charAt(i-1))
    {
        charCount+=1;
    }
    else
    {
        //insert into heap
        maxHeap.add(charCount);
        charCount = 1;
    }
 }
        maxHeap.add(charCount);
 while (k>0)
 {
     charCount = maxHeap.poll();
      k = k-1;
     charCount = charCount-1;
     maxHeap.add(charCount);
 }

 int ans = 0;
 while (!maxHeap.isEmpty())
 {
 int val = maxHeap.poll();
 val = val*val;
 ans+=val;
 }

   return ans;
    }
}
