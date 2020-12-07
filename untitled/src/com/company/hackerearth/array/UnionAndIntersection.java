package com.company.hackerearth.array;

import java.util.HashMap;
import java.util.Scanner;

public class UnionAndIntersection {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        int ansArray[] = new int[1];
        int counter = 0;
        while (counter<test)
        {
            ansArray = new int[test];

            int a = scanner.nextInt();

            int b = scanner.nextInt();

            int array1[] = new int[a];
            int array2[] = new int[b];

            String val = "";
            for (int i=0;i<a;i++)
            {
                array1[i] = scanner.nextInt();
                val=val+","+array1[i];
            }



            for (int i=0;i<b;i++)
            {
                array2[i] = scanner.nextInt();
            }


            ansArray[counter] = mergeArray(array1,array2);

            test-=1;
        }

        for(int item:ansArray)
        {
            System.out.print(item);
        }

    }

    public static int  mergeArray(int array1[],int array2[])
    {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int unionCount = 0;
        for (int item:array1)
        {
            if (!hashMap.containsKey(item))
            {

                hashMap.put(item,item);
                unionCount+=1;
            }

        }

        for (int item:array2)
        {
            if (!hashMap.containsKey(item))
            {

                hashMap.put(item,item);
                unionCount+=1;
            }

        }


        return unionCount;
    }

}
