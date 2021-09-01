package com.company.lovebabar.backtrack;

import java.util.ArrayList;
import java.util.Collections;

public class GenrateAllPermutation {

    public static void main(String args[])
    {
        //printAllPermuat("123".toCharArray(),0);
//    ArrayList<String> allPermutation = printAllPermuation("12".toCharArray(),0);
//    Collections.sort(allPermutation);
//    System.out.println(allPermutation);
//
       int places[] = new int[4];
        //printAllP(places,3,0,1);
        printAllCombination(places,2,0,1);

    }


    static void printAllP(int[]places,int item,int currentIndex,int currentItem)
    {
        if (item> places.length)
        {
            System.out.println("-1");
            return;
        }

        if (currentItem>item)
        {
            for (int i=0;i< places.length;i++)
            {
                System.out.print(places[i]);
            }
            System.out.println("");
            return;
        }


        for (int i=0;i<places.length;i++)
        {
           if (places[i]==0)
           {
               places[i] = currentItem;
               printAllP(places,item,currentIndex+1,currentItem+1);
               places[i] = 0;
           }
        }

    }


    static ArrayList<String> printAllPermuation(char[] value, int index)
    {
        ArrayList<String> allPermutation = new ArrayList<>();
       if (index== value.length)
       {
           //System.out.println(new String(value));
           ArrayList<String> listnew = new ArrayList<String>();
           listnew.add(new String(value));
           return listnew;
       }

        for (int i=index;i<value.length;i++)
        {
          swap(value,index,i);
            allPermutation.addAll(printAllPermuation(value,index+1));
          swap(value,index,i);

        }

        return allPermutation;
    }

    static void swap(char[] value,int i,int j)
    {
        char tmp = value[i];
        value[i] = value[j];
        value[j] = tmp;

    }

    static void printAllPermuat(char[] value,int index)
    {
        if (index == value.length)
        {
            for (int i=0;i< value.length;i++)
                System.out.print(value[i]);
            System.out.println();
            return;
        }

        for (int i=index;i< value.length;i++)
        {
            swap(value,index,i);
            printAllPermuat(value,index+1);
            swap(value,i,index);
        }
    }


    static void printAllCombination(int[] places,int totalItem,int currentIndex,int currentItem)
    {

        if (currentIndex==places.length)
        {
            //places[currentIndex] = currentItem;
            int tmpCount = 0;
            for (int i=0;i< places.length;i++)
            {
                if (places[i]!=0)
                    tmpCount+=1;
            }

            if (tmpCount==totalItem)
            {
                for (int i=0;i< places.length;i++)
                {
                    System.out.print(places[i]);
                }
                System.out.println("");
            }
            return;
        }

        places[currentIndex] = currentItem;

{
    printAllCombination(places,totalItem,currentIndex+1,currentItem+1);
    places[currentIndex] = 0;
    printAllCombination(places,totalItem,currentIndex+1,currentItem);
    places[currentIndex] = 0;

}

    }



}
