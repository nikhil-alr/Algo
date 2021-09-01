package com.company.lovebabar.backtrack;



import java.util.ArrayList;

public class GetMazePathJump {

    public static void main(String args[])
    {
    int matrix[][] = new int[3][3];




getMagePathWithJump(matrix,0,0,new ArrayList<String>());

    }

    static void getMagePathWithJump(int[][] matrix,int row,int col,ArrayList<String> paths)
    {
       if(row>= matrix.length||col>= matrix[row].length)
           return;

       if (row== matrix.length-1&&col== matrix.length-1)
       {

           System.out.println(paths);
           return;
       }

       for (int i=row;i< matrix.length;i++)
       {
           paths.add("B"+(i+1));
           getMagePathWithJump(matrix,i+1,col,paths);
           paths.remove(paths.size()-1);
       }

       for (int i=col;i< matrix[row].length;i++)
       {
           paths.add("R"+(i+1));
           getMagePathWithJump(matrix,row,i+1,paths);
           paths.remove(paths.size()-1);

       }

       for (int x=row,y=col;x<matrix.length;x++,y++)
       {
           paths.add("D"+(x+1));
           getMagePathWithJump(matrix,x+1,y+1,paths);
           paths.remove(paths.size()-1);

       }
    }




}
