package com.company.lovebabar.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommanElements {

    public static void main(String args[])
    {
        int array1[] = {1, 5, 10, 20, 40, 80};
        int array2[] = {6, 7, 20, 80, 100};
        int array3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        Set<Integer> arrayList = new LinkedHashSet<>();

        HashMap hashMap1 = new HashMap<Integer,Integer>();
        HashMap hashMap2 = new HashMap<Integer,Integer>();
        HashMap hashMap3 = new HashMap<Integer,Integer>();

        for (int item:array1)
            hashMap1.put(item,item);


        for (int item:array2)
            hashMap2.put(item,item);


        for (int item:array3)
            hashMap3.put(item,item);

        for (int item:array1)
        {
            if(hashMap1.containsKey(item)&&
            hashMap2.containsKey(item)&&
            hashMap3.containsKey(item))
            {
                arrayList.add(item);
            }
        }



        for (int item:array2)
        {
            if(hashMap1.containsKey(item)&&
                    hashMap2.containsKey(item)&&
                    hashMap3.containsKey(item))
            {
                arrayList.add(item);
            }
        }



        for (int item:array3)
        {
            if(hashMap1.containsKey(item)&&
                    hashMap2.containsKey(item)&&
                    hashMap3.containsKey(item))
            {
                arrayList.add(item);
            }
        }

ArrayList<Integer> arrayListtt = new ArrayList<>();
        for (int item:arrayList)
        {
            arrayListtt.add(item);
        }

System.out.print("");


    }

}
