package com.company.lovebabar.dp;

public class SubsetSum {


    public static void main(String args[])
    {
        System.out.print("Subset sum");
        int array[] = {1, 3, 5};


        int totalSum = 0;
        for (int item : array)
        {
          totalSum+=item;
        }

        if(totalSum%2!=0)
        {
            System.out.print(0);
            return;
        }

        totalSum = totalSum/2;

        boolean table[][] = new boolean[array.length+1][totalSum+1];

        for (int i=0;i<table.length;i++)
        {
            for (int j=0;j<table[0].length;j++)
            {
                if (i==0&&j==0)
                {
                    table[i][j] = true;
                    continue;
                }

                if (i==0)
                {
                    table[i][j] = false;
                continue;
                }

                if (j==0)
                {
                    table[i][j] = false;
                    continue;
                }

                if (j>=array[i-1])
                {
                    table[i][j] = table[i-1][j-array[i-1]]||table[i-1][j];
                }
                else
                {
                    table[i][j] = table[i-1][j];
                }

            }
        }
System.out.print(table[array.length][totalSum]?1:0);


    }

}
