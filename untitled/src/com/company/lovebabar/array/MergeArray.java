package com.company.lovebabar.array;

public class MergeArray {

    public static void main()
    {
        int array1[]= {1,2,3,4,5,6,7};
        int array2[] = {2,3,4,5,6};
        mergeUsingGapMethod(array1,array2);


    }

    public static void mergeUsingGapMethod(int[] array1,int[] array2)
    {
        int smallArraySize = array2.length< array1.length? array2.length : array1.length;
        int largeArraySize = array2.length< array1.length? array2.length : array1.length;

        

    }
}
