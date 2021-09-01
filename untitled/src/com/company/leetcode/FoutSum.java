package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoutSum {

    public static void main(String args[])
    {
int array[] = {-3,-2,-1,0,0,1,2,3};
System.out.print(fourSum(array,0));

    }

   static public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0;i< nums.length-3;i++)
        {
           System.out.print("");
            for (int j=i+1;j< nums.length-2;j++)
            {
                int k = j+1;
                int l = nums.length-1;
                while (k<l)
                {
                    int sum = nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target)
                    {
                        List list = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        if(!ansList.contains(list))
                        ansList.add(list);
                        k+=1;
                      l-=1;
                      continue;
                    }
                    if(sum<target)
                    {
                       k+=1;
                    }
                    else
                    {
                        l-=1;
                    }
                }
            }
        }


        return ansList;
    }
}
