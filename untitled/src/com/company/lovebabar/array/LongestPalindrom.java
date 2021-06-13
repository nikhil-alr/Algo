package com.company.lovebabar.array;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LongestPalindrom {

    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(System.in));

        int test = scanner.nextInt();
        while (test>0)
        {


            int subStringStart = 0;
            int subStrigEnd = 0;


            String str = scanner.nextLine();
            if (str.isEmpty())
            {
                str = scanner.nextLine();

            }
            for (int i=1;i<str.length();i++)
            {
                //System.out.print(isPalnidrom("aaaabbaa",i));
                if (!isPalnidrom(str,0,i))
                {
                    for (int j=1;j<=i;j++)
                    {
                        if(isPalnidrom(str,j,i))
                        {
                            if (i-j>subStrigEnd-subStringStart)
                            {
                                subStringStart = j;
                                subStrigEnd = i;
                                break;
                            }

                        }

                    }


                    continue;
                }


                if (i-0>subStrigEnd-subStringStart)
                {
                    subStringStart = 0;
                    subStrigEnd = i;
                }

            }

            System.out.println(str.substring(subStringStart,subStrigEnd+1));

            test-=1;
        }



        //for ()

    }

    static boolean isPalnidrom(String str,int min,int len)
    {
        boolean isPalnidrom = true;
        int i=min;
        int j=len;

        while (i<j)
        {
            if (str.charAt(i)!=str.charAt(j))
            {
                isPalnidrom = false;
                break;
            }
            i+=1;
            j+=-1;
        }
    return isPalnidrom;
    }

}
