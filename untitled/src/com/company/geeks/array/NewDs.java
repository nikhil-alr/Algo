package com.company.geeks.array;

public class NewDs {

    static int array[]={1,2,3,4,5};
    static int segMentTree[];
     int maxFiled = 0;
    public static void main(String args[])
    {
        segmentTree();
    }


    static void segmentTree()
    {
        int x = (int) (Math.ceil(Math.log(array.length) / Math.log(2)));

        segMentTree = new int[ (4 * array.length) - 1];
    buildSegmentTree(0,0,array.length-1);
System.out.print(query(0,0,4
        ,0, array.length-1 ));
    }


    static void buildSegmentTree(int pos,int left,int right)
    {
        if(left==right)
        {
            segMentTree[pos] = array[left];

            return;
        }
        else
        {
            int mid = (left + right)  / 2;
            buildSegmentTree(2*pos+1,left,mid);
            buildSegmentTree(2*pos+2,mid+1,right);

            segMentTree[pos] = segMentTree[2*pos+1]+segMentTree[2*pos+2];


        }
    }


    static int query(int pos,int queryRangeL,int queryRangeR,int treeRangeL,int treeRangeR)
    {

        if(queryRangeL>treeRangeR||queryRangeR<treeRangeL)
        {
return 0;
        }

        if(queryRangeL<=treeRangeL&&queryRangeR>=treeRangeR)
       {
          return segMentTree[pos];
       }

        int mid = (treeRangeR + treeRangeL)  / 2;

        int val1 = query(2*pos+1,queryRangeL,queryRangeR,treeRangeL,mid);
        int val2 = query(2*pos+2,queryRangeL,queryRangeR,mid+1,treeRangeR);

        return val1+val2;
    }


}
