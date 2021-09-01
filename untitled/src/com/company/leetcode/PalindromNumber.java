package com.company.leetcode;

public class PalindromNumber {

    public static void main(String args[])
    {
System.out.print(isPalindrome(1221));
    }

//    static public boolean isPalindrome(int x) {
//
//        boolean isPalindrome = true;
//
//        char[] valueFirstString = (""+x).toCharArray();
//        char[] valueSecondString = new String(new StringBuilder(""+x).reverse()).toCharArray();
//
//
//
//
//        for (int i=0;i< valueFirstString.length;i++)
//        {
//            if (valueFirstString[i]!=valueSecondString[i])
//                return false;
//        }
//
//
//        return true;
//    }
//
    static boolean isPalindrome(int x)
    {
        boolean ans = false;
        if (x<0)
            ans =  false;

int reverse = 0;
        while (x>reverse)
        {
            int val = x%10;
            x/=10;
            //System.out.print(val);
            reverse=reverse*10+val;
            //System.out.println(reverse);
        }

        if(x==reverse||x==reverse/10)
            ans =  true;

        return ans;
    }

}


