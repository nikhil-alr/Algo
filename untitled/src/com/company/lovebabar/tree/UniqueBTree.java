package com.company.lovebabar.tree;

import java.sql.Statement;

public class UniqueBTree {

    public static void main(String args[])
    {

        System.out.print(getCatlinaNumber(5));


    }

    static int getCatlinaNumber(int n)
    {
        if (n==0)
            return 1;
        if (n==1)
            return 1;
        return getCatlinaNumber(n-1)+getCatlinaNumber(n-2);

    }
}
