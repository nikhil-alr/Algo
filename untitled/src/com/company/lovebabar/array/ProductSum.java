package com.company.lovebabar.array;

import java.math.BigInteger;

public class ProductSum {

    public static void main(String args[])
    {
        int array[] = {90,91,-91,91,-91,-90,90,90,-90,-90};

        BigInteger max = new BigInteger("0");
        BigInteger localMax = new BigInteger("1");
        for(int i=0;i<array.length;i++)
        {


            if (localMax.longValue()==0)
            {
                localMax = new BigInteger(""+array[i]);
            }
            else
            {
                localMax=localMax.multiply(BigInteger.valueOf(array[i]));
            }
            if (max.longValue()<localMax.longValue())
                max=localMax;
        }
        

//        localMax = 1;
//        for(int i=array.length-1;i>=0;i--)
//        {
//            if (localMax==0)
//            {
//                localMax = array[i];
//            }
//            else
//            {
//                localMax=localMax*array[i];
//            }
//            if (max<localMax)
//                max=localMax;
//        }

        System.out.print("MAX");

    }

}
