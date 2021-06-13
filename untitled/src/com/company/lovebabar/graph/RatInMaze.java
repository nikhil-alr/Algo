package com.company.lovebabar.graph;

import java.util.ArrayList;
import java.util.Collections;

public class RatInMaze {
   static ArrayList<String> pathList = new ArrayList<>();
   static String directions[] = {"X","-Y","-X","Y"};
    public static void main(String args[])
    {
        int matrix[][] = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};
        findPath(matrix,4);
        Collections.sort(pathList);
        System.out.print(pathList);
    }


    static void findPath(int matrix[][],int n)
    {
        if(matrix[n-1][n-1]==0)
            return;
        savePath(matrix,0,0,new StringBuilder(""),n);

    }

    static  void savePath(int matrix[][],int row,int col,StringBuilder path,int n)
    {
        if(row<0||col<0||row==n||col==n)
        {
            return;
        }

        if(row==n-1&&col==n-1)
        {
           pathList.add(new String(path));
            return;
        }

        if(matrix[row][col]==0||matrix[row][col]==-1)
            return;
        //move to left
        path.append("L");
        matrix[row][col] = -1;
        savePath(matrix,row,col-1,path,n);
        matrix[row][col] = 1;
        path.deleteCharAt(path.length()-1);

        //move to up
        path.append("U");
        matrix[row][col] = -1;
        savePath(matrix,row-1,col,path,n);
        matrix[row][col] = 1;
        path.deleteCharAt(path.length()-1);


        //move to right
        path.append("R");
        matrix[row][col] = -1;
        savePath(matrix,row,col+1,path,n);
        matrix[row][col] = 1;
        path.deleteCharAt(path.length()-1);

        //move to bottom
        path.append("D");
        matrix[row][col] = -1;
        savePath(matrix,row+1,col,path,n);
        matrix[row][col] = 1;
        path.deleteCharAt(path.length()-1);

    }


//    public static ArrayList<String> findPath(int[][] m, int n) {
//        saveAllPath(m,0,0,new StringBuilder(""),n);
//        Collections.sort(pathList);
//        return pathList;
//    }
//
//
//    static void saveAllPath(int[][] m,int row,int col,StringBuilder path,int n)
//    {
//if(row==n-1&&col==n-1&&m[row][col]==1)
//{
//    //Add path to list;
//    pathList.add(new String(path));
//    return;
//}
//
//if(row==n||col==n||row==-1 || col==-1)
//    return;
//
//if (m[row][col]==0)
//{
//    // blocker
//    return;
//}
//if (m[row][col]==-1)
//{
//    //repetive path
//    return;
//}
//
//
//
//for (int i=0;i<directions.length;i++)
//{
//
//    int newRow = row;
//    int newCol = col;
//    switch (directions[i]) {
//        case "X":
//            //move in right
//            newCol = col+1;
//            path.append("R");
//            break;
//
//        case "-Y":
//            newRow = row+1;
//            //move in bottom
//            path.append("D");
//            break;
//        case "-X":
//           newCol = col-1;
//            //move in left
//            path.append("L");
//            break;
//
//        case "Y":
//            //move up
//            newRow = row-1;
//            path.append("U");
//            break;
//    }
//    int lastVal = m[row][col];
//    m[row][col] = -1;
//    saveAllPath(m,newRow,newCol,path,n);
//    m[row][col] = lastVal;
//    path.deleteCharAt(path.length()-1);
//
//
//}
//}

    }


