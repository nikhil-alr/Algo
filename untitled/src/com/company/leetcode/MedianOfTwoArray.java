package com.company.leetcode;

public class MedianOfTwoArray {

    public static void main(String args[])
    {
        int a[] = {1,2};
        int b[] = {3,4};
        System.out.println(findMedianSortedArrays(a,b));
    }

    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int num3[] = new int[nums1.length+ nums2.length];
        int nums1Counter = 0;
        int nums2Counter = 0;
        int nums3Counter = 0;
        double median = 0;

        while (nums1Counter<nums1.length&&nums2Counter<nums2.length)
        {
            if (nums1[nums1Counter]<nums2[nums2Counter])
            {
                num3[nums3Counter] = nums1[nums1Counter];
                nums1Counter+=1;
            }
            else
            {
                num3[nums3Counter] = nums2[nums2Counter];
                nums2Counter+=1;
            }
            nums3Counter+=1;
        }

        while (nums1Counter<nums1.length)
        {
            num3[nums3Counter] = nums1[nums1Counter];
            nums3Counter+=1;
            nums1Counter+=1;
        }

        while (nums2Counter<nums2.length)
        {
            num3[nums3Counter] = nums2[nums2Counter];
            nums3Counter+=1;
            nums2Counter+=1;
        }

        if (nums3Counter%2==0)
        {
            int val1 = num3[nums3Counter/2];
            int val2 = num3[(nums3Counter/2)-1];
            median = (val1+val2)/2.0;
        }
        else
        {
            int val1 = num3[nums3Counter/2];
            median = (val1);
        }

        return median;
    }

}
