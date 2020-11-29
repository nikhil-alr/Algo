package com.company.lovebabar.array;

public class MaxAndMin {

    public static void main(String args[])
    {
        int array[]={1,2,3,4,5,6,7,8};
        //usingLinearSearch(array);
        usingTournamentMethod(array);
    }

    public static void usingLinearSearch(int array[])
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int elment:array)
        {
            if (max<elment)
                max = elment;

            if (min>elment)
                min = elment;

        }

        System.out.println(max);
        System.out.print(min);
    }

    public static void usingTournamentMethod(int array[])
    {
       // System.out.print(divCompareMax(array,0,array.length-1));
        System.out.print(divCompareMin(array,0,array.length-1));
    }

    public static int divCompareMax(int array[],int minIndex,int maxIndex)
    {
        if(maxIndex-minIndex<=1)
        {
            return array[maxIndex]>array[minIndex]?array[maxIndex]:array[minIndex];
        }

int mid = (minIndex+maxIndex)/2;

int value1 = divCompareMax(array,minIndex,mid);
int value2 = divCompareMax(array,mid+1,maxIndex);
        return value2>value1?value2:value1;
    }


    public static int divCompareMin(int array[],int minIndex,int maxIndex)
    {
        if(maxIndex-minIndex<=1)
        {
            return array[maxIndex]<array[minIndex]?array[maxIndex]:array[minIndex];
        }

        int mid = (minIndex+maxIndex)/2;

        int value1 = divCompareMin(array,minIndex,mid);
        int value2 = divCompareMin(array,mid+1,maxIndex);
        return value2<value1?value2:value1;
    }

}
