package com.company.lovebabar.Strings;

public class ReverseString {

    public static void main(String args[])
    {

    }

    public void reverseString(char[] s) {

        int i=0;
        int j=s.length-1;

        while (i<j)
        {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;

            i+=1;
            j+=1;
        }
    }

}
