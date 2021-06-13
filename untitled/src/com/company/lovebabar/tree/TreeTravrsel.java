package com.company.lovebabar.tree;
import com.company.lovebabar.tree.GenrateTreeUsingString.*;

import java.util.Stack;

public class TreeTravrsel {

    public static void main(String args[])
    {
        Node node= GenrateTreeUsingString.genrateTree("12345678");
        //iInorderTreeTravrse(node);
        //iPreorderTreeTravrse(node);
        iPostorderTreeTravrse(node);

    }

    //              1,
//              2,3,
//              4,5,6,7
//              8
    static void iInorderTreeTravrse(Node node)
    {
        Stack<Node> stack = new Stack<>();
        stack.add(node);
        while (!stack.isEmpty())
        {
            Node tmpNode = stack.pop();
            if(tmpNode.left==null){
                System.out.print(tmpNode.data);
                if(tmpNode.right!=null)
                stack.push(tmpNode.right);
            }
            else
            {
                Node leftNode = tmpNode.left;
                tmpNode.left = null;
                stack.push(tmpNode);
                stack.push(leftNode);
            }

        }


    }

   static void iPreorderTreeTravrse(Node node)
    {
Stack<Node> stack = new Stack<>();
stack.add(node);
while (!stack.isEmpty())
{
    Node tmpNode= stack.pop();
    System.out.print(tmpNode.data);
    if(tmpNode.right!=null)
       stack.push(tmpNode.right);
       if (tmpNode.left!=null)
           stack.push(tmpNode.left);
}
    }

    static void iPostorderTreeTravrse(Node node)
    {
Stack<Node> stack = new Stack<>();
stack.push(node);

while (!stack.isEmpty())
{
    Node tmpNode = stack.pop();
    if(tmpNode.left==null&&tmpNode.right==null)
    {
        System.out.print(tmpNode.data);
    }
    else
    {
        Node lNode = tmpNode.left;
        Node rNode = tmpNode.right;
        tmpNode.left = null;
        tmpNode.right = null;
        stack.push(tmpNode);
        if (rNode!=null)
            stack.push(rNode);

        if (lNode!=null)
            stack.push(lNode);

    }
}
    }

}
