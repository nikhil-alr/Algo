package com.company.lovebabar.Strings;

import java.util.ArrayList;

public class SearchWordInGrid {

    public static void main(String args[])
    {
char grid[][] = {{'a','b','c'},{'d','r','f'},{'g','h','i'}};
String word = "abc";
searchWord(grid,word);
    }

    static public int[][] searchWord(char[][] grid, String word)
    {
        ArrayList<int[]> ansList = new ArrayList<>();
        int wordLen = word.length();
       for (int row=0;row<grid.length;row++)
       {
           for (int col=0;col<grid[row].length;col++)
           {
               boolean isStringMatch = matchString(grid,row,col,word);
               if (isStringMatch)
                   System.out.print(row+""+col);
           }
       }
int ans[][] = {};
       return ans;
    }

static boolean matchString(char[][]grid,int row,int col,String word)
    {
        boolean isStringMatch = false;
        int wordLen = word.length();

        //Compare Middle-Right
        int newCol = col+wordLen-1;
        String dataFromGrid = "";
        if (newCol<grid[row].length)
        {
            for (int i=col;i<=newCol;i++)
            {
                dataFromGrid+=grid[row][i];
                if (word.equalsIgnoreCase(dataFromGrid))
                    return true;
            }

        }

        //Compare Left-Middle
        newCol = col-(wordLen-1);
        dataFromGrid = "";
        if (newCol>=0)
        {
            for (int i=col;i>=newCol;i--)
            {
                dataFromGrid += grid[row][i];
                if (word.equalsIgnoreCase(dataFromGrid))
                    return true;
            }
        }


        //Compare Top-Middle
        int newRow = row-wordLen-1;
        dataFromGrid = "";
        if (newRow>=0)
        {
            for (int i=row;i>=newRow;i--)
            {
                dataFromGrid += grid[i][col];
                if (word.equalsIgnoreCase(dataFromGrid))
                    return true;
            }
        }

        //Compare Middle-Bottom
        newRow = row+wordLen-1;
        dataFromGrid = "";
        if (newRow< grid.length)
        {
            for (int i=row;i<=newRow;i++)
            {
                dataFromGrid += grid[i][col];
                if (word.equalsIgnoreCase(dataFromGrid))
                    return true;
            }
        }

        //Compare Middle - BottomRIght

        //Compare Middle - BottomLeft

        //Compare TopLeft - Middle


        //Compare TopRight - Middle

        return isStringMatch;
    }


}
