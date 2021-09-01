package com.company.adityavrma.dp;

import java.util.Stack;

public class ExpressionEvaluation {


   static boolean isOperator(char ch)
    {
        switch (ch)
        {
            case '/':
            case '*':
            case '+':
            case '-':
                return true;
        }
        return false;
    }

    static int getOperatorPrecdnce(char operator)
    {
        int precednce = -1;
       switch (operator)
       {
           case '-':
               precednce = 0;
               break;
           case '+':
               precednce = 1;
               break;
           case '*':
               precednce = 2;
               break;
               case '/':
                   precednce = 3;
                   break;
           case '(':
               precednce = -1;
               break;
       }

       return precednce;
    }

    static String performOperation(String operandOne,String operandTwo,char operator)
    {

        double ans = 0;
        switch (operator)
        {
            case '+':
                ans = Double.valueOf(operandOne)+Double.valueOf(operandTwo);
                break;
            case '-':
                ans = Double.valueOf(operandOne)-Double.valueOf(operandTwo);
                break;
            case '*':
                ans = Double.valueOf(operandOne)*Double.valueOf(operandTwo);
                break;
            case '/':
                ans = Double.valueOf(operandOne)/Double.valueOf(operandTwo);
                break;
        }

        return ""+ans;
    }

    static int getOperand(int index,String expression,char operator,Stack<String> opreandStack )
    {
        double operand= 0;
        int counter;
        for (counter=index;counter<expression.length();counter++)
        {
            if (expression.charAt(counter)==' '||expression.charAt(counter)=='('||expression.charAt(counter)==')')
            {
                break;
            }
        }

        operand = Double.valueOf(operator+expression.substring(index,counter).trim());
        opreandStack.push(operator+expression.substring(index,counter).trim());
        return counter;
    }

    public static void main(String args[])
    {
        Stack<Character> operatorStack = new Stack<>();
        Stack<String> operandStack = new Stack<>();

        String experssion = "(2 / (2 + 3.33) * 4) - -6";

        for (int i=0;i<experssion.length();i++)
        {

            if (isOperator(experssion.charAt(i)))
            {
            char newOperator =     experssion.charAt(i);
                char topOperator = operatorStack.peek();

                while (getOperatorPrecdnce(topOperator)>getOperatorPrecdnce(newOperator))
                {
                    String operandOne = operandStack.pop();
                    String operandTwo = operandStack.pop();
                    String ans = performOperation(operandTwo,operandOne,topOperator);
                    operandStack.push(ans);
                    operatorStack.pop();
                    topOperator =  operatorStack.peek();
                }
                operatorStack.push(newOperator);

                continue;
            }

            switch (experssion.charAt(i))
            {
                case ' ':
                    continue;
                case '(':
                    operatorStack.push('(');
                    break;
                case ')':
                    while (true)
                    {
                        String operandOne = operandStack.pop();
                        String operandTwo = operandStack.pop();
                        char topOperator = operatorStack.pop();
                        String ans = performOperation(operandTwo,operandOne,topOperator);
                        operandStack.push(ans);
                        if (operatorStack.peek()=='(')
                        {
                            operatorStack.pop();
                            break;
                        }

                    }


                    break;
                default:
                    char operator = ' ';
                    if (i>0&&isOperator(experssion.charAt(i-1)))
                    {
                        operator = experssion.charAt(i-1);
                    }
                    i = getOperand(i,experssion,operator,operandStack)-1;
            }
        }



    }





}
