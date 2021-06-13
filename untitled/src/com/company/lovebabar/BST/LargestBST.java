package com.company.lovebabar.BST;

public class LargestBST {

    // Return the size of the largest sub-tree which is also a BST

    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }



    static class SubTreeInfo
    {
        int min = 0;
        int max = 0;
        boolean isSubtree = false;
        int subTreeCount = 0;

        public SubTreeInfo(int min, int max, boolean isSubtree, int subTreeCount) {
            this.min = min;
            this.max = max;
            this.isSubtree = isSubtree;
            this.subTreeCount = subTreeCount;
        }
    }

    static int largestBst(Node root)
    {

        SubTreeInfo subTreeInfo = getLargesBst(root);
        return subTreeInfo.subTreeCount;
    }

    static SubTreeInfo getLargesBst(Node node)
    {

        if(node==null)
            return new SubTreeInfo(0,0,true,0);

        SubTreeInfo leftSubtree = getLargesBst(node.left);
        SubTreeInfo rightSubTree = getLargesBst(node.right);

        if(!leftSubtree.isSubtree&&!rightSubTree.isSubtree)
        {
            int min = Math.min(leftSubtree.min, rightSubTree.min);
            int max = Math.max(leftSubtree.max, rightSubTree.max);
            return new SubTreeInfo(min,max,false,1);
        }

        if (!leftSubtree.isSubtree || !rightSubTree.isSubtree)
        {
            int min = Math.min(leftSubtree.min, rightSubTree.min);
            int max = Math.max(leftSubtree.max, rightSubTree.max);
            int subTreeCount = Math.max(leftSubtree.subTreeCount, rightSubTree.subTreeCount);
            return new SubTreeInfo(min,max,false,subTreeCount);
        }

        SubTreeInfo subtreeInfo = null;
        int max = leftSubtree.max;
        int min = rightSubTree.min;
        int subTreeCount = 0;

        if(node.left==null&&node.right==null)
        {
return new SubTreeInfo(node.data, node.data, true,1);
        }
        else
        {
            if(node.data>max&&node.data<min)
            {


                min = Math.min(node.data,Math.min(rightSubTree.min,leftSubtree.min));
                max = Math.max(node.data,Math.min(rightSubTree.max,leftSubtree.max));
                subTreeCount = 1+leftSubtree.subTreeCount+rightSubTree.subTreeCount;
                subtreeInfo = new SubTreeInfo(min,max,true,subTreeCount);

            }
            else
            {
                min = Math.min(leftSubtree.min, rightSubTree.min);
                max = Math.max(leftSubtree.max, rightSubTree.max);

                subTreeCount = Math.max(leftSubtree.subTreeCount, rightSubTree.subTreeCount);
                subtreeInfo = new SubTreeInfo(min,max,false,subTreeCount);
            }
        }



        return subtreeInfo;



    }

}
