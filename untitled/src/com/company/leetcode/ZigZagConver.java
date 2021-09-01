package com.company.leetcode;

public class ZigZagConver {

    public static void main(String args[])
    {
System.out.println(convert("PAYPALISHIRING",3));
    }

    static public String convert(String s, int numRows) {

        StringBuilder ans = new StringBuilder("");
        char[][] charsRows = new char[numRows][s.length()];
        int row = 0;
        int column = 0;
        int adder = 0;
        for (int i=0;i<s.length();i++)
        {
            charsRows[row][column] = s.charAt(i);
            if (row==0)
            {
                adder=1;
            }
            if (row==numRows-1)
            {
                adder=-1;
            }

            if (adder==-1)
                column+=1;
            row+=adder;


        }


        for (int i=0;i< charsRows.length;i++)
        {
            for (int j=0;j< charsRows[i].length;j++)
            {
                System.out.print(charsRows[i][j]);
                ans.append(charsRows[i][j]);
            }

        }

        return new String(ans);
    }

}
