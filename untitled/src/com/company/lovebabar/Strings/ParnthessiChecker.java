package com.company.lovebabar.Strings;

public class ParnthessiChecker {

    public static void main(String args[])
    {

    }

    static boolean ispar(String x)
    {

        int largeBracker = 0;
        int smallBracket = 0;
        int mediumBracket = 0;

        for (int i=0;i<x.length();i++)
        {
            int ch = x.charAt(i);
            switch (ch)
            {
                case '{':
                    mediumBracket+=1;
                    break;
                case '}':
                    mediumBracket+=1;
                    break;
                case '[':
                    largeBracker+=1;
                    break;
                case ']':
                    largeBracker+=1;
                    break;
                case '(':
                    smallBracket+=1;
                    break;
                case ')':
                    smallBracket+=1;
                    break;
            }
        }


      if (smallBracket==0&&largeBracker==0&&mediumBracket==0)
          return true;
        return false;
    }


}
