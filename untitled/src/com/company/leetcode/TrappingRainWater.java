package com.company.leetcode;

import java.util.LinkedList;
import java.util.Stack;

public class TrappingRainWater {

public static void main(String args[])
{
    int height[] = {4,2,0,3,2,5};
    System.out.print(trap(height));;
}

   static public int trap(int[] height) {

    int tmpWaterTrap = 0;
    int maxWaterTrap = 0;
    int startIndex = -1;
    int endIndex = -1;

       if (height.length<3)
           return 0;


    for (int i=0;i< height.length;i++)
    {
    if (height[i]!=0)
    {
        startIndex = i;
        break;
    }

    }

       if (startIndex==-1)
           return maxWaterTrap;


       Stack<Integer> stack = new Stack<>();
    for(int i= height.length-1;i>startIndex+1;i--)
    {
        stack.add(height[i]);
    }





    return maxWaterTrap;
    }



}






