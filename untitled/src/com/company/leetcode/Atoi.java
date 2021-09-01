package com.company.leetcode;

public class Atoi {

    public static void main(String args[])
    {
        System.out.print(myAtoi("4193 with words"));
    }

    static public int myAtoi(String s) {
int ans = 0;
int sign = 1;
boolean isSignTaken = false;
boolean shouldDiscardComputation = false;
s = s.trim();
for (int i=0;i<s.length();i++)
{
    char ch = s.charAt(i);
    if(ch>=48&&ch<=57)
    {
        shouldDiscardComputation = true;
        if(ans>Integer.MAX_VALUE/10||ans==Integer.MAX_VALUE&&Integer.valueOf(""+ch)>7)
            return Integer.MAX_VALUE;

        if(ans<Integer.MIN_VALUE/10||ans==Integer.MIN_VALUE&&Integer.valueOf(""+ch)<-8)
            return Integer.MIN_VALUE;

        ans = ans*10+(Integer.valueOf(""+ch)*sign);
    }
    else
    {
        if(shouldDiscardComputation)
            return 0;
        if(isSignTaken&&(ch=='-'||ch=='+'))
            return 0;

        if(ch=='-'&&ans==0)
        {
            sign = -1;
            isSignTaken = true;
            continue;
        }

        if(ch=='+'&&ans==0)
        {
            isSignTaken = true;
            sign = 1;
            continue;
        }



        break;
    }

}

return ans;
    }


}
