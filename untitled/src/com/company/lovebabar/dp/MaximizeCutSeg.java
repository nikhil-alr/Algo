package com.company.lovebabar.dp;

public class MaximizeCutSeg {

    public static void main(String args[])
    {
        System.out.print("MAXIMIZE CUT");
        int n = 7;
int x = 5;
int y = 5;
int z = 2;




int array[] = {x,y,z};
        int table[][] = new int[array.length+1][n+1];

        for (int i=0;i<table.length;i++)
        {

            for (int j=0;j<table[0].length;j++)
            {
                if (i==0&&j==0)
                {
                    table[i][j] = 0;
                    continue;
                }
                if (i==0)
                {
                    table[i][j] = 0;
                    continue;
                }
                if (j==0)
                {
                    table[i][j] = 1;
                    continue;
                }

                if (j>=array[i-1])
                {
                    int a = j;
                    int b = array[i-1];
                    int col = (a-b);

int val = 0;
if(table[i][col]>0)
{
    val=1+table[i][col];
}
if (col==0)
{
    val-=1;
}

                    int val1 = val;
                    int val2 = table[i-1][j];
                    table[i][j] = Math.max(val1,val2);
                }
                else
                {
                    table[i][j] = table[i-1][j];
                }

            }

        }

        System.out.print(table[array.length][n]);
    }
}
