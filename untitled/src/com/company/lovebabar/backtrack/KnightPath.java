package com.company.lovebabar.backtrack;

import java.util.ArrayList;

public class KnightPath {

    public static void main(String args[])
    {
        int board[][] = new int[5][5];
        printAllKnightPath(board,0,0,1);
    }

    static void printAllKnightPath(int board[][],int row,int col,int move)
    {
      if (isMoveValid(board,row,col))
      {

          board[row][col] = move;

          if (move== board.length* board.length)
          {
              displayAllMoves(board);
              board[row][col] = 0;
              return;

          }

          printAllKnightPath(board,row-2,col-1,move+1);
          printAllKnightPath(board,row-2,col+1,move+1);
          printAllKnightPath(board,row+2,col-1,move+1);
          printAllKnightPath(board,row+2,col+1,move+1);
          printAllKnightPath(board,row+1,col+2,move+1);
          printAllKnightPath(board,row+1,col-2,move+1);
          printAllKnightPath(board,row-1,col+2,move+1);
          printAllKnightPath(board,row-1,col-2,move+1);

          board[row][col] = 0;


      }


    }

    static void displayAllMoves(int board[][])
    {
        for (int i=0;i< board.length;i++)
        {
            for (int j=0;j< board[i].length;j++)
            {
                System.out.print(board[i][j]+",");
            }
            System.out.println("");
        }

        System.out.println("--------------------------------------");
    }

    static boolean isMoveValid(int[][]board,int row,int col)
    {
        if(row<0||col<0||row>= board.length||col>= board[row].length||board[row][col]!=0)
            return false;

        return true;
    }



}
