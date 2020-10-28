package com.company.geeks.array;

public class MatrixRotation {

    public static void main(String args[])
    {
        int array[] = {56,96,91,54};
rotateMatrix(array,2);
    }

    //-----------------Stable Algo-------------------------
    public static void rotateMatrix(int array[],int rotation)
    {
        int toBeRotate = array.length-(rotation);
        int reducedBy = rotation;

        int upperLimimt = 0;
        while (rotation>0) {
            int i = toBeRotate;
            while (i >= upperLimimt) {
                System.out.print(array[i]+" ");
                //System.out.print(i);
                i -= (reducedBy);
                }
            rotation-=1;
            toBeRotate = array.length-(rotation);
            upperLimimt = 1;
            //System.out.println("");
        }
    }
    //-----------------Stable Algo-------------------------

}
