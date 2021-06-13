package com.company.lovebabar.dp;

public class LongestRepatitingSubseq {

    public static void main(String args[])
    {
        System.out.print("LRS");

        String str = "axxxy";
        int table[][] = new int[str.length()+1][str.length()+1];

        for (int i=1;i< table.length;i++)
        {
            for (int j=0;j<table[0].length;j++)
            {
                if (i==0&&j==0)
                    continue;

                if (i==0)
                {
                    continue;
                }

                if (j==0)
                {
                    continue;
                }

                if (i!=j&&str.charAt(i-1)==str.charAt(j-1))
                {
                    table[i][j] = table[i-1][j-1]+1;
                }
                else
                {
                    table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
                }

            }
        }



System.out.print(table[str.length()][str.length()]);



    }


}
