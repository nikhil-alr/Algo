package com.company.lovebabar.Strings;

import java.util.Stack;

public class CountReversals {

    public static void main(String args[])
    {
countRev("{{}{{{}{{}}{{");
    }

static     int countRev (String s)
    {

        s = removeCorrectPair(s);
        String newString = "";
        for (int i=0;i<s.length();i++)
        {

            if (s.charAt(i)=='}')
            {
                newString+='{';
            }
            else
            {
                newString+=s.charAt(i);
            }

        }
        s = removeCorrectPair(newString);
        for (int i=s.length();i>=0;i--)
        {
            if (s.charAt(i)=='{')
            {

            }
            else
            {

            }

        }


        return  0;
    }


    static String removeCorrectPair(String s)
    {
        Stack<Character> ostack = new Stack<>();

        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='{')
            {
                ostack.push(s.charAt(i));
            }
            else
            {
                if (ostack.size()>0&&ostack.peek()=='{')
                {
                    ostack.pop();
                }
                else
                {
                    ostack.push(s.charAt(i));
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (!ostack.isEmpty())
            stringBuilder.append(ostack.pop());

        return new String(stringBuilder);
    }

}


