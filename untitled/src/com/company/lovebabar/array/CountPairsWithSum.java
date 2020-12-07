package com.company.lovebabar.array;

import java.util.Arrays;
import java.util.HashMap;

public class CountPairsWithSum {

    public static void main(String args[])
    {

        int count = 0;
        int array[]= {1,1,1,1};
int k = 6;
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i:array)
        {
            hashMap.put(i,i);
        }

        for (int i:array)
        {

            if(hashMap.containsKey(k-i))
                count+=1;
        }

System.out.print(count-1);
    }


    static void m2()
    {
        int array[] = {1,5,7,1};
        Arrays.sort(array);
        int k = 6;
        int i=0;
        int j= array.length-1;
        int count = 0;
        while (i<j)
        {
            if (array[i]+array[j]==k)
            {
                count+=1;
                break;
            }

            if (array[i]+array[j]<k)
            {
                i+=1;
            }
            else
            {
                j-=1;
            }

        }

        for (int left=i+1;left<=j-1;left++)
        {
            if (array[left]+array[j]==k)
                count+=1;

            if (array[left]+array[j]>k)
                break;
        }


        for (int left=j;left>i;left--)
        {
            if (array[i]+array[left]==k)
                count+=1;

            if (array[i]+array[left]<k)
                break;
        }

    }

}
