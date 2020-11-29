package com.company.codeforce.array;

import java.util.Scanner;

public class ArrayRearrangment {


    public static void main(String args[])
    {
        int testCase = 2;
        Scanner scanner = new Scanner(System.in);

        testCase = scanner.nextInt();
        while (testCase>0)
        {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int arrayA[] = new int[n];
            int arrayB[] = new int[n];

            for (int i=0;i<n;i++)
            {
                arrayA[i] = scanner.nextInt();
            }

            for (int i=0;i<n;i++)
            {
                  arrayB[i] = scanner.nextInt();
            }

int arrayBPos = 0;
            int arrayAPos = 0;
            boolean isRearrangePossible = true;
            for (int i= arrayA.length-1;i>=0;i--)
            {
                arrayBPos = i;
                boolean isItemExchange = false;
                isRearrangePossible = true;
                for (int j= i;j>=0;j--)
                {

                    if ((arrayB[j]+arrayA[i]<=x))
                    {
                        if(arrayB[arrayBPos]+arrayA[j]<=x)
                        {
                            int tmp = arrayB[j];
                            arrayB[j] = arrayB[arrayBPos];
                            arrayB[arrayBPos] = tmp;
                            isItemExchange = true;
                            break;
                        }
                    }

                }
                if (!isItemExchange)
                {
                    isRearrangePossible = false;
                    break;
                }

            }
System.out.println(isRearrangePossible);




            testCase-=1;
        }
    }

}
