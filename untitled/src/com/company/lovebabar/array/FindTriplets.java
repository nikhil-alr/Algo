package com.company.lovebabar.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindTriplets {

    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);

int test = scanner.nextInt();

while (test>0)
{

    int isTripletFound = 0;
    int n = scanner.nextInt();
    int sum = scanner.nextInt();

    int array[]=new int[n];

    for (int i=0;i<array.length;i++)
        array[i] = scanner.nextInt();

    Arrays.sort(array);



    for (int i=0;i<array.length-1;i++)
    {
        int val = sum-array[i];

        int j =i+1;;
        int k= array.length-1;

        while (j<k)
        {
            if (array[j]+array[k]>val)
            {
                k-=1;
                continue;
            }
            if (array[j]+array[k]<val)
            {
                j+=1;
                continue;
            }
           if (array[j]+array[k]==val)
            {

isTripletFound = 1;
break;
            }
        }

if (isTripletFound==1)
{
    break;
}
    }

    if (isTripletFound == 1) {
        System.out.print("1");
    } else {
        System.out.print("0");
    }


    test-=1;
}



    }

}
