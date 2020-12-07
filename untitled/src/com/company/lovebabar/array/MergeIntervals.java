package com.company.lovebabar.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String args[])
    {
        System.out.print("Merge intervals");
        int array[][] = {{1,4},{0,4}};


        java.util.Arrays.sort(array, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Double.compare(a[0], b[0]);
            }
        });




        int lastRangeIndex = 0;
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        arrayList.add(array[lastRangeIndex]);

        for (int i=1;i< array.length;i++)
        {
           //is current range intersect last range
           if(array[lastRangeIndex][1]>=array[i][0])
           {

               continue;
           }

           lastRangeIndex = i;
            arrayList.add(array[lastRangeIndex]);

        }

        int ansArray[][] = new int[arrayList.size()][2];

        for (int i=0;i< arrayList.size();i++)
        {
            ansArray[i] = arrayList.get(i);
        }

System.out.print("");
    }

}
