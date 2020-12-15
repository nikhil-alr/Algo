package com.company.lovebabar.array;

import java.util.HashMap;

public class CountPairWithSum {

    public static void main(String args[])
    {
        int array[] = {1, 1, 1, 1};
        int sum = 2;

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int item:array)
        {
            if (hashMap.containsKey(item))
            {
                hashMap.put(item,hashMap.get(item)+1);
                continue;
            }
           hashMap.put(item,1);
        }

        int totalPair = 0;
        for (int item:array)
        {
            int val = sum-item;
            if (hashMap.get(val)!=null&&hashMap.get(val)>0)
            {
                hashMap.put(item,hashMap.get(item)-1);
                totalPair+=hashMap.get(val);

            }


        }

        System.out.print(totalPair);



    }


}
