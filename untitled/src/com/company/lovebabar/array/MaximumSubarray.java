package com.company.lovebabar.array;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class MaximumSubarray {

public static void main(String args[])
{
    int array[] = {74,-72,94,-53,-59,-3,-66,36,-13,22,73,15,-52,75
    };
    System.out.print(maximumSubArray(array));
}
public static int maximumSubArray(int array[])
{
int maxSubArray = array[0];
int maxValue = array[0];


for (int i=1;i<array.length;i++)
{

    maxValue = maxValue+array[i];
if (maxValue<array[i])
    maxValue = array[i];

    if (maxSubArray<maxValue)
    maxSubArray = maxValue;
}
return maxSubArray;
}
}
