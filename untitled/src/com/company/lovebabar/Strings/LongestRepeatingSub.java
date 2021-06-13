package com.company.lovebabar.Strings;

public class LongestRepeatingSub {

    public static void main(String args[])
    {
System.out.print(LongestRepeatingSubsequence("kmvubojerk"));
    }

    public static int LongestRepeatingSubsequence(String str)
    {
    int longestRS = 0;

    for (int i=0;i<str.length();i++)
    {
        int subSeqCount = getLongestSubCount(str.charAt(i),str.substring(i+1));
    if(longestRS<subSeqCount)
    {
        longestRS = subSeqCount;
    }
    }

    return longestRS;
    }

    static int getLongestSubCount(char val,String sub)
    {
        int totalSum = 0;
        int count = 0;
        for (int i=0;i<sub.length();i++)
        {
            if(sub.charAt(i)==val)
            {
                count+=1;
            }
            else
            {
                if (totalSum<count)
                    totalSum = count;
                count = 0;
            }
        }

        if(totalSum<count)
            totalSum = count;

return totalSum;
    }

}
