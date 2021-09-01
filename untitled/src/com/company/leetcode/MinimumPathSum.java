package com.company.leetcode;

public class MinimumPathSum {

    public static void main(String args[])
    {
       int grid[][] = {{1,2,3},{4,5,6}};
       System.out.print(minPathSum(grid));
    }

    static public int minPathSum(int[][] grid) {

        int dp[][] = new int[grid.length][grid[0].length];
return getMinPathSum(grid,0,0,dp);
    }

    static public int getMinPathSum(int grid[][],int row,int col,int dp[][])
    {

        if (row>= grid.length||col>= grid[row].length)
            return -1;

        if (row== grid.length-1&&col== grid[row].length-1)
            return grid[row][col];

        if ( dp[row][col]!=0)
            return  dp[row][col];

        int pathOneSum = getMinPathSum(grid,row,col+1,dp);
        int pathTwoSum = getMinPathSum(grid,row+1,col,dp);
pathOneSum = pathOneSum==-1?Integer.MAX_VALUE:pathOneSum;
pathTwoSum = pathTwoSum==-1?Integer.MAX_VALUE:pathTwoSum;

int minSum = Math.min(pathOneSum,pathTwoSum);
  return dp[row][col] = minSum==Integer.MAX_VALUE?-1:(minSum+grid[row][col]);

    }



}
