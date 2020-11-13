package com.company.leetcode.array;

import java.util.Arrays;
import java.util.Collections;

public class MaxArea {

    public static void main(String args[])
    {
        int horizontalCuts[] = {3};
        int verticalCuts [] = {3};





        processQuery(4,5,horizontalCuts,verticalCuts);
    }

    static public void processQuery(int w,int h,int[] horizontalCut, int[]verticalCut)
    {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);

        int MOD=1000000007;
        int horizoMax = horizontalCut[0];
        int verticalMax = verticalCut[0];

        for (int i=1;i<horizontalCut.length;i++)
        {
            horizoMax = Math.max(horizoMax, horizontalCut[i]-horizontalCut[i-1]);

        }

        horizoMax = Math.max(horizoMax, h - horizontalCut[horizontalCut.length-1]);



        for (int i=1;i<verticalCut.length;i++)
        {
            verticalMax = Math.max(verticalMax, verticalCut[i]-verticalCut[i]);

        }

        verticalMax = Math.max(verticalMax, w - verticalCut[verticalCut.length-1]);






        System.out.print((horizoMax*verticalMax)%MOD);
    }




}
