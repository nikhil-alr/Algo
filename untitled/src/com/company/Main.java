package com.company;

public class Main {

    static int[] array={1,2,3,4,5};
    static int sum = 10;
    static int matrix[][];

    public static void main(String[] args) {
	// write your code here

        matrix=new int[array.length+1][sum+1];
        SubsetSumCount(array.length,sum);
        //System.out.print(subsetSum(array.length, sum));

    }



    static public void SubsetSumCount(int n,int sum)
    {
        for (int i=0;i<n+1;i++)
        {
            for (int j=0;j<sum+1;j++)
            {
                if (i==0&&j==0)
                {
                    matrix[i][j] = 1;
                    continue;
                }

                if (i==0)
                {
                    matrix[i][j] = 0;
                    continue;
                }



                if (j==0)
                {
                    matrix[i][j] = 1;
continue;
                }



                else if(array[i-1]<=j)
                {
                    int value1 = matrix[i-1][j-array[i-1]];
                    int value2 = matrix[i-1][j];
                    matrix[i][j]=value1+value2;
                }
                else
                {
                    matrix[i][j]=matrix[i-1][j];
                }
            }
        }

        System.out.println(matrix[n][sum]);

    }

    static public int subsetSum(int n,int sum)
    {
     int isSubsetSumPresent = 0;

        if (n==0&&sum>0)
            return 0;

        if(n==0&&sum==0)
         return 1;

     if(n>0&&sum==0)
     return 1;

     if(array[n-1]<=sum)
     {
         int val1 = subsetSum(n-1,sum-array[n-1]);
         int val2 = subsetSum(n-1,sum);

         return val1+val2;
     }
     else
     {
         isSubsetSumPresent = subsetSum(n-1,sum);
     }

     return isSubsetSumPresent;
    }


}
