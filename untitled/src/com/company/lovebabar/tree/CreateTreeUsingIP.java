package com.company.lovebabar.tree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;



public class CreateTreeUsingIP {
     static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

static int preOrderIndex = -1;
    public static void main(String args[])
    {
        int inOrder[] = { 10,1,30,40,20};
        int preOrder[] = {  1,10,20,30,40 };
        Node node = createTree(inOrder,preOrder);



        System.out.print("postOrder");
        postOrder(node);

    }


    static void postOrder(Node node)
    {
        if(node==null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data);
    }

    public static void createTreeUsingStack(int[] inOrder,int[]preOrder)
    {
        Stack<int[]> stack = new Stack<>();
        stack.push(inOrder);

        for (int i=0;i<preOrder.length;i++)
        {
            inOrder = stack.pop();


            if (inOrder[0]==preOrder[i]&&inOrder.length==1)
            {
                System.out.print(inOrder[0]);
                //System.out.println("Nikhil"+preOrder[i]);
                continue;
            }
            if (inOrder[0]!=preOrder[i]&&inOrder.length==1)
            {
                while(inOrder.length==1)
                {
                    System.out.print(inOrder[0]);
                    inOrder = stack.pop();
                }
            }

            for(int j=0;j<inOrder.length;j++)
            {
                if(preOrder[i]==inOrder[j])
                {
                    int array[] = {preOrder[i]};
                    stack.push(array);
                    int rightArray[] = Arrays.copyOfRange(inOrder,j+1,inOrder.length);
                    if (rightArray.length>0)
                        stack.push(rightArray);

                    int leftArray[] = Arrays.copyOfRange(inOrder,0,j);
                    if (leftArray.length>0)
                        stack.push(leftArray);
                    break;
                }
            }
        }

        while (!stack.isEmpty())
        {
            int array[] = stack.pop();
            System.out.print(array[0]);
        }
    }

    public static Node createTree(int[] inOrder,int[]preOrder)
    {
        preOrderIndex+=1;
        Node node = null;
        if(inOrder.length==1)
        {
            System.out.print(inOrder[0]);
            node = new Node(inOrder[0]);
            return node;
        }

        if(preOrderIndex>=preOrder.length)
            return null;

            for (int j=0;j< inOrder.length;j++)
            {
                if(inOrder[j]==preOrder[preOrderIndex])
                {
Node lNode = null;
Node rNode = null;
                    int leftArray[] = Arrays.copyOfRange(inOrder,0,j);
                    if (leftArray.length>0)
                    {
                        lNode = createTree(leftArray,preOrder);

                    }

                    int rightArray[] = Arrays.copyOfRange(inOrder,j+1,inOrder.length);
                    if (rightArray.length>0)
                    {
                        rNode = createTree(rightArray,preOrder);
                    }



                    node = new Node(inOrder[j]);
                    node.left = lNode;
                    node.right = rNode;
                    System.out.print(inOrder[j]);
                    break;
                }

            }
return node;
    }





}
