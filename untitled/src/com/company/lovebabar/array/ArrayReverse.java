package com.company.lovebabar.array;

public class ArrayReverse {

    public static void main(String args[])
    {
        int array[] = {1,2,3,4,5,6,7};

        int i=0;
        int j = array.length-1;
    while (i<j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;

        i+=1;
        j-=1;

    }

    for (int element:array)
    {
        System.out.print(element);
    }

    }




}
