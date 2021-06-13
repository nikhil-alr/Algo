package com.company.lovebabar.dp;

import java.math.BigInteger;

public class BionomialCoficant {


    public static void main(String args[])
    {
        int mod = 1000000007;

        int n = 5;
        int k = n+1;
        int r = n;
        n = 2*n;


        int table[][] = new int[n+1][r+1];

        for (int i=0;i<=n;i++)
        {
            for (int j=0;j<=Math.min(i,r);j++)
            {
                if (i==j)
                {
                    table[i][j] = 1;
                    continue;

                }
                 if (j==0)
                 {
                     table[i][j] = 1;
                     continue;
                 }

                 int val = table[i-1][j]%mod;
                 int val2 = table[i-1][j-1]%mod;
                 table[i][j] = (val+val2)%mod;


            }
        }


        System.out.print("BINOMIAL COFICANT"+(table[n][r]/k));
        //ncr = n!/(n-r)!*r!




    }

}
