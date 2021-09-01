package com.company.lovebabar.backtrack;

public class SubsetPresent {

    public static void main(String args[])
    {
        int array[] = {2,3,5,6,8,10};
        int subset = 10;
        System.out.println(isSubsetPresent(array,subset));
    }

    static int isSubsetPresent(int array[],int subset,int arrayCounter)
    {

  if (subset==0)
    return 1;

        if (arrayCounter==array.length||subset<0)
            return 0;

 return isSubsetPresent(array,subset-array[arrayCounter],arrayCounter+1)+isSubsetPresent(array,subset,arrayCounter+1);


    }

    static int isSubsetPresent(int array[],int subset)
    {
       int isSubsetPresent = 0;

     int matrix[][] = new int[array.length+1][subset+1];

     for (int row=0;row< matrix.length;row++)
     {
         matrix[row][0] = 1;
     }
        for (int col=1;col< matrix[0].length;col++)
        {
matrix[0][col] = 0;
        }


        for (int row=1;row<matrix.length;row++)
        {
            for (int col=1;col<matrix[row].length;col++)
            {

                if (col>=array[row-1])
                {
                    matrix[row][col] = matrix[row-1][col]+matrix[row-1][col-array[row-1]];
                }
                else
                {
                    matrix[row][col] = matrix[row-1][col];
                }

            }
        }

        isSubsetPresent  = matrix[array.length][subset];

        return isSubsetPresent;
    }


}
