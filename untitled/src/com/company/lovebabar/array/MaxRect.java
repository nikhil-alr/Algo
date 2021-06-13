package com.company.lovebabar.array;

public class MaxRect {


    public static void main(String args[])
    {
        int n = 4;
        int m = 4;
        int M[][] = {{0,1,1,0},
                     {1,1,1,1},
                     {1,1,1,1},
                     {1,1,0,0}};

        System.out.print(new GfG().maxArea(M));

        //int column[] = new int[M[0].length];
        //int ans = 0;
//for (int i=0;i<M.length;i++)
//{
//    int min=Integer.MAX_VALUE;
//    int max = Integer.MIN_VALUE;
//    for (int j=0;j<M[0].length;j++)
//    {
//
//        if (M[i][j]==0)
//       column[j] = M[i][j];
//    else
//      column[j] += M[i][j];
//    if (column[j]>0)
//        if (min>column[j])
//            min = column[j];
//    if (max<column[j])
//        max = column[j];
//System.out.print("");
//    }
//
//    if (min==Integer.MAX_VALUE)
//        min = 0;
//    if (max==Integer.MIN_VALUE)
//        max = 0;
//
//     if (ans<max)
//         ans = max;
//    int tmpSum = 0;
//    for (int j=0;j<column.length;j++)
//    {
//        if (column[j]==0)
//        {
//            tmpSum = 0;
//            continue;
//        }
//
//        if (min<=column[j])
//            tmpSum+=min;
//    }
//
//    if (ans<tmpSum)
//        ans = tmpSum;
//
//
//}
//        System.out.print(ans);
//
//    }



}


static class GfG {
    public int maxArea(int M[][]) {
        // add code here.

        int column[] = new int[M[0].length];
        int ans = 0;
        for (int i=0;i<M.length;i++)
        {
            int min=Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j=0;j<M[0].length;j++)
            {

                if (M[i][j]==0)
                    column[j] = M[i][j];
                else
                    column[j] += M[i][j];
                if (column[j]>0)
                    if (min>column[j])
                        min = column[j];
                if (max<column[j])
                    max = column[j];
                System.out.print("");
            }

            if (min==Integer.MAX_VALUE)
                min = 0;
            if (max==Integer.MIN_VALUE)
                max = 0;

            if (ans<max)
                ans = max;
            int tmpSum = 0;
            for (int j=0;j<column.length;j++)
            {
                if (column[j]==0)
                {
                    tmpSum = 0;
                    continue;
                }

                if (min<=column[j])
                    tmpSum+=min;
            }

            if (ans<tmpSum)
                ans = tmpSum;

            //System.out.println(ans);
        }

        return ans;




    }
}}
