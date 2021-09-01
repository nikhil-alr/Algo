package com.company.leetcode;

public class MaximumSubArray {

    public static void main(String args[])
    {
        int array[] = {5,4,-1,7,8};
        System.out.print(maxSubArray(array));
    }

   static public int maxSubArray(int[] nums) {

        int ans = nums[0];
        int tmpAns = nums[0];

        for (int i=1;i<nums.length;i++)
        {
            int num = nums[i];

            if (tmpAns<num)
            {
                if (tmpAns<0)
                    tmpAns = num;
                else
                    tmpAns+=nums[i];

            }
            else
                tmpAns+=nums[i];

            if (tmpAns>ans)
                ans = tmpAns;
        }

        return ans;
    }

}
