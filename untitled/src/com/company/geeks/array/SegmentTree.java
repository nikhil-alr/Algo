package com.company.geeks.array;

public class SegmentTree {

    public static void main(String args[])
    {
        int array[] = {1,2,3,4,5,6};
        int segTree[] = new int[(array.length*4)+1];
    buildTree(array,0,array.length-1,segTree,0);
    }

    public static void buildTree(int array[],int low,int high,int segTree[],int pos)
    {

if(low==high)
{
    segTree[pos] = array[low];
    return;
}
        int mid = (low+high)/2;
        buildTree(array,low,mid,segTree,2*pos+1);
        buildTree(array,mid+1,high,segTree,2*pos+2);
segTree[pos] = segTree[2*pos+1]+segTree[2*pos+2];
System.out.print("DATA");


    }



    public static void genrate(int low,int high,int rl,int rh)
    {
         if(high<rl||rh<low)
        {
            System.out.print("No Overlap");

        }

        if(low<=rl&&rh<=high)
        {
            System.out.print("Total Overlap");
        }


       


    }

}
