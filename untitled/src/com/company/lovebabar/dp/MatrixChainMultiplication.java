package com.company.lovebabar.dp;

public class MatrixChainMultiplication {

    static int table[][];
    public static void main(String args[])
    {
        int matrixArray[] = {1,2,3,4};
        table = new int[matrixArray.length][matrixArray.length];
         System.out.print(mcmUsinMemo(matrixArray,1, matrixArray.length-1));
//         for (int gap=0;gap< matrixArray.length-1;gap++)
//         {
//              for (int i=gap;int j=i+1;i<)
//             {
//
//                 else
//                     for(k=l;k<j;k++)
//                     {
//                         l-1,l,j
//                     }
//             }
//
//         }

    }


public static int mcmUsinMemo(int array[],int l,int r)
{
    int ans = Integer.MAX_VALUE;

    if (l==r)
        return 0;


    if (table[l][r]>0)
        return table[l][r];
    for (int i=l;i<r;i++)
    {
    int cost1 = mcmUsinMemo(array

            ,l,i);
    int cost2 = mcmUsinMemo(array,i+1,r);
    int totalCost = cost1+cost2+array[l-1]*array[i]*array[r];
    if (totalCost<ans)
    {
        ans = totalCost;
    }

    }
    table[l][r] = ans;

    return ans;
}


}
