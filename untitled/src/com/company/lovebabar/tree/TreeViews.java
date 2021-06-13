package com.company.lovebabar.tree;

import java.util.*;
import com.company.lovebabar.tree.GenrateTreeUsingString.*;

public class TreeViews {
   static ArrayList<String> arrayList = new ArrayList<>();
    static HashMap<Integer,Character> topViewMap = new HashMap<>();
    static HashMap<Character,Integer> heightMap = new HashMap<>();
    static HashMap<Integer,Character> hashMap = new HashMap<>();

    public static void main(String args[])
    {

        Node node = GenrateTreeUsingString.genrateTree("123");
        //topView(node,0);

        //System.out.print(getBottomView(node,0));
Set<Integer> set = new HashSet<>();
set.add(1);
set.add(2);
set.add(1);
System.out.print(set);
//boundaryView(node);

    }


    static void leftView(Node node)
    {

        boolean isFirstNodeTaken = false;
        Queue<Node> mq = new LinkedList<>();
        Queue<Node> sq = new LinkedList<>();

        mq.add(node);

        while (true)
        {
            if (!mq.isEmpty())
            {
                if (!isFirstNodeTaken)
                {

                    isFirstNodeTaken = true;
                }
                Node tmpNode = mq.poll();
                if(tmpNode.left!=null);
                sq.add(tmpNode.left);

                if(tmpNode.right!=null);
                sq.add(tmpNode.right);

            }
            else
            {
                if(sq.isEmpty())
                    break;
                isFirstNodeTaken = false;
                mq = new LinkedList<>(sq);
            }
        }

    }

    static class Pair
    {
        int distance;
        Node node;

        Pair(int distance,Node node)
        {
            this.distance = distance;
            this.node = node;
        }
    }

    static ArrayList<Character>  getBottomView(Node root,int level)
    {

        ArrayList<Character> ansList = new ArrayList<Character>();
        Queue<Pair> q = new LinkedList<Pair>();

        Pair pair = new Pair(level,root);

        q.add(pair);
        while(!q.isEmpty())
        {
            Pair tmpNode =  q.poll();
            hashMap.put(tmpNode.distance,tmpNode.node.data);
            if(tmpNode.node.left!=null)
            {
                Pair newPair = new Pair(tmpNode.distance-1,tmpNode.node.left);
                q.add(newPair);
            }

            if(tmpNode.node.right!=null)
            {
                Pair newPair = new Pair(tmpNode.distance+1,tmpNode.node.right);
                q.add(newPair);
            }

        }

        TreeSet<Integer> treeSet = new TreeSet<>(hashMap.keySet());
        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext())
        {
            ansList.add(hashMap.get(iterator.next()));
        }
        return ansList;
    }
    static void  bottomView(Node node,int level)
    {

    }

    static void topView(Node node,int level)
    {
Stack<Node> stack = new Stack<>();
        inOrder(node,0);
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty())
        {
            Node tmpNode = queue.poll();
            int key = heightMap.get(tmpNode.data);
            if(topViewMap.get(key)==null)
            {
                //System.out.print(node.data);

                //ansList.add(tmpNode.data);
                topViewMap.put(key,tmpNode.data);
            }
            stack.push(tmpNode);
            if (tmpNode.right!=null)
                queue.add(tmpNode.right);
            if(tmpNode.left!=null)
                queue.add(tmpNode.left);

        }


        TreeSet<Integer> itt = new TreeSet<>(topViewMap.keySet());
        while (itt.iterator().hasNext())
        {
            System.out.print(itt.iterator().next());;
        }

    }

    static void inOrder(Node node,int level)
    {
        if(node==null)
        {
            return;
        }
        heightMap.put(node.data,level);
        inOrder(node.left,level-1);
        inOrder(node.right,level+1);


    }



    static void boundaryView(Node node)
    {


        Set<Character> boundaryView = new HashSet<>();
        getLeftView(node,boundaryView);
        getRightView(node,boundaryView);


        System.out.print(boundaryView);
    }

    static void getLeftView(Node node,Set<Character> boundaryView)
    {
        boolean isFirsItemPick = false;
Queue<Node> mQ = new LinkedList<>();
Queue<Node> sQ = new LinkedList<>();
mQ.add(node);
//sQ.add(node);
while (true)
{

    if (!mQ.isEmpty())
    {
        node = mQ.poll();
        if(!isFirsItemPick)
        {
            boundaryView.add(node.data);
            isFirsItemPick = true;
        }
        if (node.left!=null)
            sQ.add(node.left);
        if (node.right!=null)
            sQ.add(node.right);
    }
    else
    {
        isFirsItemPick = false;
        if (sQ.isEmpty())
            break;
        mQ = new LinkedList<>(sQ);
        sQ.clear();
    }



}

    }

    static void getRightView(Node node,Set<Character> boundaryView)
    {
        Queue<Node> mQ = new LinkedList<>();
        Queue<Node> sQ = new LinkedList<>();
        mQ.add(node);
        //sQ.add(node);
        while (true)
        {

            if (!mQ.isEmpty())
            {
                node = mQ.poll();
                if(mQ.isEmpty())
                {
                    boundaryView.add(node.data);
                }
                if (node.left!=null)
                    sQ.add(node.left);
                if (node.right!=null)
                    sQ.add(node.right);
            }
            else
            {
                if (sQ.isEmpty())
                    break;
                mQ = new LinkedList<>(sQ);
                sQ.clear();
            }



        }
    }





}
