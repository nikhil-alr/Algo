package com.company.leetcode;

import java.util.HashMap;

public class NumberToRoman {

    public static void main(String args[])
    {
       System.out.println(intToRoman(1994));
    }


    static public String intToRoman(int num) {

        String numInString = ""+num;
        int divider = 1;
        String romanVal="";

        for (int i=numInString.length()-1;i>=0;i--)
        {
           int val = Integer.valueOf(""+numInString.charAt(i))*divider;
           divider*=10;
            romanVal = getRoman(val)+romanVal;
           //System.out.println();
        }

        return romanVal;

    }


    static String getRoman(int val)
    {
        String romanVal = "";
        switch (val)
        {
            case 1:
                return "I";
            case 5:
                return "V";
            case 10:
                return "X";
            case 50:
                return "L";
            case 100:
                return "C";
            case 500:
                return "D";
            case 1000:
                return "M";
            case 4:
                return "IV";
            case 9:
                return "IX";
            case 40:
                return "XL";
            case 90:
                return "XC";
            case 400:
                return "CD";
            case 900:
                return "CM";

            default:
                int array[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

                while (val>0)
                {
                   for (int i=0;i<array.length;i++)
                   {
                       if (val>=array[i])
                       {
                           val = val - array[i];
                           romanVal = romanVal+getRoman(array[i]);
                           break;
                       }

                   }
                }
                //romanVal = "-";
        }
    return romanVal;
    }

}
