package com.company.geeks.array;

import java.util.Stack;

public class TinyUrlProblem {
static final String BASE_STRING_62 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static void main(String args[])
    {

        base62UrlId(10000031101l);
    }

    //-----------------Stable Algo-------------------------
    public static String base62UrlId(long databaseId)
    {
        Stack<Integer> stack = new Stack<>();

String convertedString = "";

while (databaseId>0)
{
    int reminderValue = (int) databaseId%62;
    stack.push(reminderValue);
    databaseId = databaseId/62;

}

while (stack.size()>0)
    convertedString+=BASE_STRING_62.charAt(stack.pop());

System.out.print(convertedString);

return convertedString;
    }
    //-----------------Stable Algo-------------------------

}
