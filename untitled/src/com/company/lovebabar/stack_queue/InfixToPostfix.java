package com.company.lovebabar.stack_queue;

import java.util.Stack;

public class InfixToPostfix {

    public static void main(String args[])
    {
        System.out.print(infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
    }

    public static String infixToPostfix(String exp)
    {
        Stack<Character> operatorStack = new Stack<>();
        String postFixExpression = "";

        for (int i=0;i<exp.length();i++)
        {
            char ch = exp.charAt(i);
            switch (ch)
            {
                case '+':
                case '-':
                case '^':
                case '*':
                case '/':
                    if(!operatorStack.isEmpty())
                    {
                        char exsistedOperator = operatorStack.peek();
                        while (getPrecedenc(ch)<= getPrecedenc(exsistedOperator))
                        {
                            postFixExpression+=exsistedOperator;
                            operatorStack.pop();
                            if(operatorStack.isEmpty())
                                break;
                            exsistedOperator = operatorStack.peek();
                            if(exsistedOperator=='(')
                                break;
                        }
                    }
                    operatorStack.push(ch);
                    break;
                case'(':
                    operatorStack.push(ch);
                    break;
                case ')':
                    char operands = operatorStack.pop();
                    while (operands!='(')
                    {
                        postFixExpression+=operands;
                        operands = operatorStack.pop();
                    }
                    break;
                default:
postFixExpression+=ch;
            }
        }
        while (!operatorStack.isEmpty())
        {
            postFixExpression+=operatorStack.pop();
        }
       return postFixExpression;
    }

    static int getPrecedenc(char operator)
    {int precednce  = -1;
        switch (operator)
        {
            case '^':
                precednce = 3;
                break;
            case '*':
            case '/':
                precednce = 2;
        break;
            case '+':
            case '-':
                precednce = 1;
                break;
        }
    return precednce;
    }
}
