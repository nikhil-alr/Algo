package com.company.lovebabar.graph;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinStepByKnight {

    public static void main(String args[])
    {
       int knightPos[ ] = {3, 3};
        int targetPos[ ] = {2, 1};



System.out.print(findKnightStep(knightPos,targetPos,3));

    }

    static int findKnightStep(int knightPos[],int targetPos[],int n)
    {
       int step = 0;

       int board[][] = new int[n+1][n+1];

       Queue<int[]> queue = new LinkedList<>();
       queue.add(knightPos);

       while (!queue.isEmpty())
       {
           knightPos = queue.poll();
           if(knightPos[0]==targetPos[0]&&knightPos[1]==targetPos[1])
           {
               step = board[knightPos[0]][knightPos[1]];
               break;
           }


           int totalStepTaken = board[knightPos[0]][knightPos[1]];
           board[knightPos[0]][knightPos[1]] = -1;
           int[] newKnightPos = {knightPos[0]+2,knightPos[1]+1};
           if (isKnightPosValid(n,newKnightPos,board))
           {
               board[newKnightPos[0]][newKnightPos[1]] = totalStepTaken+1;

               queue.add(Arrays.copyOf(newKnightPos,2));
           }

           newKnightPos[1] = knightPos[1]-1;
           if (isKnightPosValid(n,newKnightPos,board))
           {
               board[newKnightPos[0]][newKnightPos[1]] = totalStepTaken+1;
               queue.add(Arrays.copyOf(newKnightPos,2));
           }

           newKnightPos[0] = knightPos[0]-2;
           newKnightPos[1] = knightPos[1]+1;
           if (isKnightPosValid(n,newKnightPos,board))
           {
               board[newKnightPos[0]][newKnightPos[1]] = totalStepTaken+1;
               queue.add(Arrays.copyOf(newKnightPos,2));
           }

           newKnightPos[0] = knightPos[0]-2;
           newKnightPos[1] = knightPos[1]-1;
           if (isKnightPosValid(n,newKnightPos,board))
           {
               board[newKnightPos[0]][newKnightPos[1]] = totalStepTaken+1;
               queue.add(Arrays.copyOf(newKnightPos,2));
           }


           newKnightPos[0] = knightPos[0]+1;
           newKnightPos[1] = knightPos[1]+2;
           if (isKnightPosValid(n,newKnightPos,board))
           {
               board[newKnightPos[0]][newKnightPos[1]] = totalStepTaken+1;
               queue.add(Arrays.copyOf(newKnightPos,2));
           }

           newKnightPos[0] = knightPos[0]-1;
           newKnightPos[1] = knightPos[1]+2;
           if (isKnightPosValid(n,newKnightPos,board))
           {
               board[newKnightPos[0]][newKnightPos[1]] = totalStepTaken+1;
               queue.add(Arrays.copyOf(newKnightPos,2));
           }


           newKnightPos[0] = knightPos[0]+1;
           newKnightPos[1] = knightPos[1]-2;
           if (isKnightPosValid(n,newKnightPos,board))
           {
               board[newKnightPos[0]][newKnightPos[1]] = totalStepTaken+1;
               queue.add(Arrays.copyOf(newKnightPos,2));
           }

           newKnightPos[0] = knightPos[0]-1;
           newKnightPos[1] = knightPos[1]-2;
           if (isKnightPosValid(n,newKnightPos,board))
           {
               board[newKnightPos[0]][newKnightPos[1]] = totalStepTaken+1;
               queue.add(Arrays.copyOf(newKnightPos,2));
           }

       }





        return step;
    }

    static boolean isKnightPosValid(int n,int knightPos[],int[][]board)
    {
          //Check boundary Condition
        if(knightPos[0]<1||knightPos[1]<1||knightPos[0]>n||knightPos[1]>n)
            return false;

        if(board[knightPos[0]][knightPos[1]]==-1||board[knightPos[0]][knightPos[1]]>0)
            return false;


        return true;
    }


}
