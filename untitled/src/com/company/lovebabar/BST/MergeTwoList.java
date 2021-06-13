package com.company.lovebabar.BST;

public class MergeTwoList {


    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,2,3,5,6,7,1,2,1,4,3,5,1,2,3,6,5,4,3,6,7,8,1};

        int first[] = { 10, 27, 38, 43, 82 };
        int second[] = { 3, 9 };
        //mergeSort(a,0,a.length-1);
        //mergeUsingGap(first, second);


for (int item:a)
{
    System.out.print(item);
}



    }


    static void mergeSort(int array[],int start,int end)
    {
        if(start>=end)
            return;
        int mid = (start+end)/2;
        mergeSort(array,start,mid);
        mergeSort(array,mid+1,end);
        //mergeUsingGap(array,start,end);
        //traditionalMerge(array,start,end);

    }

    static void mergeUsingGap(long array1[],long array2[])
    {
int g = getGap(array1.length+array2.length);
while (g>0)
{
    int start = 0;
    int end = g;
    while (end< array1.length)
    {
        if (array1[start]>array1[end])
        {
            long tmp = array1[start];
            array1[start] = array1[end];
            array1[end] = tmp;
        }
    start+=1;
    end+=1;
    }

    end = end-array1.length;
    while (start<array1.length&&end<array2.length)
    {
        if(array1[start]>array2[end])
        {
            long tmp = array1[start];
            array1[start] = array2[end];
            array2[end] = tmp;
        }
        start+=1;
        end+=1;
    }

start=0;
    while (end<array2.length)
    {

        if(array2[start]>array2[end])
        {
            long tmp = array2[start];
            array2[start] = array2[end];
            array2[end] = tmp;
        }
        start+=1;
        end+=1;
    }


    g = getGap(g);
}
     }


    static int getGap(int n)
    {
       if(n<=1)
           return 0;
        n = (int) Math.ceil(n/2.0);
       return n;
    }

    static public void traditionalMerge(int array[],int start,int end)
    {
        int mid = (start+end)/2;

        int left[] = new int[mid-start+1];
        int right[] = new int[end-mid];

        int leftCounter = 0;
        int rightCounter = 0;

        for (int i=start;i<=mid;i++)
        {
            left[leftCounter] = array[i];
            leftCounter+=1;
        }

        for (int i=mid+1;i<=end;i++)
        {
            right[rightCounter] = array[i];
            rightCounter+=1;
        }

        leftCounter=0;
        rightCounter = 0;
        int arrayCounter = start;
        while (leftCounter<left.length&&rightCounter<right.length)
        {
            if(left[leftCounter]<right[rightCounter])
            {

                array[arrayCounter]=left[leftCounter];
                leftCounter+=1;
            }
            else
            {
                array[arrayCounter]=right[rightCounter];
                rightCounter+=1;
            }
            arrayCounter+=1;
        }

        while (leftCounter<left.length)
        {
            array[arrayCounter] = left[leftCounter];
            leftCounter+=1;
            arrayCounter+=1;
        }

        while (rightCounter<right.length)
        {
            array[arrayCounter] = right[rightCounter];
            rightCounter+=1;
            arrayCounter+=1;
        }


    }
}
