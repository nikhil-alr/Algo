package com.company.lovebabar.Strings;

public class LongestCommanPerfix {

    public static void main(String args[])
    {
        String strs[] = {"flower","flow","flight"};
        System.out.print(longestCommonPrefix(strs));
    }

   static public String longestCommonPrefix(String[] strs) {


        String longestCommanPrefix = "";
        if(strs.length==0)
            return longestCommanPrefix;

       if(strs.length==1)
           return strs[0];

        int smallestStringLen = Integer.MAX_VALUE;
        for (int i=0;i< strs.length;i++)
        {
            if (smallestStringLen>strs[i].length())
                smallestStringLen = strs[i].length();
        }

        if (smallestStringLen==Integer.MAX_VALUE)
            return longestCommanPrefix;

       for (int i=0;i<smallestStringLen;i++)
       {
           boolean isCharMatched = true;
           char ch = strs[0].charAt(i);
           for (int j=1;j<strs.length;j++)
           {
               if (strs[j].charAt(i)!=ch)
               {
                   isCharMatched = false;
                   break;
               }
           }
           if (isCharMatched)
               longestCommanPrefix+=strs[0].charAt(i);
           else
               break;
       }

       return longestCommanPrefix;
    }

}
