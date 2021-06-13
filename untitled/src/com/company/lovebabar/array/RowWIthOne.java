package com.company.lovebabar.array;

public class RowWIthOne {


    public static void main(String args[])
    {
        int Arr[][] = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};

        int onePos = Arr[0].length-1;
        for (int i=Arr[0].length-1;i>=0;i--)
        {
            if (Arr[0][i]>0)
            {
                onePos-=1;
            }
        }

        int row = 0;
        for (int i=1;i<Arr.length;i++)
        {
            while (onePos>=0&&Arr[i][onePos]>0)
            {
                row = i;
                onePos-=1;
            }
        }

        if (onePos==Arr[0].length-1)
            row = -1;
        System.out.print(row);
    }

}
