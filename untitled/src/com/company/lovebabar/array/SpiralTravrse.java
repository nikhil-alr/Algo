package com.company.lovebabar.array;

import java.util.ArrayList;

public class SpiralTravrse {


    public static void main(String args[])
    {
        System.out.print("SPIRAL TRAVRSE");

        int matrix[][] = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11},
                {9, 10, 11}

                };

        printInSprialOrder(matrix, matrix.length-1,matrix[0].length-1);

    }

static ArrayList<Integer> printInSprialOrder(int matrix[][],int n,int m)
{
    ArrayList<Integer> arrayList = new ArrayList<>();
    int colStart=0;
    int colEnd = m;
    int rowStart = 0;
    int rowEnd=n;

   while (colStart<=colEnd&&rowStart<=rowEnd)
   {
    printRow(matrix,colStart,colEnd,rowStart,arrayList,false);


    printCol(matrix,rowStart+1,rowEnd-1,colEnd,arrayList,false);


    if (rowStart!=rowEnd)
    printRow(matrix,colStart,colEnd,rowEnd,arrayList,true);

       if (colEnd!=colStart)
    printCol(matrix,rowStart+1,rowEnd-1,colStart,arrayList,true);
    //print column
    //print row
    //print column
    colStart=colStart+1;
    colEnd=colEnd-1;
     rowStart = rowStart+1;
    rowEnd = rowEnd-1;
    System.out.print("");
   }
   return arrayList;
}


static void printRow(int matrix[][],int start,int end,int row,ArrayList<Integer> arrayList,boolean reverse)
{
    if (reverse)
    {
        for (int i=end;i>=start;i--)
        {
            //System.out.print(matrix[row][i]);
            arrayList.add(matrix[row][i]);
        }
    }
    else
    {
        for (int i=start;i<=end;i++)
        {
            //System.out.print(matrix[row][i]);
            arrayList.add(matrix[row][i]);
        }
    }

    //System.out.println("");
}

    static void printCol(int matrix[][],int start,int end,int col,ArrayList<Integer> arrayList,boolean reverse)
    {
       if (reverse)
       {
           for (int i=end;i>=start;i--)
           {
              // System.out.print(matrix[i][col]);
               arrayList.add(matrix[i][col]);
           }
       }
       else {
           for (int i=start;i<=end;i++)
           {
               //System.out.print(matrix[i][col]);
               arrayList.add(matrix[i][col]);
           }
       }

        //System.out.println("");
    }

}
