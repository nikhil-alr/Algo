package com.company.lovebabar.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class LongestConseqSubs {

    public static void main(String args[])
    {
        HashMap<Integer,Integer> hashMap = new HashMap<>();



        int array[] = {105,120,136,44,26,122,65,108,16,82,58,124,37,62,24,0,36,52,99,179,150,68,71,173,131,81,130,133,94,60,163,199,181,196,159,13,190,95,126,66,84,140,90,176,142,107,45,156,18,87,12,148,172,59,9,10,187,6,101,113,121,55,19,104,139,11,67,28,127,184,22,69,30,92,72,50,25,185,40};

        for (int item:array)
        {
            hashMap.put(item,item);
        }

        int max = 0;

        for (int item:array)
        {
            int left = 0;
            int right = 0;
            hashMap.remove(item);
            int key = item+1;
            while (hashMap.containsKey(key))
            {
                left+=1;

                hashMap.remove(key);
                key+=1;
            }

             key = item-1;
            while (hashMap.containsKey(key))
            {
                right+=1;

                hashMap.remove(key);
                key-=1;
            }

if (max<(left+right))
{
    max = left+right;
}

        }



        System.out.print(max+1);


    }





}
