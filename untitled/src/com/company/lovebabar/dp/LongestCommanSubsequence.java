package com.company.lovebabar.dp;

public class LongestCommanSubsequence {

    public static void main(String args[])
    {
        System.out.print("LCS");
        String str1 = "ABCDGH";
        String str2 = "AEDFHR";

        int table[][] = new int[str1.length()+1][str2.length()+1];

        for (int i=0;i< table.length;i++)
        {
            for (int j=0;j< table[0].length;j++)
            {
                if (i==0||j==0)
                {
                    table[i][j] = 0;
                    continue;
                }

                if (str2.charAt(j-1)==str1.charAt(i-1))
                {
                    table[i][j] = table[i-1][j-1]+1;
                }
                else
                {
                    table[i][j] = Math.max(table[i][j-1],table[i-1][j]);
                }

            }
        }

        System.out.print(table[str1.length()][str2.length()]);

    }

}
