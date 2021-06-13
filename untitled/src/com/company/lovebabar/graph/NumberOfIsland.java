package com.company.lovebabar.graph;

public class NumberOfIsland {

    public static void main(String args[])
    {
        char [][]grid = {{'0','1','1','1','0','0','0'},{'0','0','1','1','0','1','0'}};

System.out.print(numIslands(grid));
    }

    static public int numIslands(char[][] grid)
    {
       int numIslands = 0;

       for (int row=0;row< grid.length;row++)
       {
           for (int col=0;col< grid[row].length;col++)
           {

               if(grid[row][col]=='0')
                   continue;
               travrseGrid(row,col,grid);
               numIslands+=1;

           }
       }

       return numIslands;

    }


    static void travrseGrid(int row,int col,char[][] grid)
    {
        if(row>= grid.length||col>= grid[0].length||row<0||col<0)
            return;

        if(grid[row][col]=='0')
            return;

        grid[row][col] = '0';
        travrseGrid(row,col+1,grid);
        travrseGrid(row+1,col,grid);
        travrseGrid(row-1,col,grid);
        travrseGrid(row,col-1,grid);
    }
}
