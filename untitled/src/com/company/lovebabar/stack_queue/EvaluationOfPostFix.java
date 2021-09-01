package com.company.lovebabar.stack_queue;

import java.util.Stack;

public class EvaluationOfPostFix {

    public static void main(String args[])
    {
System.out.print(evaluatePostFix("231*+9-"));
    }

    public static int evaluatePostFix(String S)
    {
       Stack<Integer> operandStack = new Stack<>();

       for (int i=0;i<S.length();i++)
       {
           char ch = S.charAt(i);
           switch (ch)
           {
               case '+':
                   int val2 = operandStack.pop();
                   int val1 = operandStack.pop();
                   operandStack.push(val1+val2);
                   break;
               case '-':
                   val2 = operandStack.pop();
                    val1 = operandStack.pop();
                   operandStack.push(val1-val2);

                   break;
               case '*':
                    val2 = operandStack.pop();
                    val1 = operandStack.pop();
                   operandStack.push(val1*val2);

                   break;
               case '/':
                    val2 = operandStack.pop();
                   val1 = operandStack.pop();
                   operandStack.push(val1/val2);

                   break;
               default:
                   operandStack.push(Integer.parseInt(""+ch));
           }
       }
    return operandStack.pop();
    }

}
