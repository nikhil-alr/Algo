package com.company.lovebabar.array;

import java.util.Scanner;

public class SubarraySum {

    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test>0)
        {

            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int  A[] = new int[n];

            for (int i=0;i<n;i++)
            {
             A[i] = scanner.nextInt();
            }

            int tmp = 0;
            int i=0;
            int j=0;
            int ans = Integer.MAX_VALUE;
            int length = 0;
            int subArraySum = 0;


            for (int item:A)
            {
                if (item>x)
                    break;
            }

            while (j<A.length)
            {
                if (tmp>x)
                {
                    ans = tmp;

                    if (length==0)
                    length = j-i;
                    else if(j-i<length)
                        length = j-i;
                }

                if (tmp>x)
                {
                    tmp=tmp-A[i];
                    i+=1;
                    continue;
                }

                tmp=tmp+A[j];

                j+=1;
            }



            System.out.println(length);
            test-=1;
        }



    }

}
