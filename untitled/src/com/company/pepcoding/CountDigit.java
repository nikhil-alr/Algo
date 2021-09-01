package com.company.pepcoding;

import java.util.Scanner;

public class CountDigit {

    public static void main(String[] args) {
        // write your code here
        int n = new Scanner(System.in).nextInt();

//        int ans[] = reverseNumber(n);
//        for (int number:ans)
//        {
//            System.out.println(number);
//        }

        //int n = new Scanner(System.in).nextInt();
        printDigit(n);

    }

    static int getDigitCount(int n)
    {
        int count = 0;

        while (n>0)
        {
            n=n/10;
            count+=1;
        }
        return count;
    }

    static int[] reverseNumber(int n)
    {
        int count = 0;

        int ans[] = new int[getDigitCount(n)];
        for (int i=0;i<ans.length;i++)
        {
            ans[i] = n%10;
            n=n/10;
        }
        return ans;
    }


    static void printDigit(int number)
    {
        if (number<10)
        {
            System.out.println(number);
            return;
        }

        printDigit(number/10);

        System.out.println(number%10);

    }


}
