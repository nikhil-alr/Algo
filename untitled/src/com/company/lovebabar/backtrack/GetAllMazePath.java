package com.company.lovebabar.backtrack;

import java.util.ArrayList;

public class GetAllMazePath {



    public static void main(String args[])
    {

        int matrix[][] = new int[3][3];

        //System.out.println(getAllMazePath(matrix,0,0));;


    }


//    static ArrayList<String> getAllMazePath(int matrix[][], int row, int col)
//    {
//
//        ArrayList<String> pathList = new ArrayList<>();
//
//
//        if (row== matrix.length-1&&col== matrix[row].length-1)
//        {
//            return new ArrayList<String>();
//        }
//
//        //pathList.add("L");
//        if (col< matrix[row].length)
//        {
//            ArrayList<String> tmpSubPath = getAllMazePath(matrix,row,col+1);
//        }
//
//        if (row< matrix.length)
//        {
//            ArrayList<String> tmpSubPath = getAllMazePath(matrix,row,col+1);
//        }
//
//        if (tmpSubPath!=null)
//        {
//            for (String path:tmpSubPath)
//                pathList.add("B"+path);
//            if (tmpSubPath.size()==0)
//            {
//                pathList.add("B");
//            }
//            else
//            {
//                for (String path:tmpSubPath)
//                    pathList.add("L"+path);
//
//            }
//
//        }
//
//
//        return pathList;
//    }


}
