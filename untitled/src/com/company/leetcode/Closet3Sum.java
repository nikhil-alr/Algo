package com.company.leetcode;

import java.util.Arrays;

public class Closet3Sum {

    public static void main(String args[])
    {

        int array[]={1,1,-1,-1,3};
        int target = -1;
        System.out.print(threeSumClosest(array,target));
    }

    static public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int minClosest = nums[0]+nums[1]+nums[nums.length-1];

        for (int i=0;i< nums.length;i++)
        {
            int j= i+1;
            int k = nums.length-1;
            while (j<k)
            {
                int val = nums[i]+(nums[j]+nums[k]);

                int tmpClosest = Math.abs(target-val);
                int aval = Math.abs(target-minClosest);
                if (tmpClosest<aval)
                    minClosest = val;

                if (val<target)
                {
                   j+=1;
                }
               else
                {
                    k-=1;
                }
            }
        }

        return minClosest;
    }

}
