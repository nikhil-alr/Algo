package com.company.lovebabar.tree;
import com.company.lovebabar.tree.GenrateTreeUsingString.*;

public class BoundryView {

public static void main(String args[])
{
    Node node = GenrateTreeUsingString.genrateTree("12345678901234567");
    boundaryView(node);
}

static void boundaryView(Node node)
{
    System.out.print(node.data);
    leftView(node.left);
    bottomView(node);
    rightView(node.right);


}

static void leftView(Node node)
{
    if(node == null)
        return;
    if(node.left==null&&node.right==null)
        return;

    System.out.print(node.data);
    if(node.left!=null)
    {
        leftView(node.left);
    }
    else
    {
        leftView(node.right);
    }
}

static void bottomView(Node node)
{
    if(node==null)
        return;

    bottomView(node.left);
    bottomView(node.right);

    if(node.left==null&&node.right==null)
        System.out.print(node.data);
}

static void rightView(Node node)
{
    if(node==null)
        return;

    if(node.right!=null)
    rightView(node.right);
    else
        rightView(node.left);
    if(node.left==null&&node.right==null)
        return;
    System.out.print(node.data);
}

}



