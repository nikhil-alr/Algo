package com.company.leetcode.array;

public class CircularLoop {

   public static void main(String args[])
   {

       int array[] = {3,1,2};

       System.out.print(isCylePresent(array));


   }


   public static boolean isCylePresent(int array[])
   {
       boolean isCycleDetected = false;
       int visitedItemIndex[] = new int[array.length];
       int firstCycleIndex = 0;
       int lastCycleIndex = 0;
int arrayCounter = 0;

while (true)
{
    int arrayVal = array[arrayCounter];
    array[arrayCounter] = 0;


    if(arrayVal==0)
    {
        isCycleDetected=true;
        break;
    }
    visitedItemIndex[arrayCounter]  = arrayVal;
    lastCycleIndex = arrayCounter;
    firstCycleIndex = arrayCounter+=arrayVal;

    if(arrayCounter>=array.length)
    {
arrayCounter=arrayCounter%array.length;
        firstCycleIndex = arrayCounter;
    }

    if(arrayCounter<0)
    {
        arrayCounter=array.length+arrayCounter;
        firstCycleIndex = arrayCounter;
    }
}

if (lastCycleIndex==firstCycleIndex)
       return false;
int val2 = visitedItemIndex[lastCycleIndex]>visitedItemIndex[firstCycleIndex]?visitedItemIndex[lastCycleIndex]:visitedItemIndex[firstCycleIndex];
int val = visitedItemIndex[lastCycleIndex]+visitedItemIndex[firstCycleIndex];
if(val2>val)
{
    return false;
}



       return isCycleDetected;
   }

}
