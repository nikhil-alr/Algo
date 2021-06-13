package com.company.lovebabar.Heap;

public class Heap {

    public static void main(String args[])
    {
        int arr[] = {4,1,3,9,7};
         int startIdx = (arr.length/2)-1;
        for (int i=startIdx;i>=0;i--)
        {
            heapfy(arr,i);
        }

        System.out.print("");

    }

    static void heapfy(int array[],int index)
    {
        int left = 2*index+1;
        int right = 2*index+2;

        if(left>=array.length)
            left = index;

        if(right>=array.length)
            right = left;

        if (array[left]>array[right])
        {
            left = right;
        }

        if(array[index]>array[left])
        {
            int tmp = array[index];
            array[index] = array[left];
            array[left] = tmp;
        }

        if(left!=index)
        {
            heapfy(array,left);
        }

    }



}
