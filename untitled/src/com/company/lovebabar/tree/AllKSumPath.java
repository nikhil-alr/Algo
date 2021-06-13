package com.company.lovebabar.tree;

import java.util.ArrayList;
import java.util.List;

public class AllKSumPath {

    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

ArrayList<ArrayList<Integer>> allPathList = new ArrayList<>();

    public static void main(String args[])
    {

ArrayList<Integer> tmp = new ArrayList<>();
tmp.add(1);
        tmp.add(2);
        tmp.add(3);

        System.out.print(tmp.subList(3,tmp.size()));
    }

    void getKSumPath(Node node, int k, ArrayList<Integer> pathList,int pathSum)
    {
        if(node==null)
        {
            return;
        }

        pathList.add(node.data);
        pathSum += node.data;
        ArrayList<Integer> tmpPathList = new ArrayList<>(pathList);

        if(pathSum==k)
        {
            allPathList.add(pathList);
        }

        for (int i=0;i<tmpPathList.size();i++)
        {
            pathSum-=tmpPathList.get(i);
            if(pathSum==k)
            {
                ArrayList<Integer> list= new ArrayList<Integer>(tmpPathList.subList(i+1,tmpPathList.size()));
                allPathList.add(list);
            }
        }

        getKSumPath(node.left,k,pathList,pathSum);
        getKSumPath(node.right,k,pathList,pathSum);


        pathList.remove(pathList.size()-1);
    }

}
