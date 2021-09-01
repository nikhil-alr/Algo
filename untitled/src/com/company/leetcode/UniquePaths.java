package com.company.leetcode;

public class UniquePaths {

    public static void main(String args[])
    {

System.out.print(uniquePaths(3,7));

    }

    static public int uniquePaths(int m, int n) {
       int dp[][] = new int[m+1][n+1];
        return totalUniquePaths(m,n,0,0,dp);
    }


    static public int totalUniquePaths(int m,int n,int currentPosRow,int currentPosCol,int dp[][])
    {
        int totalUniquePath = 0;

        if (currentPosRow>=m||currentPosCol>=n)
            return 0;

        if (currentPosRow==m-1&&currentPosCol==n-1)
            return 1;


        if(dp[currentPosRow][currentPosCol]!=0)
            return dp[currentPosRow][currentPosCol];

        totalUniquePath=totalUniquePaths(m,n,currentPosRow,currentPosCol+1,dp)+totalUniquePaths(m,n,currentPosRow+1,currentPosCol,dp);

        return dp[currentPosRow][currentPosCol] = totalUniquePath;
    }

}
