package com.company.lovebabar.BST;

import com.company.adityavrma.dp.A;

import java.util.ArrayList;
import java.util.Arrays;

public class SortedArrayToBst {

    public static void main(String args[])
    {
        int nums[] = {-5,-2,-2,1,1,1,5,7};
        sortedArrayToBST(nums);
    }

    static public int[] sortedArrayToBST(int[] nums)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        convertToBallancedTree(nums,0, nums.length-1, list);
        for (int i=0;i<list.size();i++)
            nums[i] = list.get(i);

        return nums;
    }

    static void convertToBallancedTree(int[] nums,int start,int end, ArrayList<Integer> list)
    {
        if(start>end)
            return;
        if (start==end)
        {
            list.add(nums[start]);
            return;

        }
            int mid = (start+end)/2;
            list.add(nums[mid]);
            convertToBallancedTree(nums,start,mid-1,list);
            convertToBallancedTree(nums,mid+1,end,list);





        //convertToBallancedTree(nums,list);


    }

}
