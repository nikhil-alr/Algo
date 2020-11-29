package com.company.lovebabar.array;

import java.util.Arrays;
import java.util.Collections;

public class TowerHeight {

    public static void main(String args[])
    {
        int min = Integer.MAX_VALUE;
        int minValue1 = Integer.MAX_VALUE;
        int maxValue1 = Integer.MIN_VALUE;
        int minValue2 = Integer.MAX_VALUE;
        int maxValue2 = Integer.MIN_VALUE;
        int array [] = {2,6,3,4,7,2,10,3,2,1};
        int array2[] = {2,6,3,4,7,2,10,3,2,1};
        int k = 5;

        Arrays.sort(array);


        for (int i=0;i< array.length;i++)
        {

            if (array[i]+k>=0)
                array[i]+=k;



            if (minValue1>array[i])
                minValue1 = array[i];

            if (maxValue1<array[i])
                maxValue1 = array[i];
        }

        //Arrays.sort(array);

        for (int i=0;i< array2.length;i++)
        {
            if (array2[i]-k>0)
                array2[i]-=k;



            if (array2[i]<0)
                array2[i] = 0;

            if (minValue2>array2[i])
                minValue2 = array2[i];

            if (maxValue2<array2[i])
                maxValue2 = array2[i];
        }


        min = maxValue1-minValue1;

        if (min>maxValue2-minValue2)
            min = maxValue2-minValue2;

        if(maxValue2>minValue1)
        {
            if (min>maxValue2-minValue1)
                min = maxValue2-minValue1;
        }


        if(maxValue1>minValue2)
        {
            if (min>maxValue1-minValue2)
                min = maxValue1-minValue2;

        }

        System.out.print(min);

    }

}
