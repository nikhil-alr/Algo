package com.company.lovebabar.array;

import java.util.Arrays;

public class CholectDist {

    public static void main(String args[])
    {
        System.out.print("HELLO");
        int array[]={3,4,1,9,56,7,9,12};
        int m = 5;
        Arrays.sort(array);
        int small = array[0];
        int max = array[m-1];

        System.out.print(max-small);

    }


}
