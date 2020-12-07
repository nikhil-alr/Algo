package com.company.lovebabar.array;

import java.util.Arrays;

public class FindDuplicateNumber {

    public static void main(String args[])
    {
        int array[] = {3,1,3,4,2};
        Arrays.sort(array);
        for (int i=0;i<array.length-1;i++)
        {
            if (array[i]==array[i+1]) {
            System.out.print(array[i]);
            break;
            }
            }
        }

    }


