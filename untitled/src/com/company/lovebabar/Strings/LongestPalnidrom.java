package com.company.lovebabar.Strings;

public class LongestPalnidrom {

   public static void main(String args[])
    {

System.out.print(longestPalin("vnrtysfrzrmzlygfv"));
    }

    static String longestPalin(String S){
    int maxLongestPalinCount = 0;
    int longestPalinStart = 0;
    int longestPalinEnd = 0;
        // code here


if(maxLongestPalinCount==1)
    return S.substring(0,1);
return S.substring(longestPalinStart,longestPalinStart+maxLongestPalinCount*2);
    }


}
