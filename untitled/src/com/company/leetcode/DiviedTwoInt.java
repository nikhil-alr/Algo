package com.company.leetcode;

public class DiviedTwoInt {

    public static void main(String args[])
    {
System.out.print(divide(-2147483648,-1));

        int a = -2147483648/10;
        int B = -2147483648%10;


        //System.out.print(a);
    }

    static public int divide(int dividend, int divisor) {
int ans = 0;
int sign = 1;

        if (divisor<0&&dividend<0||divisor>=0&&dividend>=0)
        {
            sign = 1;
        }

        else
        {
            sign = -1;
        }



        if (Math.abs(dividend)<Integer.MAX_VALUE/10||Math.abs(dividend)==Integer.MAX_VALUE/10&&Math.abs(dividend)<=Math.abs(Integer.MAX_VALUE%10))
        {
            dividend = Math.abs(dividend);

        }
        else
        {
           return Integer.MAX_VALUE;
        }

        divisor = Math.abs(divisor);





while (dividend>=divisor)
{
    dividend = dividend-divisor;
    ans+=1;
}

return ans*sign;
    }
}
