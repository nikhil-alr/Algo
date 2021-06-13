package com.company.lovebabar.Strings;

public class SmallestWindow {

    public static void main(String args[])
    {
        smallestWindow("timetopractice","toc");
    }

    public static String smallestWindow(String s, String p)
    {
        int windowStart = 0;
        int windowEnd = 0;

        while (windowEnd<s.length()||windowEnd<s.length())
        {

            if(windowStart<s.length()-1)
            {
                System.out.print("insert"+s.charAt(windowEnd));
                windowEnd+=1;

            }
            else
            {
                System.out.print("remove"+s.charAt(windowStart));
                windowEnd+=1;

            }
        }

        return "true";
    }

}
