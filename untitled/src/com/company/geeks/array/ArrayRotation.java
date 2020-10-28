package com.company.geeks.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayRotation {


static List<int[]> outputList = new ArrayList<>();
static List<Integer> dList = new ArrayList<>();

    public static void main(String args[])throws IOException
    {

        inputUnit();
//        int outputSize = outputList.size();
//        for (int i=0;i<outputSize;i++)
//        {
//            int array[]=outputList.get(i);
//            int d = dList.get(i);
//
//            reverseArray(array,0,d-1);
//            reverseArray(array,d, array.length-1);
//            reverseArray(array,0, array.length-1);
//
//             for (int j=0;j<array.length;j++)
//                System.out.print(array[j]+" ");
//            System.out.println("");
//        }

//    int n = 1;
//    reverseArray(0,n-1);
//    reverseArray(n, array.length-1);
//    reverseArray(0, array.length-1);
//
//    for (int i=0;i<array.length;i++)
//    {
//        System.out.print(array[i]);
//    }

    }



    public static void inputUnit() throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());


        for (int i=0;i<t;i++)
        {
            String sizeAndRotation = in.readLine();
            int size = Integer.parseInt(sizeAndRotation.split(" ")[0]);




            int d = Integer.parseInt(sizeAndRotation.split(" ")[1]);
            String array = in.readLine();
            StringBuffer inputArray = new StringBuffer(array);

            reverseArray(inputArray,0,d-1);
           reverseArray(inputArray,d, size-1);
            reverseArray(inputArray,0, size-1);

                System.out.print(inputArray+" ");
            System.out.println("");


            // outputList.add(inputArray);
            //dList.add(d);


        }

    }


    static void reverseArray(StringBuffer array,int start,int end)
    {
        int j=end;
       int i = start;
        while (i<j)
       {
           char tmp = array.charAt(i);
           array.replace(i,i,""+array.charAt(j));
           array.replace(j,j,""+tmp);

       i+=1;
       j-=1;
       }
    }
}
