package com.company.leetcode;

public class ClimgStairs {

    public static void main(String args[])
    {
System.out.print(climbStairs(3));
    }



    static public int climbStairs(int n) {

        int dp[] = new int[n+1];
return getTotalWays(n,dp);
    }

    static int getTotalWays(int n,int[]dp)
    {


        if (n==0)
            return 1;

        if (n==1)
            return 1;

        if (dp[n]!=0)
            return dp[n];

        int wayOne = getTotalWays(n-2,dp);
        int wayTwo = getTotalWays(n-1,dp);

        return dp[n] = wayOne+wayTwo;

    }

}
