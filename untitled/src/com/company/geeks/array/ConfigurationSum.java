package com.company.geeks.array;

public class ConfigurationSum {

    public static void main(String args[])
    {

        int maxSum=0;
        int array[] = {8,3,1,2};
        int rotationSum = 0;
        int arraySum = 0;

        for (int i=0;i<array.length;i++)
        {
            rotationSum+=array[i]*i;
        }
        maxSum = rotationSum;

        for (int i=0;i<array.length;i++)
        {
            arraySum+=array[i];
        }
        int configSum = 0;
        for (int i=1;i<=array.length;i++)
        {
            System.out.println(rotationSum);
            configSum = configurationSum(rotationSum,arraySum,i,array[i-1],array.length);
            rotationSum = configSum;
            if(configSum>maxSum)
    maxSum = configSum;
        }

        System.out.print(maxSum);

    }



    static int configurationSum(int rotationSum,int totalSum,int index,int indexItem,int length)
    {
        int configurationSum = 0;

        configurationSum = rotationSum-(totalSum-indexItem)+indexItem*(length-1);

    return configurationSum;
    }

}
