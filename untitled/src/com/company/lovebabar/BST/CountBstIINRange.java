package com.company.lovebabar.BST;

import com.company.adityavrma.dp.A;

import java.util.ArrayList;

public class CountBstIINRange {

     class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

    int getCount(Node root,int l, int h)
    {

        int bstCount = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=1;i<list.size();i++)
        {
            if (list.get(i)-list.get(i-1)==1)
            {
                //return true;
            }
        }

        return bstCount;
    }


    void inOrder(Node node,ArrayList<Integer> list)
    {
        if (node==null)
            return;

        inOrder(node.left,list);
        list.add(node.data);
        inOrder(node.right,list);

    }

}


