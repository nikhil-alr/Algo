package com.company.adityavrma.dp;

public class SubsetSum {

    static int dpTable[][];

    public static void main(String args[])
    {
        System.out.print("SUBSET SUM");
int array[] = {2,4,6,7,10};
int sum = 0;


int arraySum = 0;
for (int item:array)
{
    arraySum+=item;
}
//
//if (arraySum%2!=0)
//{
//    System.out.print(false);
//    return;
//
//}
        sum = arraySum;
        dpTable = new int[array.length+1][sum+1];






for (int i=0;i<=array.length;i++)
{
    for (int j=0;j<=sum;j++)
    {
        if (intlizeDpTable(i,j))
            continue;


        if (j>=array[i-1])
        {

            int col = j-array[i-1];
            dpTable[i][j] = dpTable[i-1][col] + dpTable[i-1][j];
        }
        else
        {
        dpTable[i][j] = dpTable[i-1][j];
        }



    }
}
int lastVal = 0;

int min = Integer.MAX_VALUE;
        for (int i=1;i<dpTable[array.length].length-1;i++)
        {
            if (dpTable[array.length][i]>0)
            {

                if(min>i-lastVal)
                {
                    min = i-lastVal;

                }
                lastVal = i;


            }

        }

        //System.out.print(r2);
        System.out.print(min);
    }



    static boolean intlizeDpTable(int i,int j)
    {

        if (i==0&&j==0)
        {
            dpTable[i][j] = 1;
            return true;
        }

        if (j==0)
        {
            dpTable[i][j] = 1;
            return true;
        }

        if (i==0)
        {
            dpTable[i][j] = 0;
            return true;
        }


        return false;
    }
}
