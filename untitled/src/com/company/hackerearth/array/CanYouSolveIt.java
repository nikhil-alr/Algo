package com.company.hackerearth.array;

import java.util.Scanner;

public class CanYouSolveIt {

    public static void main(String args[])
    {
        System.out.println("HELLO");
        int array[] = {1,2,3,1};

        int test ;
        int n = array.length;


        Scanner s = new Scanner(System.in);
        test = s.nextInt();

        for(int j=0;j<test;j++) {

            int max = 0;
            n = s.nextInt();

            array = new int[n];



            for (int k = 0; k < n; k++) {
                array[k] = s.nextInt();
            }


            for (int i=0;i< array.length-1;i++)
            {
                for (int k=i+1;k< array.length;k++)
                {
                    int val = Math.abs(array[i]-array[k])+Math.abs(i-k);
                    if(max<val)
                        max = val;

                }
            }

            System.out.println(max);
        }

    }

}
