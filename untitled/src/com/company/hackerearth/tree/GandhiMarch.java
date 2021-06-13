package com.company.hackerearth.tree;

import com.company.hackerrank.tree.HufmanCoding;

public class GandhiMarch {

    static class Node{
        public  char data;
        Node left, right;

    }

    public static void main(String args[])
    {
        String string = "a(c(f(.h(..))b(g(..).))e(.d(..)))";
Node node = generateTree(string);
    System.out.print("");
    }


    static Node generateTree(String string)
    {
        Node node = new Node();
        node.data = string.charAt(0);
        int startingCounter = 2;
        int stringCounter = startingCounter+1;
        int paarnthsisCount = -1;
        boolean isLeftChildFilled = false;
        while (stringCounter<string.length()-1)
        {

            if(string.charAt(stringCounter)=='.')
            {
isLeftChildFilled = true;
continue;
            }

            if(string.charAt(startingCounter)=='(')
            {
paarnthsisCount+=1;
            }
            if (string.charAt(startingCounter)==')')
            {
paarnthsisCount-=1;
            }

            if(paarnthsisCount==0)
            {
                if(isLeftChildFilled)
                {
                    node.right = generateTree(string.substring(startingCounter,stringCounter));

                }
                else
                {
                    node.left = generateTree(string.substring(startingCounter,stringCounter));
                    isLeftChildFilled = true;
                    startingCounter = stringCounter+1;
                }
            }


                stringCounter+=1;

        }

        return node;
    }


}
