package com.company.leetcode;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String args[])
    {
        int array[] = {2,3,5};
        List<List<Integer>> list = combinationSum(array,8);
        System.out.print(list);
    }

    static public List<List<Integer>> combinationSum(int[] candidates, int target) {

        return printCombinationSum(candidates,target,0,new ArrayList<>());



    }


    static List<List<Integer>> printCombinationSum(int[] nums,int target,int index,List<Integer> usedNumber)
    {
        List<List<Integer>> ansList = new ArrayList<>();
        if (index==nums.length)
            return new ArrayList<>();

        if (target==0)
        {
            //System.out.println(usedNumber);
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(usedNumber));
            return list;
        }



       if (target>=nums[index])
       {

           usedNumber.add(nums[index]);

           List ansList1 = printCombinationSum(nums,target-nums[index],index,usedNumber);
           if (ansList1.size()!=0)
           {
               ansList.addAll(ansList1);
           }
           usedNumber.remove(usedNumber.size()-1);
           List ansList2 = printCombinationSum(nums,target,index+1,usedNumber);
           if (ansList2.size()!=0)
           {
               ansList.addAll(ansList2);
           }

           return ansList;
       }
       else
       {
           List<List<Integer>> ansList1= printCombinationSum(nums,target,index+1,usedNumber);
           if (ansList1.size()!=0)
           {
               ansList.addAll(ansList1);
           }
           return ansList;
       }


    }

}
