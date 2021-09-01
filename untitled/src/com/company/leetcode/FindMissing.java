package com.company.leetcode;

import java.util.HashMap;

public class FindMissing {


    public static void main(String args[])
    {
        int nums[] = {-5};
      System.out.print(firstMissingPositive(nums));
    }

    static public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int missingMinNumber = Integer.MAX_VALUE;


    for (int item:nums)
    {
        if (max<item)
            max = item;
        hashMap.put(item,item);
    }

    if (max!=Integer.MAX_VALUE)
        max = max+1;

   if(max<=0)
        max=1;

    for (int i=1;i<=max;i++)
    {

    }

         return missingMinNumber;
    }

    public int missingNumber(int[] nums) {

        int max = Integer.MIN_VALUE;
        int firstXor = 0;
        int secondXor = 0;


        for (int item:nums)
        {
            if (item>max)
            max = item;
        firstXor = firstXor^item;
        }



        for (int i=0;i<=nums.length;i++)
        {
            secondXor = secondXor^i;
        }


return firstXor^secondXor;
    }


}
