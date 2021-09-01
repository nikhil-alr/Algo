package com.company.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {


    public static void main(String args[])
    {
int array[] = {3,2,4};
int tartget = 6;
        int ans[] = twoSum(array,tartget);

        System.out.println("");
    }

//    static public int[] twoSum(int[] nums, int target) {
//
//        int index[] = new int[2];
//
//        Arrays.sort(nums);
//
//        int start = 0;
//        int end = nums.length-1;
//
//        while (start<end)
//        {
//          int ans =   nums[start]+nums[end];
//
//            if (ans==target)
//            {
//index[0] = start;
//index[1] = end;
//break;
//            }
//
//          if (ans<target)
//        {
//            start+=1;
//        }
//
//            if (ans>target)
//            {
//end-=1;
//            }
//
//
//        }
//
//    return index;
//    }


    static public int[] twoSum(int[] nums, int target) {

        int ans[] = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i=0;i< nums.length;i++)
        {
            hashMap.put(nums[i],i);
        }


        for (int i=0;i< nums.length;i++)
        {
            int key = target-nums[i];
if (hashMap.get(key)!=null)
{
    if (hashMap.get(key)==i)
        continue;
    ans[0] = i;
    ans[1] = hashMap.get(key);
    break;
}
        }

     return ans;
    }
}
