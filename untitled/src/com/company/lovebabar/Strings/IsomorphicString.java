package com.company.lovebabar.Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class IsomorphicString {

    public static void main(String args[])
    {
        System.out.print(isStringAreIsomorphic("aab","xxy"));
    }

    static boolean isStringAreIsomorphic(String s1,String s2)
    {
        boolean isIsoMorphic = true;

        if (s1.length()!=s2.length())
            return false;

        char s1Map[] = new char[256];
        char s2Map[] = new char[256];


        for (int i=0;i<s1.length();i++)
        {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(s1Map[ch1]==0)
            {
                s1Map[ch1] = ch2;
            }
            else
            {
                char ch1Mapped = s1Map[ch1];
                if(ch1Mapped!=ch2)
                    return false;
            }

            if(s2Map[ch2]==0)
            {
                s2Map[ch2] = ch1;
            }
            else
            {
                char ch2Mapped = s2Map[ch2];
                if(ch2Mapped!=ch1)
                    return false;
            }

        }

        return isIsoMorphic;

    }

}
