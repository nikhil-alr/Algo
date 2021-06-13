package com.company.lovebabar.Strings;

public class KMPAlgo {

    public static void main(String args[])
    {
              lPA("abcdabcy");
    }

    public static void isPatternPresent(String string,String pattern)
    {
String s = "abcxabcdabcdabcc";



    }

    public static int[] lPA(String pattern)
    {

        int lpa[] = new int[pattern.length()];

        int i = 0;
        int j = 1;

        while (j<pattern.length())
        {

            if(pattern.charAt(j)==pattern.charAt(i))
            {
            lpa[j] = i+1;
            i+=1;
            j+=1;
            }
            else
            {
                if(i==0)
                {
                    j+=1;
                }
                else
                {
                    i = lpa[i-1];
                }

            }


        }

        return lpa;
    }



}
