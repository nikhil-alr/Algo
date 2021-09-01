package com.company.leetcode;

public class RomanToInt {

    public static void main(String args[])
    {
        System.out.print(romanToInt("III"));;
    }

    static public int romanToInt(String s) {

        int ans = 0;
        for (int i=0;i<s.length();i++)
        {
            int j=i+1;
            if (i==s.length()-1)
                j = i;
            int val1 = getRoman(""+s.charAt(i));
            int val2 = getRoman(""+s.charAt(j));

            if(val1==-1||val2==-1)
                return -1;

            if(val1>=val2)
            {
               ans = ans+val1;
            }
            else
            {
                val1 = val2-val1;
                ans = ans+val1;
                i=j;
            }

        }

        return ans;

    }

    static int getRoman(String val)
    {
        int romanVal = -1;
        switch (val)
        {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
             //romanVal = "-";
        }
        return romanVal;
    }

}
