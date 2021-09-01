package com.company.adityavrma.dp;

import java.util.Arrays;
import java.util.List;

public class CoinChangeProablem {

    public static void main(String args[])
    {
        System.out.print(countChange(10, Arrays.asList(5,2,3)));
    }

    public static Integer countChange(Integer money, List<Integer> coins ) {


Object[] S = coins.toArray();

        int[] table = new int[money+1];

        Arrays.fill(table, 0);

        table[0] = 1;

        for (int i=0; i< coins.size(); i++)
            for (int j=(int)S[i]; j<=money; j++)
                table[j] += table[j-(int)S[i]];

        return table[money];


    }

}
