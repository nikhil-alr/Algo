package com.company.geeks.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeKSortedArray {

static class HeapNode
{
    HeapNode()
    {}
    public HeapNode(int item,int column)
    {
        this.item = item;
        this.column = column;
    }
    int item = 0;
    int column = 0;
}

    public static void main(String args[]) {
        int array[][] = {{3,23,59,70,71},{4,12,57,94,99},{1,5,9,19,59}};

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i< array[0].length;i++)
        {
            arrayList.add(array[0][i]);
        }

        for (int i=1;i< array.length;i++)
        {
            arrayList =  mergeUsingGapp(arrayList,array[i]);
        }

}


static int getGap(int n)
{
if(n==1)
    return 0;
return (n/2)+(n%2);
}

public static ArrayList<Integer> mergeUsingGapp(ArrayList<Integer> arrrayList,int array[])
    {
        int mergedArray[] = new int[arrrayList.size()];
for (int i=0;i< arrrayList.size();i++)
{
    mergedArray[i] = arrrayList.get(i);
}


int minLength = array.length< mergedArray.length?array.length: mergedArray.length;

for (int i=0;i<minLength;i++) {
    if (mergedArray[mergedArray.length - i - 1] > array[i]) {
        int tmp = mergedArray[mergedArray.length - i - 1];
        mergedArray[mergedArray.length - i - 1] = array[i];
        array[i] = tmp;
    }
}

int length = mergedArray.length;
    int gap = getGap(length);
    while (gap>0)
    {
      int lowerBound = 0;
      int upperBound = gap;
while (upperBound<length)
{
    if(mergedArray[lowerBound]>mergedArray[upperBound])
    {
        int tmp = mergedArray[lowerBound];
        mergedArray[lowerBound] = mergedArray[upperBound];
        mergedArray[upperBound]=tmp;
    }
    lowerBound+=1;
    upperBound+=1;
}
    gap = getGap(gap);
    }



     length = array.length;
     gap = getGap(length);
    while (gap>0)
    {
        int lowerBound = 0;
        int upperBound = gap;
        while (upperBound<length)
        {
            if(array[lowerBound]>array[upperBound])
            {
                int tmp = array[lowerBound];
                array[lowerBound] = array[upperBound];
                array[upperBound]=tmp;
            }
            lowerBound+=1;
            upperBound+=1;
        }
        gap = getGap(gap);
    }


ArrayList<Integer> tmpArray = new ArrayList<>();
for (int i=0;i< mergedArray.length;i++)
{
    tmpArray.add(mergedArray[i]);
}
        for (int i=0;i< array.length;i++)
        {
            tmpArray.add(array[i]);
        }
return tmpArray;
    }

    public static void mergeUsingHeap()
    {

    }

    public static void mergerUsingMathTrick()
    {

    }













//    public static void mergeUsingMath(int array[][])
//    {
//
//    }


}
