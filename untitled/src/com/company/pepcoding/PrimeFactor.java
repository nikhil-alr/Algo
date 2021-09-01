package com.company.pepcoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactor {

    public static void main(String args[])
    {
        List<Integer> primeFactors = getPrimeFactroiztion(new Scanner(System.in).nextInt());
        //System.out.print(primeFactors);

        for (int i=0;i<primeFactors.size();i++)
        {
            if(i==primeFactors.size()-1)
            {
                System.out.print(primeFactors.get(i));
continue;
            }
            System.out.print(primeFactors.get(i)+" ");
        }
    }

    static List<Integer> getPrimeFactroiztion(int number)
    {
        List<Integer> primeFactorList = new ArrayList<Integer>();
        int divider = 2;

        while (number>1)
        {

            int reminder = number%divider;

            if (reminder!=0||!isNumberPrime(divider))
            {
                divider+=1;
                continue;
            }
                number = number/divider;
                primeFactorList.add(divider);

        }

    return primeFactorList;
    }


    static boolean isNumberPrime(int number)
    {
        for (int i=2;i<=Math.sqrt(number);i++)
        {
            if (number%i==0)
                return false;
        }

        return true;
    }

}
