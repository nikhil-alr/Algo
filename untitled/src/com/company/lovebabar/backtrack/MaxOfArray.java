package com.company.lovebabar.backtrack;

public class MaxOfArray {

    public static void main(String args[])
    {
        int array[] = {1,35,2,11,5,3,4,35,6,35,7,28,19,10};
        int allIndex[] = getAllIndex(array,0,35);
        for (int arrayIndex:allIndex)
            System.out.print(arrayIndex+",");
    }

    static int getMax(int array[],int index)
    {
        if (index==0)
            return array[index];

        int maxValue = array[index];

        int tmpMax = getMax(array,index-1);
        if (tmpMax>maxValue)
            maxValue = tmpMax;

        return maxValue;
    }

    static int getFirstIndex(int array[],int index,int key)
    {
        if(index == array.length)
            return -1;

        int keyIndex = array[index]==key?index:-1;
        int lastIndex = getFirstIndex(array,index+1,key);

        if (lastIndex!=-1)
            return lastIndex;


        return keyIndex;
    }

    static int[] getAllIndex(int array[],int index,int key)
    {
        int ansArray[] = new int[0];
        int ansArrayCounter = 0;
        if(index == array.length)
            return ansArray;

        int subArrayAns[] = getAllIndex(array,index+1,key);
        int totalSize = subArrayAns.length;
        ansArray = new int[totalSize];
        if (array[index] == key)
        {

            totalSize+=1;
            ansArray = new int[totalSize];
            ansArray[0] = index;
            ansArrayCounter = 1;
        }

        for (int i=0;i<subArrayAns.length;i++)
        {
            ansArray[ansArrayCounter] = subArrayAns[i];
            ansArrayCounter+=1;
        }

       return ansArray;
    }


}
