package com.company.lovebabar.array;

public class MediaOfMatrix {

    public static void main(String args[])
    {
        int R = 3;
        int C = 3;
        int M[][] = {{1, 3, 15},
                     {2, 6, 9},
                     {3, 6, 9}};

        sortMatrixUsinGap(M,R,C);


    }


    static void sortMatrixUsinGap(int matrix[][],int row,int col)
    {


        for (int i=row-1;i>0;i--)
        {
            sortUsingGap(matrix[i-1],matrix[i]);
        }

        System.out.print("");
    }


    static public int getGap(int n)
    {
        if (n==1)
            return 0;
        return n/2+n%2;
    }

    static void sortUsingGap(int array1[],int array2[])
    {

        int n = (array1.length+ array2.length);
        int gap = getGap(n);
        while (gap>0)
        {
            int windowL = 0;
            int windowR = gap;

            while (windowR<array1.length)
            {
                if(array1[windowL]>array1[windowR])
                {

                int tmp = array1[windowL];
                array1[windowL] = array1[windowR];
                array1[windowR] = tmp;
                }
                windowL+=1;
                windowR=windowR+gap;
            }

            windowR = gap>array1.length?gap- array1.length:0;
            while (windowL< array1.length&&windowR< array2.length)
            {
                if(array1[windowL]>array2[windowR])
                {
                    int tmp = array1[windowL];
                    array1[windowL] = array2[windowR];
                    array2[windowR] = tmp;
                }
                windowR+=1;
                windowL+=1;
            }

            windowL = windowR-gap;
            while (windowR< array2.length)
            {
                if (array2[windowL] > array2[windowR])
                {
                 int tmp = array2[windowL];
                array2[windowL] = array2[windowR];
                array2[windowR] = tmp;

                }
                windowL+=1;
                windowR=windowR+gap;
            }

            gap = getGap(gap);
        }

    }


}
