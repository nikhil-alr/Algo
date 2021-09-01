package com.company.leetcode;

public class NextPermutation {

    public static void main(String args[])
    {
        int array[]={1,2,3,4};
        nextPermutation(array);
        System.out.print("");

        nextPermutation(array);
        System.out.print("");

        nextPermutation(array);
        System.out.print("");

        nextPermutation(array);
        System.out.print("");

        nextPermutation(array);
        System.out.print("");

        nextPermutation(array);
        System.out.print("");

        nextPermutation(array);
        System.out.print("");

        nextPermutation(array);
        System.out.print("");

        nextPermutation(array);
        System.out.print("");
    }


    static public void nextPermutation(int[] array) {

        int firstIndex = 0;
        int secondIndex = 0;

        for (int i= array.length-2;i>0;i--)
        {
            if (array[i]<array[i+1])
            {
                firstIndex = i;
                break;

            }
        }

        for (int i= array.length-1;i>firstIndex;i--)
        {
            if (array[firstIndex]<array[i])
            {
                secondIndex = i;
                break;
            }


        }

        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;

        int i=firstIndex+1;
        int j = array.length-1;
        while (i<j)
        {

            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;

            i+=1;
            j-=1;
        }


    }


}
