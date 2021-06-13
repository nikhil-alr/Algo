package com.company.lovebabar.Heap;

public class isTreeAHeap {



class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


    boolean isHeap(Node tree)
    {
        if(tree.left==null&&tree.right==null)
            return true;

        if(tree.right==null)
        {
            if (tree.data<tree.left.data)
                return false;
            return true;
        }

        if(tree.left==null)
        {
            if (tree.data<tree.right.data)
                return false;
            return true;
        }

    if(tree.data<tree.right.data||tree.data<tree.left.data)
        return false;

    boolean isHeap =  isHeap(tree.left);
    if(isHeap)
       isHeap =  isHeap(tree.right);

    return isHeap;

    }

}
