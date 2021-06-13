package com.company.lovebabar.array;

import java.util.Arrays;
import java.util.Scanner;

public class CholectDist {

    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test>0)
        {
            int n = scanner.nextInt();
            int array[]=new int[n];
            for (int i=0;i<n;i++)
            {
                array[i] = scanner.nextInt();

            }
            int m = scanner.nextInt();

            Arrays.sort(array);
            int ans = Integer.MAX_VALUE;

            for (int i=m-1;i<array.length;i++)
            {
                int tmp = array[i]-array[i-(m-1)];
                if(tmp<ans)
                    ans = tmp;
            }

            System.out.println(ans);


            test-=1;
        }






    }


}
