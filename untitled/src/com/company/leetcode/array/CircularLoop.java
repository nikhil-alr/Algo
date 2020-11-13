package com.company.leetcode.array;

import java.util.Arrays;

public class CircularLoop {

   public static void main(String args[])
   {

       int array[] = {3,2,1};
       int arrayVal[] = {3,2,1};
       //System.out.print(isCylePresent(array));
       if (Arrays.equals(arrayVal,array))
           System.out.println("TRUE"); ;


       System.out.println(circularArrayLoop(array)); ;

   }


    static public int [] arr = null;
    static boolean circularArrayLoop(int[] nums) {
        arr = nums;
        int i =0;
        {
            if(aux(i,arr[i],arr[i]>0)){
                return true;
            }
        }


        return false;
}

    static boolean aux(int j, int temp, boolean dir){
        int k = (j + temp%arr.length + arr.length)%arr.length;
        int abs = Math.abs(arr[k]);
        // check for visited
        if(abs>1000){
            // verify if we havent reached the same vertex and direction of checking and the direction that we previously took is the same
            if(j!=k && !(dir^arr[k]>0) && abs==1003){
                return true;
            }else{
                return false;
            }
        }else{
            // we need to check if we proceeding the same direction as the value in the current index.
            if(!(dir^arr[k]>0)){
                temp = arr[k];
                // marking our current index under consideration , with the - or + sign indicating the direction we are taking from this index based on the value, as we dont need the value in further examinations.
                arr[k] = arr[k]>0?1003:-1003;
                if(aux(k, temp,dir)){
                    return true;
                }else{
                    arr[k] = 1001;
                    return false;
                }
            }
            else{
                return false;
            }

        }
    }
}


//   public static boolean isCylePresent(int array[]) {
//
//
//       int tmpArray[] = array.clone();
//       int index = 0;
//       int lastIndex = index;
//
//       while (array[index]<=1000)
//       {
//           lastIndex = index;
//           int newindex = lastIndex+array[index];
//           array[index] = 1001;
//index = newindex;
//           if(index>array.length-1)
//           {
//               index = index%array.length;
//           }
//
//           if(index<0)
//           {
//               index = array.length-Math.abs(index);
//           }
//
//       }
//
//       boolean lastDirection = tmpArray[lastIndex]>0?true:false;
//       boolean newDirection = tmpArray[index]>0?true:false;
//       if(lastIndex!=index&&lastDirection==newDirection)
//           return true;
//
//
//       return false;
//
//   }






