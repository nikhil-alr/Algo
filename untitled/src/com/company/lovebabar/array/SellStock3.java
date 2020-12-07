package com.company.lovebabar.array;

public class SellStock3 {

    public static void main(String args[])
    {
        int array[] = {7,1,5,3,6,4};
        int leftToRightProfit[] = new int[array.length];
        int rightToLeftProfit[] = new int[array.length];
int minBuyPrice = array[0];
int lastMaxProfit = 0;

        for (int i=1;i< array.length;i++)
        {
            int profit = array[i]-minBuyPrice;
            leftToRightProfit[i] = lastMaxProfit;
            if (profit>lastMaxProfit)
            {
                leftToRightProfit[i] = profit;
                lastMaxProfit = profit;

            }

            if(minBuyPrice>array[i])
                minBuyPrice = array[i];




        }

        int maxSellingPrice = array[array.length-1];
        lastMaxProfit = 0;

        for (int i= array.length-2;i>=0;i--)
        {
            int profit = maxSellingPrice-array[i];
            rightToLeftProfit[i] = lastMaxProfit;
            if (profit>lastMaxProfit)
            {
                rightToLeftProfit[i] = profit;
                lastMaxProfit = profit;

            }

            if(maxSellingPrice<array[i])
                maxSellingPrice = array[i];




        }


        int maxProfit = 0;
        for (int i=1;i< array.length;i++)
        {
            int profit = rightToLeftProfit[i]+leftToRightProfit[i];
            if(profit>maxProfit)
                maxProfit = profit;
        }


        System.out.print(maxProfit);
        //System.out.print( divArray(0, array.length-1,array)[0]);



    }




    static int[] divArray(int start,int end,int[] array)
    {

        if (end-start==0)
        {
            System.out.println(start+"Compute"+end);
            int returnVal[] = {0,0};
            return returnVal;
        }
        if (end-start<=1)
        {
            System.out.println(start+"Compute"+end);
            int returnVal[] = {array[end]-array[start]<0?0:array[end]-array[start],1};
            return returnVal;
        }
int mid = (start+end)/2;
        int result[] = divArray(start,mid,array);
        int result2[] = divArray(mid+1,end,array);
        System.out.println(start+"Compute"+end);
int ans1 = 0;
int ans1Count = 0;
        if (result[1]+result2[1]==2)
        {
         ans1 = result[0]+result2[0];
         ans1Count = 2;

         if (ans1<result[0])
         {
             ans1 = result[0];
             ans1Count = 1;
         }

         if (ans1<result2[0])
         {
             ans1 = result2[0];
             ans1Count = 1;
         }

        }
        else
        {
            if (result[0]>result2[0])
            {
                ans1Count = result[1];
            }
            else
            {
                ans1Count = result2[1];
            }
            ans1 = Math.max(result[0],result2[0]);

        }


int ans2 = getProfitValue(array,start,end);
        if (ans2>ans1)
        {
            ans1 = ans2;
            ans1Count = 1;

        }

        int resultt[] = {ans1,ans1Count};
            return resultt;
    }


    static int getProfitValue(int array[],int start,int end)
    {

        int lastPrice = array[end];
        int maxProfit = 0;
        for (int i= end-1;i>=start;i--)
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

        return maxProfit;
    }



}
