package com.company.lovebabar.Strings;

public class Palindrom {

    int isPlaindrome(String S)
    {
        int isPlanidrrom = 1;

        int i=0;
        int j=S.length()-1;

        while (i<j)
        {
            if(S.charAt(i)!=S.charAt(j))
            {
                isPlanidrrom = 0;
                break;
            }

            i+=1;
            j-=1;
        }

        return isPlanidrrom;
    }
}
