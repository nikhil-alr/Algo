package com.company.lovebabar.array;

import java.util.HashMap;

public class SubArrayWithZeroSum {



    public static void main(String args[])
    {

        HashMap<Integer,Integer> hashMap = new HashMap();
int array[] = {-45,-30,-14,-6,-24,-28,15,-42,-34,32,8,-26,-13,12,-26,-50,-14,2,49,29,0,18,21,23,-19,31,-20,-17,44};
int totalVal = 0;
String isZeroSumPresent = "No";
for (int item:array)
{
    totalVal+=item;
    if (hashMap.containsKey(totalVal))
    {
        isZeroSumPresent = "Yes";
        break;
    }
    hashMap.put(totalVal,totalVal);
}
System.out.print(isZeroSumPresent);
    }


}
