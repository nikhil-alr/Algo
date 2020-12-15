package com.company.lovebabar.array;

import java.util.HashMap;
import java.util.Scanner;

public class SubsetPresent {

    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test>0)
        {

            int m = scanner.nextInt();
            int n = scanner.nextInt();

            int array[] = new int[m];
            int array2[] = new int[n];

            HashMap<Integer,Integer> hashMap = new HashMap<>();
            for (int i=0;i<m;i++)
            {
                array[i] = scanner.nextInt();
                hashMap.put(array[i],array[i]);
            }

            String isSubSetPresent = "Yes";

            for (int i=0;i<n;i++)
            {
                array2[i] = scanner.nextInt();
                if (!hashMap.containsKey(array2[i]))
                {
                    isSubSetPresent = "No";
                    break;
                }
            }




            System.out.println(""+isSubSetPresent);



            test-=1;
        }




    }

}
