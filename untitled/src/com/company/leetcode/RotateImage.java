package com.company.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class RotateImage {

    public static void main(String args[])
    {
int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
rotate(matrix);

    }

    static public void rotate(int[][] matrix) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i=0;i< matrix.length;i++)
        {
            for (int j= matrix[i].length-1;j>=0;j--)
            {
                queue.add(matrix[j][i]);
            }
        }

        for (int i=0;i< matrix.length;i++)
        {
            for (int j=0;j<matrix[i].length;j++)
            {
                matrix[i][j] = queue.poll();
            }
        }

        System.out.print("");

    }

}
