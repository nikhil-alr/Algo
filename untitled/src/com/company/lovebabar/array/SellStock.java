package com.company.lovebabar.array;

public class SellStock {

    public static void main(String args[])
    {
        int array[] = {7,1,5,3,6,4};

        int lastPrice = array[array.length-1];
        int maxProfit = 0;
        for (int i= array.length-2;i>=0;i--)
        {
            if (lastPrice<array[i])
            {
                lastPrice = array[i];
            }
            else
            {
                int profit = lastPrice-array[i];
                if (maxProfit<profit)
                    maxProfit = profit;
            }
        }
        System.out.print(maxProfit);

    }

}
