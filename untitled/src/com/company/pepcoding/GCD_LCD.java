package com.company.pepcoding;

import java.util.Scanner;

public class GCD_LCD {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();;
        int n2 = scanner.nextInt();

        System.out.print(getGCD(n1,n2));
        System.out.print(getLCM(n1,n2));

    }

   static int getGCD(int number1,int number2)
    {
        while (number2>0)
        {
            int tmp = number1%number2;
            number1 = number2;
            number2 = tmp;
        }

        return number1;
    }

    static int getLCM(int number1,int number2)
    {
int gcd = getGCD(number1,number2);
    return (number1*number2)/gcd;

    }

}
