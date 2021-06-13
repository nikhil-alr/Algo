package com.company.adityavrma.dp;

public class PalindromPartion {

    static String pString = "ababbbabbababa";
    public static void main(String args[])
    {
        System.out.print("pp");
        System.out.print(partitonCount(0,pString.length()-1));
    }

    static boolean isPalindrom(int start,int end)
    {
        boolean isPalindrom = true;
        int i = start;
        int j = end;
        while (i<j)
        {
            if (pString.charAt(i)!=pString.charAt(j))
            {
                isPalindrom = false;
                break;
            }

            i+=1;
            j-=1;
        }
        return isPalindrom;
    }

    static int partitonCount(int start,int end)
    {
        int ans = Integer.MAX_VALUE;

        if (isPalindrom(start,end))
            return 0;

        for (int i=start;i<end;i++)
        {
            int left = partitonCount(start,i);
            int right = partitonCount(i+1,end);
            int tmpAns = 1+left+right;
            if (ans>tmpAns)
                ans = tmpAns;
        }


        return ans;
    }
}
