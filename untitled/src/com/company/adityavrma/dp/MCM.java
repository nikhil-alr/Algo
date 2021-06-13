package com.company.adityavrma.dp;

public class MCM {

   static int array[]= {10,20,30,40,50};

    public static void main(String args[])
    {

        mcmTopDown(0,array.length);

    }

    public static int mcmTopDown(int start,int end)
    {
        int ans = 0;

        if (end==start)
            return 0;
        

        for (int i=start;i<end;i++)
        {
            int left = mcmTopDown(start,i);
            int right = mcmTopDown(i+1,end);
            ans = left+right+(array[i-1]*array[i]*array[end]);
        }

        return ans;
    }

}
