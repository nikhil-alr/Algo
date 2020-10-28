package com.company.geeks.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class KLargest {

    static List<Integer> arrayList = new ArrayList();

    public static void main(String args[]) {
        int array[] = {7,10,4,3,20,15};

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while (test>0)
        {
            int length = scanner.nextInt();
            array = new int[length];
            scanner.nextLine();
            String tmpArray = scanner.nextLine();

             String arrayString[] = tmpArray.split(" ");

             for (int i=0;i<length;i++)
             {
array[i] = Integer.parseInt(arrayString[i]);
             }

            int smallestElement = scanner.nextInt();

//            System.out.print(length);
//            System.out.print(tmpArray);
//            System.out.print(smallestElement);

            test-=1;
            int kthLargest2 = kthLargest(array, smallestElement);
            System.out.println(kthLargest2);

        }



        //int kthSmallest = kthSmallest(1,array);

        //System.out.print("kthSmallest->"+kthSmallest);
        //System.out.print("kthLargest->"+kthLargest2);

    }




    public static int kthLargest2(int array[],int d)
    {
                int max = 0;
        //quickPartiation(array, 3);

        for (int item: arrayList)
        {
            if (max<item)
                max = item;
        }

        return max;
    }


    //-----------------------Stable-Algo----------------------------------
    public static int kthLargest(int array[],int d)
    {
        if (d> array.length)
            return -1;
        int subArray[] = new int [d];

        for (int i=0;i<d;i++)
        {
            subArray[i] = array[i];
        }
        maximumHepify(subArray);
        for (int i=d;i<array.length;i++)
        {
            if (subArray[0]>array[i])
            {
                subArray[0] = array[i];
                maximumHepify(subArray);
            }

        }


return subArray[0];
    }

    public static void maximumHepify(int array[])
    {
        int parentIndexEnd = (array.length/2)-1;
        for (int i=parentIndexEnd;i>=0;i--)
            heapfiy(array,i,parentIndexEnd);
    }

    public static void heapfiy(int[] array,int i,int parentIndexEnd)
    {


int rightChild = (i*2)+1;
        if ((i*2)+2<=array.length-1)
        {
            rightChild = (i*2)+2;
        }
           int index1= array[(i*2)+1]>array[rightChild]?(i*2)+1:rightChild;

            index1= array[i]> array[index1]?i:index1;

            int tmp = array[i];
            array[i] = array[index1];
            array[index1] = tmp;

            if (i!=index1&&index1<=parentIndexEnd)
            {
                heapfiy(array,index1,parentIndexEnd);
            }

        }
    //-----------------------Stable-Algo----------------------------------

    }


