package com.company.lovebabar.tree;

import java.util.*;

import com.company.lovebabar.tree.GenrateTreeUsingString.*;

public class DiagonalTravsel {

   static HashMap<Integer, Queue<String>> hashMap = new HashMap<>();

    public static void main(String args[])
    {
ArrayList<Integer> list = new ArrayList();
list.addAll(list);
        Node node = GenrateTreeUsingString.genrateTree("12345678");
        travrseInOrder(node,0);
        for (Map.Entry<Integer, Queue<String>> entry: hashMap.entrySet())
        {
            //hashMap.put()
        }




    }


    static void travrseInOrder(Node node,int level)
    {
        if(node==null)
            return;

        Queue<String> q = hashMap.get(level);
        if (q==null)
        {
            Queue <String> queue = new LinkedList<>();
            q.add(""+node.data);
        }
        else
        {
            q.add(""+node.data);
        }
        hashMap.put(level,q);

        travrseInOrder(node.left,level+1);
        travrseInOrder(node.right,level);

    }



}
