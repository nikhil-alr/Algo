package com.company.lovebabar.array;

import java.util.ArrayList;
import java.util.HashMap;

class Pair{

    Pair(int index1,int index2,int profit)
    {
this.index1 = index1;
this.index2 = index2;
this.profit = profit;
    }

    int index1;
    int index2;
    int profit;
}

public class SellStock2 {



    public static void main(String args[])
    {

     int array[] = {3,3,5,0,0,3,1,4};
System.out.print(peekAndValley(array));
    }



    public static void intervalSchduling(int array[])
    {
        ArrayList<Pair> arrayList = new ArrayList<Pair>();


        for (int i=0;i< array.length-1;i++)
        {
            for (int j=i+1;j< array.length;j++)
            {
                int profit = array[j]-array[i];
                if (profit>0)
                {

                    arrayList.add(new Pair(i,j,profit));

                    System.out.print("");
                }

//             if (array[i]-array[i-1]>0)
//             {
//
//
//             }
            }

        }

        int ansArray[] = new int[arrayList.size()];
        for (int i=0;i< ansArray.length;i++)
        {
            ansArray[i] = arrayList.get(i).profit;
        }

        for (int i=1;i<arrayList.size();i++)
        {
            for (int j=0;j<=i;j++)
            {
//is range overlapping
                if (arrayList.get(j).index2>=arrayList.get(i).index1)
                    continue;
                else
                {
                    if (ansArray[j]+arrayList.get(i).profit>ansArray[i])
                        ansArray[i] = ansArray[j]+arrayList.get(i).profit;
                }

            }
        }
        int max = 0;



        for (int localMax:ansArray)
        {
            if (max<localMax)
                max = localMax;
        }

        System.out.print(max);
    }

public static int peekAndValley(int array[])
{
    int totalSum = 0;

    for (int i=1;i< array.length;i++)
    {
        int tmpSum = array[i]-array[i-1];
        if (tmpSum>0)
        {
            totalSum+=tmpSum;
        }

    }

    return totalSum;
}


}
