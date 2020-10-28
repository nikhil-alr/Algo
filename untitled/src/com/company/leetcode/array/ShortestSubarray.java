package com.company.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class ShortestSubarray {

    public static void main(String args[])
    {
        int arr[] = {1,2,3,10,4,2,3,5};
        shortestSubarry(arr);

        System.out.print("Remove Shortest Subarray");
    }

    static void shortestSubarry(int array[])
    {
        List<Integer[]> list = new ArrayList<>();
        int indexCount = 0;
        int decreasingIndex=0;
        int nextIndex = 0;
        while (decreasingIndex<array.length-1)
        {

            decreasingIndex = getIncreasingSubarray(nextIndex,array,decreasingIndex,list);
            nextIndex = decreasingIndex+1;
            indexCount+=1;

        }

        System.out.print("");
        shortestSubArrayCount(list);


    }

    static int shortestSubArrayCount(List<Integer[]> list)
    {
        int count = 0;
        int shortestVal = 0;

        for (int i=0;i<list.size()-1;i++)
        {
            for (int j=i+1;j<list.size();j++)
            {
                Integer[] arrayOne = list.get(i);
                Integer[] arrayTwo = list.get(j);

                getShortestSubbarray(arrayOne,arrayTwo);

            }
            System.out.println("");
        }


        return count;
    }


    static void getShortestSubbarray(Integer[] array1,Integer[] array2)


    {
        int firstVal = array1[0];
        int secondVal = array1[1];

        int thirdVal = array2[0];
        int fourthVal = array2[1];

        if(array1[0]!=0)
            firstVal+=1;

        if(array2[0]!=0)
            thirdVal+=1;

        System.out.print((secondVal-firstVal)+1);


        System.out.print("---");

        System.out.print((fourthVal-thirdVal)+1);
        System.out.println("");



    }


static int getIncreasingSubarray(int start,int array[],int lastElment,List<Integer[]> list)
    {
        int i = start;
        for (i=start;i<array.length-1;i++)
        {
            if(array[i]>array[i+1])

            {
//                System.out.print(lastElment);
//                System.out.print(i);
                list.add(new Integer[]{lastElment,i});
                return i;

            }

        }

        list.add(new Integer[]{lastElment,i});
//        System.out.print(lastElment);
//        System.out.print(i);
        return i;
    }






}
