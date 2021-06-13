package com.company.lovebabar.dp;

public class CoinChangeProblem {

    public static void main(String args[])
    {

        int n = 3;
        int m = 4;
        int array[]={1,2,3};
        int table[][] = new int[n+1][m+1];
        for (int i=0;i<=n;i++)
        {
            for (int j=0;j<=m;j++)
            {
                if (j==0)
                {
                    table[i][j] = 1;
                    continue;
                }
                if (i==0)
                {
                    table[i][j] = 0;
                    continue;
                }

                if (j>=array[i-1])
                {
                    table[i][j] = table[i][j-array[i-1]]+table[i-1][j];
                }
                else
                {
                   table[i][j] = table[i-1][j];
                }
            }

        }
        System.out.print(table[n][m]);



    }

//    static int countSum(int n,int array[],int index)
//    {
//        int count = 0;
//
//        if (n==0)
//            return 1;
//
//        if (n<0||index==0)
//            return 0;
//
//        if (n>=array[index-1])
//        {
//            count = countSum(n-array[index-1],array,index)+countSum(n,array,index-1);
//        }
//        else
//        {
//            count = countSum(n,array,index-1);
//        }
//
//
//        return count;
//    }


}


