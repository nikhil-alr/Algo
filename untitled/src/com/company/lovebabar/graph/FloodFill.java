package com.company.lovebabar.graph;

public class FloodFill {

    public static void main(String args[])
    {
        int image[][] = {{0,0,0}, {0,0,0}};
        int sr = 0, sc = 0, newColor = 2;
        System.out.print(image.length);
        System.out.print(image[0].length);
        floodFill(image,sr,sc,newColor,image[sr][sc]);
        System.out.print("");
    }

    static void floodFill(int image[][],int sr,int sc,int color,int parentColo0)
    {
       if(sr<0||sc<0||sr==image.length||sc== image[0].length)
           return;

        if(image[sr][sc]==color)
            return;

       if(image[sr][sc]!=parentColo0)
       return;



       int parenColo = image[sr][sc];
       image[sr][sc] = color;

       //move left
        floodFill(image,sr,sc-1,color,parenColo);

        //move top
        floodFill(image,sr-1,sc,color,parenColo);

        //move right
        floodFill(image,sr,sc+1,color,parenColo);

        //move bottom
        floodFill(image,sr+1,sc,color,parenColo);



    }

   }
