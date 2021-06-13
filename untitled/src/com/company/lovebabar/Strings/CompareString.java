package com.company.lovebabar.Strings;

public class CompareString {

    public static void main(String args[])
    {

    }

    static boolean match(String wild, String pattern)
    {
        int wildIndex = 0;
        int patternIndex = 0;
        while (wildIndex<wild.length()&&patternIndex<pattern.length())
        {

            if(wild.charAt(wildIndex)!=pattern.charAt(patternIndex))
            {
                switch (wild.charAt(wildIndex))
                {
                    case '?':
                        wildIndex+=1;
                        patternIndex+=1;
                        continue;
                    case '*':
                        if(wildIndex==wild.length()-1||patternIndex==pattern.length()-1)
                            return true;
                        else
                        {
                            while (patternIndex<pattern.length())
                            {}
                        }
                        break;
                    default:
                        return false;
                }
            }

            wildIndex+=1;
            patternIndex+=1;
        }
return  true;
    }
}
