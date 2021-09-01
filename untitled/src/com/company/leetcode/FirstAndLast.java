package com.company.leetcode;

public class FirstAndLast {

    public static void main(String args[])
    {
int array[] = {1};
int nums[] = searchRange(array,1);

    System.out.print("");
    }


    static public int[] searchRange(int[] nums, int target) {

        int ans[] = {-1,-1};

        if (nums.length==0)
            return ans;


        int targetIndex =  binarySearch(nums,0,nums.length-1,target);

        if (targetIndex!=-1)
        {
            ans[0] = targetIndex;
            ans[1] = targetIndex;

            int end = targetIndex-1;
            while (true)
            {
                int tmpStart = binarySearch(nums,0,end,target);
                if (tmpStart==-1||tmpStart==ans[0])
                    break;
                end = tmpStart-1;
                ans[0] = tmpStart;
            }

            int start = targetIndex+1;
            while (true)
            {
                int tmpEnd = binarySearch(nums,start,nums.length-1,target);
                if (tmpEnd==-1||tmpEnd==ans[1])
                    break;
                start = tmpEnd+1;
                ans[1] = tmpEnd;
            }


        }

        return ans;
    }



    static int binarySearch(int nums[],int start,int end,int target)
    {
        if (start>end)
        {
            return -1;
        }

        int mid = start+((end-start)/2);

        if (nums[mid] == target)
        {
        return mid;
        }

        if (start>=end)
        {
            return -1;
        }

        if (nums[mid]<target)
        {
            return binarySearch(nums,mid+1,end,target);
        }
        else
        {
            return binarySearch(nums,start,mid-1,target);

        }

    }

}
