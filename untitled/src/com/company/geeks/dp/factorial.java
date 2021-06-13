package com.company.geeks.dp;

public class factorial {
    static int table[];
    public static void main(String args[])
    {

        int n = 5;
        table = new int[n+1];
        table[0] = 0;
        int ans = 0;
//        for (int i=1;i<=n;i++)
//        {
//            ans = factorialUsingTabulation(i,table);
//
//        }

        //ans = factorialUsingMemonization(n);

        //ans = fibUsingMemo(n);
        table[1] = 0;
        table[2] = 1;

        for (int i=3;i<=n;i++)
        {
            table[i] = table[i-1]+table[i-2];
        }
        ans = table[n];



        System.out.print(ans);
    }




    static public int fibUsingMemo(int n)
    {
int fibNumber = 0;

if (n<=1)
    return 0;

if (n==2)
    return 1;

if (table[n]>0)
    return table[n];

        int ans1 =  fibUsingMemo(n-1);
        int ans2 = fibUsingMemo(n-2);

        fibNumber = ans1+ans2;
return fibNumber;
    }

    static public int factorialUsingTabulation(int n,int table[])
    {
        int fact = 1;

        fact = table[n] = table[n-1]*n;

        return fact;
    }

//    static public int factorialUsingMemonization(int n)
//    {
//       int ans = 1;
//
//       if (n==0)
//           return ans;
//
//       if (table[n]>0)
//       {
//           System.out.print("dp");
//       }
//
//        table[n] = ans = factorialUsingMemonization(n-1);
//       ans = n*ans;
//
//        return ans;
//    }


}
