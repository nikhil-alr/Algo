package com.company.leetcode.tree;

public class CatlianNumber {

    int dp[];
    public static void main(String args[])
    {

        System.out.print(getCatlianNumber(2));
    }

    static int getCatlianNumber(int n)
    {
        if(n==0||n==1)
            return 1;
        int ans = 0;

        for (int i=0;i<n;i++)
        {
            ans+=getCatlianNumber(i)*getCatlianNumber(n-i-1);
        }
        return ans;
    }

}
