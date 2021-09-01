package com.company.geeks.events;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

public class IsPairPresent {

    public int isPairPresent(Node root, int target)
    {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        Queue<Node> queue = new LinkedList<>();
        // Write your code here
          Node node = root;
           queue.add(node);
      while (!queue.isEmpty())
     {
    root = queue.poll();
    if(node.left!=null)
        queue.add(node.left);

    if(root.right!=null)
        queue.add(node.right);
         hashMap.put(root.data, root.data);


}

        node = root;
        queue.add(node);
        while (!queue.isEmpty())
        {
            root = queue.poll();
            if(node.left!=null)
                queue.add(node.left);

            if(root.right!=null)
                queue.add(node.right);
            hashMap.put(root.data, root.data);

            int val = target- root.data;
            if (hashMap.get(val)!=null)
                return 1;

        }

return 0;
    }

//    boolean isValPresent(Node node,int val)
//    {
//        if (node==null)
//            return false;
//
//        if(node.data==val)
//        {
//            return true;
//        }
//
//        boolean isFound = isValPresent(node.left,val);
//        if (!isFound)
//            isFound = isValPresent(node.right,val);
//
//        return isFound;
//    }


    public int solve(int R,int C){
int i =0;

        for (int j=C;j>0;j--)
        {
            //if(get(i,j)==0)
            {
                i+=1;
            }
        }
    return 0;
    }

}

