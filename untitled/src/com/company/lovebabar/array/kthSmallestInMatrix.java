package com.company.lovebabar.array;

import javafx.util.Pair;

import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collections;



public class kthSmallestInMatrix {

    public static void main(String args[])
    {
        int mat[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {24, 29, 37, 48},
                {32, 33, 39, 50},};

        getSmallest(mat,7);


    }



    static int getSmallest(int[][]mat,int k)
    {
        int kthSmallest = 0;
        KVPair kvPair = null;
        int ans = -1;
        KVPair heap[] = new KVPair[mat.length];
        int column[] =  new int[heap.length];

        for (int i=0;i< heap.length;i++)
        {
            KVPair kvPair1 = new KVPair(i,mat[i][0]);
            column[i] = 0;
           // kvPair1.keyRow = i;
            heap[i] = kvPair1;
        }
        int row=0;
if(k<=mat.length*mat[0].length)
{


        while (k>0)
{


            int parentIndex = (heap.length / 2) - 1;
            for (int i = parentIndex; i >= 0; i--) {
                maxHeapify(heap, i);
            }
            kvPair = heap[0];
            ans = kvPair.val;
            int col = column[kvPair.keyRow]+1;
            row = kvPair.keyRow;
            while(col>=mat[0].length)
            {
                //increase row and update column
                row=row+1;
                if (row>=mat.length)
                {
                    break;
                }
                col = column[row]+1;
            }
            if (row>=mat.length||col>=mat[0].length)
                break;

                column[row] = col;
                kvPair.val = mat[row][col];
                kvPair.keyRow = row;
k-=1;
}


if (k!=0)
{
    int array[] = new int[heap.length];
    for (int i=0;i< array.length;i++)
    {
        array[i] = heap[i].val;
    }
    Arrays.sort(array);
    ans = array[k-1];
}
}
System.out.print(ans);
        return ans;
    }




    static public void maxHeapify(KVPair array[],int parentIndex)
    {
        int leftChild = (2*parentIndex)+1;
        int rightChild = (2*parentIndex+2);

        if(rightChild>=array.length)
        {
            rightChild = leftChild;
        }
        leftChild = array[leftChild].val<array[rightChild].val?leftChild:rightChild;

        if (array[parentIndex].val>array[leftChild].val)
        {
            KVPair tmp = array[leftChild];
            array[leftChild] = array[parentIndex];
            array[parentIndex]  = tmp;

            if (2*leftChild+1<array.length)
                maxHeapify(array,leftChild);
        }




    }

}
class KVPair{
    int keyRow;

    int val;

    public KVPair(int keyRow, int val) {
        this.keyRow = keyRow;
        this.val = val;
    }





    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
