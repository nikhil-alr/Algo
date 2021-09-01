package com.company.leetcode;

import java.util.Stack;

public class ValidPanthsis {

    public static void main(String args[])
    {
System.out.print(isValid("){"));
    }

    static public boolean isValid(String s) {

        if (s.length()==1)
            return false;

        boolean isValid = true;
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray())
        {
            if (ch=='('||ch=='{'||ch=='[')
            {
                stack.add(ch);
            }
            else
            {
                if (stack.size()==0)
                    return false;
               char lastChar =  stack.pop();
                switch (ch)
                {
                    case ')':
                        if (lastChar!='(')
                            return false;
                        break;
                    case '}':
                        if (lastChar!='{')
                            return false;
                        break;
                    case ']':
                        if (lastChar!='[')
                            return false;
                        break;
                }


            }
        }

        if (isValid&&stack.size()!=0)
            return false;

        return isValid;
    }

}
