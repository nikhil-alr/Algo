package com.company.lovebabar.stack_queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RootenOranges {

    public static void main(String args[])
    {

    }

    static public int orangesRotting(int[][] grid)
    {
        Queue<HashMap<String,Integer>> rootenOrangeQueue = new LinkedList<>();
        int maxCost = 0;
        for (int row=0;row< grid.length;row++)
        {
            for (int col=0;col< grid[row].length;col++)
            {
               if (grid[row][col]==2)
               {
                   HashMap<String,Integer> orange = new HashMap();
                   orange.put("cost",0);
                   orange.put("row",row);
                   orange.put("col",col);
                   rootenOrangeQueue.add(orange);
               }
            }
        }

        while (!rootenOrangeQueue.isEmpty())
        {
            HashMap<String,Integer> rootenOrange = rootenOrangeQueue.poll();
           int orangeCost = rootenOrange.get("cost");
           if (maxCost<orangeCost)
               maxCost = orangeCost;

            int row = rootenOrange.get("row");
            int col = rootenOrange.get("col");
            int cost =  rootenOrange.get("cost");
            if (row-1<0||row+1>=grid.length||col-1<0||col+1>= grid[row].length)
                continue;

            HashMap<String,Integer> newOrange = new HashMap<>();
            int newRow = row+1;
            int newCol = col+1;

            if(grid[newRow][newCol]!=0)
            {
                newOrange.put("cost",cost+1);
                newOrange.put("row",newRow);
                newOrange.put("col",newCol);
                grid[newRow][newCol] +=1;
                rootenOrangeQueue.add(newOrange);
            }

            newOrange = new HashMap<>();
            newRow = row+1;
            newCol = col-1;
            if(grid[newRow][newCol]!=0)
            {
                newOrange.put("cost",cost+1);
                newOrange.put("row",newRow);
                newOrange.put("col",newCol);
                grid[newRow][newCol] +=1;
                rootenOrangeQueue.add(newOrange);
            }


            newOrange = new HashMap<>();
            newRow = row-1;
            newCol = col+1;
            if(grid[newRow][newCol]!=0)
            {
                newOrange.put("cost",cost+1);
                newOrange.put("row",newRow);
                newOrange.put("col",newCol);
                grid[newRow][newCol] +=1;
                rootenOrangeQueue.add(newOrange);
            }

            newOrange = new HashMap<>();
            newRow = row-1;
            newCol = col-1;
            if(grid[newRow][newCol]!=0)
            {
                newOrange.put("cost",cost+1);
                newOrange.put("row",newRow);
                newOrange.put("col",newCol);
                grid[newRow][newCol] +=1;
                rootenOrangeQueue.add(newOrange);
            }

        }




    return maxCost;
    }

}
