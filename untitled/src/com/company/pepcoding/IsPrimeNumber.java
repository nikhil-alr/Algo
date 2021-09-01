package com.company.pepcoding;

import java.util.Scanner;

public class IsPrimeNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int testCase = scn.nextInt();

        while (testCase>0)
        {
            int number = scn.nextInt();
            if (isPrimeNumber(number))
            {
System.out.println("prime");
            }
            else
            {
                System.out.println("not prime");
            }
            testCase-=1;
        }






    }

    static boolean isPrimeNumber(int number)
    {

        for (int i=2;i<=Math.sqrt(number);i++)
        {
            if (number%i==0)
                return false;
        }

        return true;
    }

}
