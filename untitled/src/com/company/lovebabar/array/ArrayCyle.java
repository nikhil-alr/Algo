package com.company.lovebabar.array;

import java.util.Scanner;

public class ArrayCyle {

    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        //int testCase = scanner.nextInt();

        //while (testCase>0)
        {
            //int array[] = {1,2,3,4,5,6};

            int n = scanner.nextInt();
            int array[] = new int[n];
            //array[0] = 1;
            for (int i=0;i<n;i++)
            {
                array[i] = scanner.nextInt();
            }


            rotateArray(array,1);

            for (int item:array)
            {
                System.out.print(item);
            }

            //testCase-=1;

        }

        //rotateArray(array,1);

    }


    public static void rotateArray(int array[],int i)
    {
        reverseArray(array,0, (array.length-1)-i );
        reverseArray(array,array.length-i,(array.length-1) );
        reverseArray(array,0,(array.length-1) );
        System.out.print("");

    }

    public static void reverseArray(int array[],int left,int right)
    {

        int i=left;
        int j = right;
        while (i<j)
        {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;

            i+=1;
            j-=1;

        }

    }


}
