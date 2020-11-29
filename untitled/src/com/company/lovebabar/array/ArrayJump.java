package com.company.lovebabar.array;

public class ArrayJump {


    public static void main(String args[])
    {

        int array[]={1,4,3,2,6,7};
System.out.print(minJump(array));


    }

    public static int minJump(int array[])
    {
        int maximumReachabily = array[0];
        int totalJump=1;
        int step = array[0];


        for (int i=1;i< array.length;i++)
        {

            if (i== array.length-1)
                return totalJump;

            maximumReachabily = Math.max(maximumReachabily,array[i]+i);
            step-=1;

            if (step==0)
            {
               totalJump+=1;

                if (i >= maximumReachabily)
                    return -1;

                step = maximumReachabily-i;
            }

        }

    return -1;
    }

}
