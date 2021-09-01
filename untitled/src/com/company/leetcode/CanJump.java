package com.company.leetcode;

import java.util.Arrays;

public class CanJump {

    public static void main(String args[])
    {
        int array[] = {2,1,1,0,4};
System.out.print(canJump(array));
    }

    static public boolean canJump(int[] nums) {

        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return canJump(nums,0,dp);
    }



    static public boolean canJump(int[]nums,int index,int[]dp)
    {
        boolean canJump = false;
        if (index>=nums.length)
            return false;

        if (index==nums.length-1)
            return true;

    int maxJump = nums[index];

    if (maxJump==0)
        return false;

    if (dp[index]!=-1)
        return dp[index]==1?true:false;

    for (int i=maxJump;i>0;i--)
    {
        canJump = canJump(nums,i+index,dp);
    if (canJump)
        break;
    }
    dp[index] = canJump==true?1:0;
return canJump;
    }


}
