package com.company.leetcode.array;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeSumProblem {

    static int array[]={3,0,-2,-1,1,2};
    public static void main(String args[]) {
    threeSums(array);

    }


    static List<List<Integer>> threeSums(int array[])
    {
        Arrays.sort(array);
        Set<List<Integer>> resultSet = new LinkedHashSet<>();

//        for (int item:array)
//        {
//            System.out.print(item);
//        }


        for (int i=0;i<array.length-2;i++)
        {
           //System.out.print(array[i]);
            int start = i+1;
            int end = array.length-1;
           while (start<end)
            {
                int a = array[i];
                int sum = array[start]+array[end];
                if((a+sum)==0)
                {

                    resultSet.add(Arrays.asList(array[i],array[start],array[end]));

                   //System.out.println(array[i]+"->"+array[start]+"->"+array[end]);
                    start+=1;
                    end-=1;
                    continue;
                }


                if (a+sum<0)
                {
                    start+=1;

                }
                else
                {
                    end-=1;
                }

            }
        }

return new ArrayList<>(resultSet);
    }



    public static void mergeSort(int array[],int start,int end)
    {
        if(start>=end)
            return;
        int mid = (start+end)/2;
        mergeSort(array,start,mid);
        mergeSort(array,mid+1,end);
        merge(array,start,end);
    }



    public static void merge(int array[],int start,int end)
    {

        System.out.print("");
mergeWithSpace(array,start,end);
System.out.print("");


    }

    static void mergeWithSpace(int arra[],int start,int end){

        int mid = (start+end)/2;
        int leftArray[] = new int[(mid-start)+1];
        int rightArray[] = new int[end-mid];

        int mainArrayCounter = start;

        for (int i=0;i<leftArray.length;i++)
        {
            leftArray[i] = array[mainArrayCounter];
            mainArrayCounter+=1;
        }


        for (int i=0;i<rightArray.length;i++)
        {
            rightArray[i] = array[mainArrayCounter];
            mainArrayCounter+=1;
        }

        int i=0,j=0;
        mainArrayCounter = start;
        while (i< leftArray.length&&j< rightArray.length)
        {
            int element1 = leftArray[i];
            int element2 = rightArray[j];
            if(element1<element2)
            {
                i+=1;
                array[mainArrayCounter] = element1;
            }
            else
            {
                j+=1;
                array[mainArrayCounter] = element2;
            }
            mainArrayCounter+=1;
        }

        while (i< leftArray.length)
        {
            array[mainArrayCounter] = leftArray[i];
            mainArrayCounter+=1;
            i+=1;
        }
        while (i< leftArray.length)
        {
            array[mainArrayCounter] = rightArray[j];
            mainArrayCounter+=1;
            j+=1;
        }
    }

    static void mergeWithoutSpace(int arra[],int start,int end){

    }





}
