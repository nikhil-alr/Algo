package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenrateAllPermutation {

    public static void main(String args[])
    {
        int array[] = {1,2,3};
permute(array);
    }

   static public List<List<Integer>> permute(int[] nums) {

        return printAllPermutatoin(nums,0);
    }


    static public List<List<Integer>> printAllPermutatoin(int[] nums,int index)
    {
        List<List<Integer>> ans = new ArrayList<>();

        if (index==nums.length)
        {
            //print num
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<nums.length;i++)
            {
                list.add(nums[i]);
            }
            ans.add(list);
            return ans;
        }

        for (int i=index;i<nums.length;i++)
        {
            //Swap
            int tmp = nums[index];
            nums[index] = nums[i];
            nums[i] = tmp;

            List list = printAllPermutatoin(nums,index+1);

            ans.addAll(list);

            tmp = nums[index];
            nums[index] = nums[i];
            nums[i] = tmp;
        }
return ans;
    }

}
