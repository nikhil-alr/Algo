package com.company.geeks.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ZeroSumSubArray {

    public static void main(String args[])
    {
        int array[]={6,-1,-3,4,-2,2,4,6,-12,-7};

        Scanner scanner = new Scanner(System.in);


        int testCase = scanner.nextInt();
        while(testCase>0){

           // System.out.print("ssssss");
            int arraySize = scanner.nextInt();
            array = new int[arraySize];
            for (int i=0;i<arraySize;i++)
            {
                array[i] = scanner.nextInt();
            }
            System.out.print(countSubarrayZero(array));
            testCase-=1;
    }


    }



    //-------- Stable Algo---------
    static public int countSubarrayZero(int array[])
    {
        int toatlSum = 0;
        int countSubArray = 0;
        HashMap<Integer, ArrayList<Integer>> hashMap  = new HashMap<Integer, ArrayList<Integer>>();


        for (int i=0;i<array.length;i++)
        {
            toatlSum+=array[i];
            if(toatlSum==0)
            {
                countSubArray+=1;
            }

            ArrayList<Integer> arrayList = new ArrayList<>();
            if (hashMap.containsKey(toatlSum))
            {
              arrayList = hashMap.get(toatlSum);
                countSubArray+=arrayList.size();
            }

            arrayList.add(array[i]);
            hashMap.put(toatlSum,arrayList);
        }
    return countSubArray;
    }
    //-------- Stable Algo---------

}
