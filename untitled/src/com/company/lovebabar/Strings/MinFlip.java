package com.company.lovebabar.Strings;

public class MinFlip {

    public static void main(String args[])
    {
        System.out.print(minFlips("000001111111100000000000"));
    }

    public static int minFlips(String S) {
        int minFlipCount = 0;
        char lastChar = S.charAt(0);
        for (int i=1;i<S.length();i++)
        {
            char newChar = S.charAt(i);
            if (lastChar==newChar)
            {
                if (lastChar=='0')
                    lastChar ='1';
                else
                    lastChar = '0';
                minFlipCount+=1;
                continue;
            }
            lastChar = S.charAt(i);
        }

        return minFlipCount;
    }
}
