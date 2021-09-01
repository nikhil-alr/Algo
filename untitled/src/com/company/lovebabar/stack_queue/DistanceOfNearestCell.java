package com.company.lovebabar.stack_queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class DistanceOfNearestCell {

    public static void main(String args[])
    {
int [][] grid = {{1,0,1},{1,1,0},{1,0,0}};
nearest(grid);
    }

    static public int[][] nearest(int[][] grid)
    {

        for (int row=0;row< grid.length;row++)
        {
            for (int col=0;col< grid[row].length;col++)
            {
                if(grid[row][col]==1)
                {
                    grid[row][col]=-1;

                }



            }
        }

        for (int row=0;row< grid.length;row++)
        {
            for (int col=0;col< grid[row].length;col++)
            {
                if(grid[row][col]==0)
                {
                    grid[row][col] = getMinDistance(grid,row,col,1);

                }



            }
        }

        for (int row=0;row< grid.length;row++)
        {
            for (int col=0;col< grid[row].length;col++)
            {
                if(grid[row][col]==-1)
                {
                    grid[row][col]=0;

                }



            }
        }

    return grid;
    }

    static int getMinDistance(int grid[][],int row,int col,int distance)
    {
        int minDistance = Integer.MAX_VALUE;
        Queue<HashMap<String,Integer>> nearestNbrQueue = new LinkedList<>();

        nearestNbrQueue = getNearestValidNbr(grid,row,col,distance);

        while (!nearestNbrQueue.isEmpty())
        {
            HashMap<String,Integer> nearestValidVertex = nearestNbrQueue.poll();
            int nearestValidVertexRow = nearestValidVertex.get("ROW");
            int nearestValidVertexCol = nearestValidVertex.get("COL");

            int getNearestDistance = getDistance(row,nearestValidVertexRow,col,nearestValidVertexCol);
            if (minDistance>getNearestDistance)
            {
                minDistance = getNearestDistance;
            }
        }

        if (minDistance==Integer.MAX_VALUE)
            minDistance = getMinDistance(grid,row,col,distance+1);

        return minDistance;
    }

    static int getDistance(int i1,int i2,int j1, int j2)
    {
        int calculateDistance =  Math.abs(i1-i2) + Math.abs(j1-j2);
    return calculateDistance;
    }

    static Queue<HashMap<String,Integer>> getNearestValidNbr(int[][] grid,int row,int col,int distance)
    {
        Queue<HashMap<String,Integer>> nerestValidNbr = new LinkedList<>();

        int bottomRow = row+distance;
        int towRow = row-distance;
        int leftCol = col-distance;
        int righCol = col+distance;

        if (isValidNbr(grid,row,leftCol))
        {
            HashMap<String,Integer> vertex = new HashMap<>();
            vertex.put("ROW",row);
            vertex.put("COL",leftCol);
            nerestValidNbr.add(vertex);
        }

        if (isValidNbr(grid,row,righCol))
        {
            HashMap<String,Integer> vertex = new HashMap<>();
            vertex.put("ROW",row);
            vertex.put("COL",righCol);
            nerestValidNbr.add(vertex);
        }

        if (isValidNbr(grid,towRow,col))
        {
            HashMap<String,Integer> vertex = new HashMap<>();
            vertex.put("ROW",towRow);
            vertex.put("COL",col);
            nerestValidNbr.add(vertex);
        }

        if (isValidNbr(grid,bottomRow,col))
        {
            HashMap<String,Integer> vertex = new HashMap<>();
            vertex.put("ROW",bottomRow);
            vertex.put("COL",col);
            nerestValidNbr.add(vertex);
        }

        if (isValidNbr(grid,towRow,leftCol))
        {
            HashMap<String,Integer> vertex = new HashMap<>();
            vertex.put("ROW",towRow);
            vertex.put("COL",leftCol);
            nerestValidNbr.add(vertex);
        }

        if (isValidNbr(grid,towRow,righCol))
        {
            HashMap<String,Integer> vertex = new HashMap<>();
            vertex.put("ROW",towRow);
            vertex.put("COL",righCol);
            nerestValidNbr.add(vertex);
        }

        if (isValidNbr(grid,bottomRow,leftCol))
        {
            HashMap<String,Integer> vertex = new HashMap<>();
            vertex.put("ROW",bottomRow);
            vertex.put("COL",leftCol);
            nerestValidNbr.add(vertex);
        }

        if (isValidNbr(grid,bottomRow,righCol))
        {
            HashMap<String,Integer> vertex = new HashMap<>();
            vertex.put("ROW",bottomRow);
            vertex.put("COL",righCol);
            nerestValidNbr.add(vertex);
        }


        return nerestValidNbr;
    }

    static boolean isValidNbr(int[][]grid,int row,int col)
    {
        if (row<0||col<0||grid.length<=row||grid[row].length<=col||grid[row][col]!=-1)
            return false;

        return true;
    }

}
