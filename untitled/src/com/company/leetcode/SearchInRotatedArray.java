package com.company.leetcode;

public class SearchInRotatedArray {

    public static void main(String args[])
    {


        //int array[] = {3,4,5,6,7,0,1,2};
        int array[] = {6,7,1,2,3,4,5};
        System.out.print(search(array,6));
//System.out.print(getPivot(array,0, array.length-1));

    }


    static int getPivot(int array[],int start,int end)
    {
        int pivot = -1;

        int mid = start+((end-start)/2);

        if (mid+1<array.length&&array[mid]>array[mid+1])
        {
          return mid;
        }

        if (mid-1>=0&&array[mid]<array[mid-1])
        {
            return mid-1;
        }

        if (start>=mid)
            return -1;


        if (array[start]<array[mid])
        {
            return getPivot(array,mid+1,end);
        }
        else
        {
            return getPivot(array,start,mid-1);
        }

    }

    static public int search(int[] nums, int target) {

        int ans = -1;
        int start = -1;
        int end = -1;

//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] > nums[i + 1]) {
//                start = i;
//                end = i + 1;
//                break;
//            }
//        }


        start = getPivot(nums,0,nums.length-1);

        end = start+1;

        if(start==-1||end==-1)
            return  binarySearch(nums,0,nums.length-1,target);;


        if (nums[0]<= target&&target <= nums[start])
        {
            //search Here
            return binarySearch(nums,0,start,target);
        }
        else
        {
            return binarySearch(nums,end,nums.length-1,target);
        }



    }


    static int binarySearch(int num[],int start,int end,int target)
    {
        int ans = -1;

        int mid = (start+((end-start))/2);

        if (num[mid]==target)
        {
            return mid;
        }

        if (start>=end)
            return -1;

        if(num[mid]<target)
        {
           ans = binarySearch(num,mid+1,end,target);
        }
        else
        {
            ans = binarySearch(num,start,mid-1,target);
        }

        return ans;
    }
}
