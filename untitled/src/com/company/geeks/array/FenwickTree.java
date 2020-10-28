package com.company.geeks.array;

public class FenwickTree {

    static int array[] = {1,2,3,4,5,6,7,8,9,10};
    static int fenwickTree[] = new int[array.length+1];
    public static void main(String args[])
    {
        for(int i=0;i<array.length;i++)
        buildFnwickTree(i,array[i]);
        System.out.print(getElement(4));
        System.out.print(getElement(2-1));
    }

    public static void buildFnwickTree(int i,int val)
    {
i+=1;

while (i<=array.length)
{
    fenwickTree[i]+=val;

    i+=i&-i;

}
}

    public static int getElement(int index)
    {
int val = 0;
        while (index>0)
{
val+=fenwickTree[index];
    index-=index&-index;

}

    return val;
    }

    public static void updateElement(int index)
    {

    }



}
