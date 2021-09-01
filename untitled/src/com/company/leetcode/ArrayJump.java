package com.company.leetcode;

public class ArrayJump {

    public static void main(String args[])
    {
int array[]={2,3,0,1,4};
System.out.print(jump(array));
    }

    static public int jump(int[] nums) {

        int minJump = 0;
        int dp[] = new int[nums.length];

        minJump = getMaxJump(nums,0,dp);

        return minJump;

    }



    static int getMaxJump(int nums[],int index,int dp[])
    {
        int minJump = Integer.MAX_VALUE;

        if (index>=nums.length)
        {
            return -1;
        }

        if (index== nums.length-1)
        {
            return 0;
        }
        int maxJumpCanBeTake = nums[index];

        if (maxJumpCanBeTake==0)
            return -1;

        if (dp[index]!=0)
           return dp[index];

        for (int i=maxJumpCanBeTake;i>0;i--)
        {

            int jump = 0;
             jump = getMaxJump(nums,index+i,dp);



            if (jump!=-1)
            {
                jump = jump+1;
                if (jump<minJump)
                    minJump = jump;
            }
        }

        return dp[index] = minJump==Integer.MAX_VALUE?-1:minJump;
    }

}
