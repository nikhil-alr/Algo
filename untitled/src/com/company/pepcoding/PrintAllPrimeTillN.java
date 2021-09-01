package com.company.pepcoding;

import java.util.Scanner;

public class PrintAllPrimeTillN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        int high = scanner.nextInt();

        int array[] = new int[(high-low)+1];
        int index = 0;
        for (int i=low;i<=high;i++)
        {
            array[index] = i;
            index+=1;
        }

        array = getAllPrime(low,high,array);

        for (int item:array)
        {
            if (item!=0)
            {
                System.out.println(item);
            }
        }

    }

static int[] getAllPrime(int low,int high,int array[])
{

    for (int j=0;j<array.length;j++)
    {
        for (int i=2;i<=Math.sqrt(array[j]);i++)
        {
            if (array[j]%i==0)
            {
                array[j] = 0;
                break;
            }


        }

        }






    return array;
}

}
