package com.company.leetcode;



public class ReverseInt {

    public static void main(String args[])
    {
     System.out.println(reverse(1534236469));;
    }

 static    public int reverse(int x) {

     int ans = 0;
     int sign = 1;
if (x<0)
{
sign = -1;
    x  = Math.abs(x);

}
     while (x>0)
     {
         int val = x%10;
         x = x/10;


         if(ans>Integer.MAX_VALUE/10||ans==Integer.MAX_VALUE&&val>7)
             return 0;

         if(ans<Integer.MIN_VALUE/10||ans==Integer.MIN_VALUE&&val<-8)
             return 0;

         ans = ans*10+val;
     }

     System.out.print(Integer.MAX_VALUE);
int val = Integer.MAX_VALUE/10;
     val = val*10;

     return ans*sign;
 }

}
