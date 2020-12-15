package com.company.lovebabar.array;

public class MergeArray {

    public static void main(String args[])
    {
//        int array1[]= {1,2,3,4,5,6,7};
//        int array2[] = {2,3,4,5,6};



        int arr1[] = {2,12,7,10};
        int arr2[] = {2,2,6,6,7,7,10,11,12,14,15,16};
        //mergeUsingGapMethod(arr1,arr2);
        //mergeUsingInsertionSort(arr1,arr2);
System.out.print("");
    }


    public static void mergeUsingInsertionSort(int array1[],int array2[])
    {

       while (true) {


           int smallItem = array2[0];
           int position = -1;


           for (int i = array1.length - 1; i >= 0; i--) {
               if (smallItem > array1[i]) {
                   break;
               }
               position = i;
           }

if (position==-1)
    break;
           int largeItem = array1[array1.length - 1];
           for (int i = array1.length - 1; i > position; i--) {
               array1[i] = array1[i - 1];
           }
           array1[position] = smallItem;
           position = -1;

           for (int i = 0; i < array2.length; i++) {
               if (largeItem < array2[i]) {

                   break;
               }
               position = i;
           }

           for (int i = 0; i < position; i++) {
               array2[i] = array2[i + 1];
           }
           array2[position] = largeItem;


       }

       for (int item:array1)
           System.out.print(item+" ");
           for (int item:array2)
               System.out.print(item+" ");


    }

    public static void mergeUsingGapMethod(int[] array1,int[] array2)
    {
       int gap = getGap(array1.length+ array2.length);
       while (gap>0)
       {

int i=0;
           for (i=0;i+gap< array1.length;i++)
           {
               if (array1[i]>array1[i+gap])
               {
int tmp = array1[i];
array1[i] = array1[i+gap];
                   array1[i+gap] = tmp;
               }

           }

i+=1;
           if(i>= array1.length)
               i-=1;

           int j=gap > array1.length ? gap - array1.length:0;
           while (i< array1.length&&j< array2.length)
           {

               if (array1[i]>array2[j])
               {
                   int tmp = array1[i];
                   array1[i] = array2[j];
                   array2[j] = tmp;
               }

               i+=1;
               j+=1;
           }

           for (i=0;i+gap< array2.length;i++)
           {
               if (array2[i]>array2[i+gap])
               {
                   int tmp = array2[i];
                   array2[i] = array2[i+gap];
                   array2[i+gap] = tmp;
               }
               System.out.print("");
           }




           System.out.print(gap);

           gap = getGap(gap);
       }


    }

    static int getGap(int n)
    {
        if(n==1)
            return 0;
        return n/2+n%2;
    }

}
