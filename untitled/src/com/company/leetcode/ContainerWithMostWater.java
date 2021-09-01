package com.company.leetcode;

public class ContainerWithMostWater {

    public static void main(String args[])
    {
        int area[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(area));
    }

    static public int maxArea(int[] height) {
int maxArea = Integer.MIN_VALUE;

int start = 0;
int end = height.length-1;

while (start<end)
{
    int tmpMax = getMax(height,start,end);
    if (tmpMax>maxArea)
        maxArea = tmpMax;
    int minBoundry = Math.min(height[start], height[end]);
    if (minBoundry==height[start])
    {
      start+=1;
    }
    else
    {
        end-=1;
    }
}


return maxArea;
    }

    static int getMax(int array[],int start,int end)
    {
        int maxArea = Integer.MIN_VALUE;


            int minBoundry = Math.min(array[start],array[end]);
            int tmpMax = (end-start)*minBoundry;
            if (maxArea<tmpMax)
                maxArea = tmpMax;


        return maxArea;
    }

}
