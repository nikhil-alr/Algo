package com.company.geeks.dp;

public class SumCount {

    static int table[];
    public static void main(String args[])
    {
        int array[] = {1,3,5};
        int n = 85;
        table = new int[n+1];


        System.out.print(getCount(n));

    }


    static int getCount(int n)
    {
        if (n<0)
            return 0;

        if (n==0)
            return 1;

        if (table[n-1]>0)
            return table[n-1];

        return table[n-1] = getCount(n-1)+getCount(n-3)+getCount(n-5);

    }


}
