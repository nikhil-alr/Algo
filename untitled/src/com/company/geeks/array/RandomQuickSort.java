package com.company.geeks.array;

import java.util.Random;
import java.util.Scanner;

public class RandomQuickSort {
    static int array[] = {17,2,3,4,-15,-6};

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while (test>0)
        {
            int length = scanner.nextInt();
            array = new int[length];
            for (int i=0;i<length;i++)
            {
                array[i] = scanner.nextInt();
            }


            int smallestElement = scanner.nextInt();

//            System.out.print(length);
//            System.out.print(tmpArray);
//            System.out.print(smallestElement);

            test-=1;
            int kthLargest2 = kthSmallest(smallestElement);
            System.out.println(array[kthLargest2]);


        }


        //System.out.print(array[kthSmallest(1)]);

    }


    static int kthSmallest(int kthSmallest)
    {
        int pivotIndex = -1;
        int low = 0;
        int high = array.length-1;

        kthSmallest-=1;
        while (true)
        {

            pivotIndex  = quickPartation(array,low, high);
            if (pivotIndex==kthSmallest)
                break;
            if(pivotIndex>kthSmallest)
                high=pivotIndex;
            else
                low = pivotIndex;
            System.out.print("");
        }
        return pivotIndex;
    }

    public static int quickPartation(int array[],int low,int high)
    {
        int index = low-1;
        Random random = new  Random();

        int pivotIndex = random.nextInt((high-low)+1)+low;
        int tmp = array[pivotIndex];
        array[pivotIndex] = array[high];
        array[high] = tmp;
        pivotIndex = high;
        for (int i=low;i<high;i++)
        {

            if(array[i]<=array[pivotIndex])
            {
                index+=1;
                tmp = array[index];
                array[index] = array[i];
                array[i] = tmp;

            }


        }

        index+=1;
        tmp = array[index];
        array[index] = array[pivotIndex];
        array[pivotIndex] = tmp;

        return index;
    }


}
