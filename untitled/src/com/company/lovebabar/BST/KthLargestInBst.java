package com.company.lovebabar.BST;

import java.util.ArrayList;
import java.util.List;

public class KthLargestInBst {

     class Node {
        int data;
        Node left;
         Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[])
    {

    }
    int kthSmallest = 0;
    public int kthLargest(Node root,int K)
    {
        ArrayList<Integer> list =  new ArrayList<>();
        inOrderTravrse(root,K,list);

       return list.get(K);
    }

    public void inOrderTravrse(Node root, int K, ArrayList<Integer> list)
    {

        if(root==null)
            return;

        inOrderTravrse(root.left,K,list);
        list.add(root.data);
 inOrderTravrse(root.right,K,list);





    }


}
