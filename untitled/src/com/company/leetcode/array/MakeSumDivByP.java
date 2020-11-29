package com.company.leetcode.array;

public class MakeSumDivByP {

    public static void main(String args[])
    {

        int array[] = {3,6,8,1};
        int p = 8;
        int min = Integer.MAX_VALUE;
        System.out.println(isSubArraySumPresent(p,array));


    }


    static int isSubArraySumPresent(int p,int array[])
    {

        long totalSum = getTotalSum(array);
        long divVal = totalSum/p;

        while (divVal>0)
        {
            long divider = p*divVal;

            if(totalSum<(divider))
                return -1;

            int subArraySum = (int)(totalSum-divider);

            if (subArraySum==0)
                return 0;

            //Subarray Sum for one value
            for (int item : array)
            {
                if (subArraySum==item)
                    return 1;

            }
            boolean isAvailable = false;
            int minLen = array.length;
            int dif = 0;
            int totalDiff[] = {0,0};
            while (true){
                totalDiff = isSumPrenset(array,subArraySum,totalDiff[0]);
                dif = (totalDiff[1]-totalDiff[0])+1;
                if(totalDiff[0]>=0)
                {
                    //System.out.print("Not matched");
                    isAvailable = true;
                    totalDiff[0]+=1;

                    if (minLen>dif)
                        minLen = dif;
                    
                }
                else
                {
                    isAvailable = false;
                    break;
                }

            }
            if (isAvailable)
                return minLen;

            //Subarray sum for subarray
//            for (int item : array)
//            {
//                if (subArraySum==item)
//                    return true;
//
//            }



            divVal-=1;
        }



        return -1;
    }

    static long getTotalSum(int array[])
    {
        long totalSum = 0;
        for (long item : array)
        {
            totalSum+=item;
        }
    return totalSum;
    }

    static int[] isSumPrenset(int array[],int sum,int startFrom)
    {
        int diff[] = {-1,-1};
        int left = startFrom;
        int right = startFrom;
        int totalSum = 0;
        while (true)
        {
           if(totalSum<sum)
           {
               if(right>=array.length)
                   break;
               totalSum = totalSum+array[right];
               right+=1;
               continue;
           }
           if(totalSum>sum)
           {
               totalSum=totalSum-array[left];
               left=left+1;
               continue;
           }
           if(totalSum==sum)
           {
               diff[0] = left;
               diff[1] =  (right-1);
               //System.out.print("Match");
               break;
           }



        }
return diff;
    }

}
