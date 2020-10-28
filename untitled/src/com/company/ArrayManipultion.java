package com.company;

import java.util.ArrayList;

public class ArrayManipultion {

    static int localSubArray = 0;
    static int maxSubArray = 0;
    public static void main(String args[])
    {
        int n = 10;
        int queryArray[][] = {{1,2,100},{2,5,100},{3,4,100}};
        int array[] = new int [n];

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        a.add(0,500);

        System.out.print("");

        //System.out.print(arrayManipulation(5,queryArray));

    }

    static long arrayManipulation(int n, int[][] queries) {
        int array[] = new int [n+1];
        long localSubArray = 0;
        long maxSubArray = 0;
        for (int i=0;i<queries.length;i++)
        {
            int index = queries[i][0]-1;
            array[index]=array[index]+queries[i][2];
            array[queries[i][1]]= array[queries[i][1]]-queries[i][2];
        }

        for (int i=0;i<n;i++)
        {
            localSubArray+=Long.valueOf(array[i]);
            if(maxSubArray<localSubArray)
                maxSubArray = localSubArray;
        }


        //System.out.print(maxSubArray);

        return maxSubArray;
    }


}
