package com.company.lovebabar.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TreeDuplicate {
    static HashMap<String, Integer> hashMap = new HashMap<>();
    static List<String> list = new ArrayList<String>();


    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[])
    {
       //inOrderTravrse(node,fals);
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node.left = node2;
        node.right = node3;
        Node node4 = new Node(4);
        node2.left = node4;
        Node node5 = new Node(2);
        Node node6 = new Node(4);
        node3.left = node5;
        node3.right = node6;
        Node node7 = new Node(4);
        node5.left = node7;
List<String> list = new ArrayList<>();
        inOrderTravrse(node);

        System.out.print(list);

    }


    public static String inOrderTravrse(Node node)
    {
if(node==null)
{
    return "";
}

String leftString = inOrderTravrse(node.left);
String rightString = inOrderTravrse(node.right);
String key = node.data+leftString+rightString;

Integer dupliateSubtree = hashMap.get(key);
if(dupliateSubtree==null)
{
    hashMap.put(key,1);
    hashMap.clear();
    list.clear();
}
else
{
    list.add(key);
}

return key;
    }



}
