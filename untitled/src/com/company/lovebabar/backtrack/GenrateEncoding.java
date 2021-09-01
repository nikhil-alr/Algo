package com.company.lovebabar.backtrack;

public class GenrateEncoding {

    public static void main(String args[])
    {
        printAllEncoding("303","");
    }


    static void printAllEncoding(String value,String encodedValue)
    {
        if (value.isEmpty())
        {
            System.out.println(encodedValue);
            return;
        }
        for (int i=0;i<value.length();i++)
        {
            String charCodeString = value.substring(0,i+1);
            if (isDigitCodeValid(charCodeString))
            {
                char encodedChar = getChar(Integer.valueOf(charCodeString));
                printAllEncoding(value.substring(i+1,value.length()),encodedValue+encodedChar);
            }
        }
    }


    static char getChar(int code)
    {
        return (char) (96+code);
    }
    static boolean isDigitCodeValid(String digitCode)
    {
        if (digitCode.startsWith("0"))
            return false;

        if (Integer.valueOf(digitCode)>26)
            return false;

        return true;
    }


}
