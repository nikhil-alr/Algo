package com.company.lovebabar.dp;

public class EditDistance {

    public static void main(String args[])
    {
        //System.out.print("EDIT DISTANCE");
        String s1 = "dbb";
        String s2 = "fdfaccddfac";

        int table[][] = new int[s1.length()+1][s2.length()+1];

        for (int i=0;i<table.length;i++)
        {
            for (int j=0;j<table[0].length;j++)
            {
                if (i==0&&j==0)
                {
                    table[i][j] = 0;
                    continue;
                }

                if (i==0)
                {
                    table[i][j] = j;
                    continue;
                }

                if (j==0)
                {
                    table[i][j] = i;
                    continue;
                }

                int a = table[i-1][j];
                int b = table[i][j-1];
                int c = table[i-1][j-1];

                a = Math.min(a,b);
                a= Math.min(a,c);

                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                   table[i][j] = table[i-1][j-1];
                }
                else
                {
                    table[i][j] = a+1;
                }

            }
        }

        System.out.print(table[s1.length()][s2.length()]);

    }
}
