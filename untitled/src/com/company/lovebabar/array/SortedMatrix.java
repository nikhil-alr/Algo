package com.company.lovebabar.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrix {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test>0)
        {
int n = scanner.nextInt();
int array[] = new int[n*n];

for (int i=0;i<array.length;i++)
array[i] = scanner.nextInt();

            Arrays.sort(array);

            for (int i=0;i<array.length;i++)
                System.out.print(array[i]+" ");

            System.out.println("");
            test-=1;
        }
    }

}
