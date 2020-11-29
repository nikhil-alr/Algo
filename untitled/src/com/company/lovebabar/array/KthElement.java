package com.company.lovebabar.array;

public class KthElement {

    class Pair{
        int min;
        int max;
    }

   public static void main(String args[]) {
int array[] = {1,2,3,4,5};
   kthMinMax(array);
    }

   public static void kthMinMax(int array[])
   {

       int heap[] = array;
       int parentIndex = (array.length/2)-1;
       for (int i=parentIndex;i>=0;i--)
       {

           maxHeapify(heap,i);
       }

   }

   static public void maxHeapify(int array[],int parentIndex)
   {
  int leftChild = (2*parentIndex)+1;
  int rightChild = (2*parentIndex+2);

  if(rightChild>=array.length)
  {
      rightChild = leftChild;
  }
   leftChild = array[leftChild]>array[rightChild]?leftChild:rightChild;

  if (array[parentIndex]<array[leftChild])
  {
      int tmp = array[leftChild];
      array[leftChild] = array[parentIndex];
      array[parentIndex]  = tmp;

      if (2*leftChild+1<array.length)
          maxHeapify(array,leftChild);
  }




   }
}
