package com.company.adityavrma.dp;

public class LCSubstring {
    static String a = "abcde";
    static String b="abfce";
    public static void main(String args[])
    {
        System.out.print("LCSUBSTRING");
System.out.print(lcsubstring(a.length(),b.length()));
    }


    static int lcsubstring(int index1,int index2)
    {
        int ans = 0;
        if(index1==0||index2==0)
        {
            return 0;
        }
        else
        {

            if (a.charAt(index1-1)==b.charAt(index2-1))
            
            {
                int val = 0;
if (index1==index2)
    val = 1;
ans = val+lcsubstring(index1-1,index2-1);
            }
            else
            {
                ans = Math.max(lcsubstring(index1-1,index2),lcsubstring(index1,index2-1));
            }
        }

        return ans;
    }


}
