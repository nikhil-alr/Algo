package com.company.lovebabar.BST;

public class PreToPost {

    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[])
    {
       int arr[]  = {100,60,34,29,1034,459,453,415,341,203,200,153,192,327,292,252,300,335,331,389,413,449,432,454,675,635,622,492,563,555,503,679,803,799,798,721,702,889,875,841,885,887,1033,890,962,1025,1036,1085,1077,1039,1086};
        Node node = constructTree(arr, arr.length);
        System.out.print(node.data);
    }

    public static Node constructTree(int pre[], int size)
    {
       return buildTree(pre,0,size-1);
    }


    public static Node buildTree(int pre[],int start,int end)
    {
if(start>end)
    return null;

        if(start==end)
        {
            Node node = new Node(pre[start]);
return node;
        }

        Node node = new Node(pre[start]);
        int mid = end+1;
        for(int i=start+1;i<=end;i++)
        {
            if(pre[start]<pre[i])
            {
                mid = i;
                break;
            }
        }

        node.left = buildTree(pre,start+1,mid-1);
        node.right = buildTree(pre,
                mid,end);


        return node;

    }

}
