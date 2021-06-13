package com.company.lovebabar.array;

public class SearchMatrix {

    public static void main(String args[])
    {
        int matrix[][] = {};
        int x = 3;
        int row = -1;
        boolean isElementFound = false;
        if(matrix.length>0&&matrix[0].length>0)
        {
        for (int i=0;i< matrix.length;i++)
        {
            if (matrix[i][matrix[0].length-1]>=x)
            {
                row = i;
                break;
            }
        }

        if (row>=0)
        {
            for (int i=0;i<matrix[0].length;i++)
            {
                if (matrix[row][i]==x)
                {
                    isElementFound = true;
                    break;
                }

            }
        }
        }
        System.out.print(isElementFound);

    }

}
