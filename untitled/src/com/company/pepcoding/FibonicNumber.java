package com.company.pepcoding;

import java.util.Scanner;

public class FibonicNumber {

    public static void main(String[] args) {

        int nthFibonic = new Scanner(System.in).nextInt();

for (int i=1;i<=nthFibonic;i++)

        System.out.println(getNthFibonic(i));


    }


    static int getNthFibonic(int n)
    {
        if (n==1)
            return 0;
        if (n==2)
            return 1;



        return getNthFibonic(n-1)+getNthFibonic(n-2);
    }

}
