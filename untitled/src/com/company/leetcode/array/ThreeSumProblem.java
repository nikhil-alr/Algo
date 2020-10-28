package com.company.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSumProblem {

    static int array[]={-1,0,1};
    public static void main(String args[])
    {



//        if(array.length==0||array[0]==0&&array.length==1)
//        {
//            //List<Integer> tmp = new ArrayList<>();
//            //aray.add(tmp);
//            return;
//        }
//
//        int tmpSum=0;
//        List arrayList = null;
//        for(int i=0;i< array.length;i++)
//        {
//            arrayList = new ArrayList<Integer>();
//            tmpSum+=array[i];
//        }
//
//        List<List<Integer>> aray = new ArrayList<>();
//
//
//        if (tmpSum==0)
//        {
//
//aray.add(arrayList);
//            return ;
//        }

        List<List<Integer>> aray = new ArrayList<>();

        int tmpSum = 0;
        for(int i=0;i< array.length;i++)
        {

            tmpSum+=array[i];
        }


        if(tmpSum==0&&array.length==3)
        {
            List arrayList  = new ArrayList<Integer>();
            arrayList.add(array[0]);
            arrayList.add(array[1]);
            arrayList.add(array[2]);
            aray.add(arrayList);
            return;
        }


        mergeSort(array,0,array.length-1);





        int pivot = Integer.MAX_VALUE;
        int pivotIndex = 0;
        for (int i=0;i<array.length;i++)
        {
            if (array[i]>=0&&array[i]<pivot)
            {
                pivot = array[i];
                pivotIndex = i;
            }
        }


        for (int i=0;i<pivotIndex-1;i++)
        {
            int a = array[i];
            int start = pivotIndex;
            int end = array.length-1;

            while (start<end)
            {

                int b = array[start];
                int c = array[end];

                if((b+c)+a==0)
                {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(a);
                    tmp.add(b);
                    tmp.add(c);
                    aray.add(tmp);
                    //System.out.print("["+a+","+b+","+c+"],");
                    break;
                }

                if(b+c>a)
                {
                    end-=1;
                }
                else
                {
                    start+=1;
                }
            }
        }



        for (int i=pivotIndex;i< array.length;i++)
        {
            int a = array[i];
            int start = 0;
            int end = pivotIndex-1;

            while (start<end)
            {

                int b = array[start];
                int c = array[end];

                if((b+c)+a==0)
                {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(b);
                    tmp.add(c);
                    tmp.add(a);
                    aray.add(tmp);
                    //System.out.print("["+b+","+c+","+a+"]");
                    break;
                }

                if(b+c>a)
                {
                    end-=1;
                }
                else
                {
                    start+=1;
                }
            }
        }
        //System.out.print("]");



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
