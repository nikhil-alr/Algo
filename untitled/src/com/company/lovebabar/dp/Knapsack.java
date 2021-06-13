package com.company.lovebabar.dp;

public class Knapsack {

    public static void main(String args[]) {
        System.out.print("KNAPSACK");
        //int values[] = {57,95,13,29,1,99,34,77,61,23,24,70,73,88,33,61,43,5,41,63,8,67,20,72,98,59,46,58,64,94,97,70,46,81,42,7,1,52,20,54,81,3,73,78,81,11,41,45,18,94,24,82,9,19,59,48,2,72};
        //int weight[] = {83,84,85,76,13,87,2,23,33,82,79,100,88,85,91,78,83,44,4,50,11,68,90,88,73,83,46,16,7,35,76,31,40,49,65,2,18,47,55,38,75,58,86,77,96,94,82,92,10,86,54,49,65,44,77,22,81,52};

        int values[] ={1,2,3};
        int weight[] = {4,5,1};
        int capacity = 4;




//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//
//                if (i == 0 || j == 0) {
//                    dp[i][j] = 0;
//                    continue;
//                }
//
//                if (j >= weight[i-1]) {
//                    dp[i][j] = Math.max(values[i - 1]+ dp[i - 1][j - weight[i - 1]],dp[i - 1][j]);
//                } else {
//
//                    dp[i][j] = dp[i - 1][j];
//                }
//
//            }
//
//        }
        System.out.print(knapSack(4,weight,values,0));

    }


    static int knapSack(int capacity, int weight[], int values[], int n)
    {
        // your code here
        int itemValue = 0;

        int dp[][] = new int[values.length+1][capacity+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {

                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                    continue;
                }

                if (j >= weight[i-1]) {
                    dp[i][j] = Math.max(values[i - 1]+ dp[i - 1][j - weight[i - 1]],dp[i - 1][j]);
                } else {

                    dp[i][j] = dp[i - 1][j];
                }

            }

        }

        return dp[values.length][capacity];

    }
}
