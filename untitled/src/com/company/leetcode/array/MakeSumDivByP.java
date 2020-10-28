package com.company.leetcode.array;

public class MakeSumDivByP {

    public static void main(String args[])
    {
        System.out.print("MAKE SUM DIV BY P");
        int array[] = {26,19,11,14,18,4,7,1,30,23,19,8,10,6,26,3};
        int p = 26;
        System.out.print(makeSumDivByP(p,array));;

    }


    static int makeSumDivByP(int p,int array[])
    {
        long value = 0;

      value = getSum(array);
        if (value<p)
            return -1;

      value = value%p;



      if(value>0)
        value = isSubArrayPresent(array,value);

        return (int) value;
    }

    static long getSum(int array[])
    {
        long val = 0;
        for(int i=0;i<array.length;i++)
        {
            val+=array[i];
        }


        return val;

    }

    static int isSubArrayPresent(int array[],long val)
    {

int windowUpper = 0;
int windowDows = 0;
        int sum = 0;
        int counter = 0;

        for (int i=0;i<array.length;i++)
        {
            if(array[i]==val)
                return 1;
        }


        while(windowUpper>=windowDows)
        {

            if(sum==val)
                return windowUpper-windowDows;

            if (windowUpper<array.length)
            {
                sum += array[windowUpper];
                windowUpper+=1;

           // counter = windowUpper;
            }
            else
            {

                sum -= array[windowDows];
                windowDows+=1;


            }
        }


        return -1;
    }

}
