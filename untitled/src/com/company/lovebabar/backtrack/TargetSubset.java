package com.company.lovebabar.backtrack;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetSubset {

    public static void main(String args[])
    {
        int [] array= {10,20,30,40,50,70};
        printTargetSum(array,0,70,new ArrayList<>());
    }

    static void printTargetSum(int[] array, int subsetsum, int targetSum,ArrayList<Integer> subsets)
    {

        if (subsetsum>targetSum||array.length==0)
            return;

        if (subsetsum==targetSum)
        {
            System.out.println(subsets);
            return;
        }



        ArrayList<Integer> arrayList = new ArrayList<>();
        subsets.add(array[0]);
        printTargetSum(Arrays.copyOfRange(array,1,array.length),subsetsum+array[0],targetSum,subsets);
        subsets.remove(subsets.size()-1);
        printTargetSum(Arrays.copyOfRange(array,1,array.length),subsetsum,targetSum,subsets);
        //subsets.remove(subsets.size()-1);

    }


}
