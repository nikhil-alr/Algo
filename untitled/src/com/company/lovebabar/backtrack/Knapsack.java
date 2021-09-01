package com.company.lovebabar.backtrack;

public class Knapsack {

    static int[][]dp = null;

    public static void main(String args[])
    {
        int value[] = {15,14,10,45,30};
        int weight[] = {2,5,1,3,4};
        int capcity = 7;
        dp = new int[value.length+1][capcity+1];
        System.out.println(getMaxVal(weight,value,capcity));
    }

    static int getMaxVal(int[]weight,int[]val,int cap,int arrayCounter)
    {




        if(cap==0||arrayCounter == -1)
        {
            return 0;
        }

        if (dp[arrayCounter][cap]!=0)
            return dp[arrayCounter][cap];


        if (cap>=weight[arrayCounter])
        {
          return dp[arrayCounter][cap] = Math.max(val[arrayCounter]+getMaxVal(weight,val,cap-weight[arrayCounter],arrayCounter-1),getMaxVal(weight,val,cap,arrayCounter-1));
        }
        else
        {

         return dp[arrayCounter][cap] =  getMaxVal(weight,val,cap,arrayCounter-1);
        }

    }

    static int getMaxVal(int[] weight,int[]val,int cap)
    {
        int max = 0;

        int matrix[][] = new int[weight.length+1][cap+1];

        for (int row=0;row<matrix.length;row++)
        {
            matrix[row][0] = 0;
        }

        for (int col=0;col<matrix[0].length;col++)
        {
            matrix[0][col] = 0;
        }


        for (int row=1;row<matrix.length;row++)
        {
            for (int bagCap=1;bagCap< matrix[row].length;bagCap++)
            {
                if (bagCap>=weight[row-1])
                {
                    int value = Math.max(val[row-1]+ matrix[row-1][bagCap-weight[row-1]],matrix[row-1][bagCap]);
                    matrix[row][bagCap] = value;
                }
                else
                {
                    matrix[row][bagCap] = matrix[row-1][bagCap];
                }
            }
        }



        max = matrix[weight.length][cap];

        return max;
    }


}
