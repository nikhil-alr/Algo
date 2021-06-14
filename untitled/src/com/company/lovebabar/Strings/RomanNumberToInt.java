package com.company.lovebabar.Strings;

public class RomanNumberToInt {

    public static void main(String args[])
    {
System.out.print(romanToDecimal("XCXC"));
    }

    static public int romanToDecimal(String str) {
       int number = 0;
       int lastNumber = Integer.MAX_VALUE;

       for (int i=0;i<str.length();i++)
       {
           int newNumber = 0;
           switch (str.charAt(i))
           {
               case 'I':
                   newNumber=1;
                   break;
               case 'V':
                   newNumber=5;
                   break;
               case 'X':
                   newNumber=10;
                   break;
               case 'L':
                   newNumber=50;
                   break;
               case 'C':
                   newNumber=100;
                   break;
               case 'D':
                   newNumber=500;
                   break;
               case 'M':
                   newNumber=1000;
                   break;
           }

           number+=newNumber;

           if(lastNumber<newNumber)
               number-=(lastNumber+lastNumber);
           lastNumber = newNumber;
       }

       return number;
       // code here
    }

}
