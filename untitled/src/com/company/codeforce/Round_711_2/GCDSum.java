package com.company.codeforce.Round_711_2;

import java.util.Scanner;

public class GCDSum {

    static int testCase = 0;
    static long inputArray[];
    static void scanInput()
    {
//System.out.println("Reading");
        Scanner scanner = new Scanner(System.in);
        testCase = scanner.nextInt();

        inputArray = new long[testCase];
        int counter = 0;
        while (counter< testCase)
        {
            inputArray[counter] = scanner.nextLong();
            counter+=1;
        }


    }

    static long[] performGcdOperation(int test,long gcdNumber[])
    {
        //System.out.println("Processing");
        long[] resultArray = new long[test];

        int arrayCounter = 0;
        while (arrayCounter<test)
        {
           //System.out.println("Processing On"+gcdNumber[arrayCounter]);
           long gcdA = gcdNumber[arrayCounter];
           long gcdB = getGcdB(gcdA);
           long ans = calculateGCD(gcdA,gcdB);
           while (ans==1)
           {
               gcdA+=1;
               gcdB = getGcdB(gcdA);
               ans = calculateGCD(gcdA,gcdB);
           }
           resultArray[arrayCounter] = gcdA;
           arrayCounter+=1;
        }

        return resultArray;
    }


    static int getGcdB(long a)
    {
        int gcdB = 0;

        while (a>0)
        {
            long temp = a%10;
            gcdB+=temp;
            a=a/10;
        }


        return gcdB;
    }

    static long calculateGCD(long a,long b)
    {
//int calculatedGCD = 0;

while (a%b>0)
{
long tmp = a%b;
a = b;
b=tmp;
}



return b;
    }

    static void displayResult(long resultArray[])
    {
        //System.out.println("Displaying");
        for (long item : resultArray)
        {
            System.out.println(item);
        }

    }

    public static void main(String args[])
    {

        scanInput();
        long resultArray[] = new long[testCase];
        resultArray = performGcdOperation(testCase,inputArray);
        displayResult(resultArray);
    }

}
