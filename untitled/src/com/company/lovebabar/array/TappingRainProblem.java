package com.company.lovebabar.array;

import java.util.Scanner;

public class TappingRainProblem {

    public static void main(String args[])
    {
        System.out.print("TAPPING RAIN");
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();


        while (test>0)
        {
int n = scanner.nextInt();
int array[]=new int[n];
int totalCollectedWater = 0;
for (int i=0;i<n;i++)
{
    array[i] = scanner.nextInt();
}

int firstE = 0;
int lastE = 0;
          int i=0;
          int j=array.length-1;
          firstE = array[i];
          lastE = array[array.length-1];
//          while (i<j)
//          {
//              if(firstE<lastE)
//              {
//
//
//                  i+=1;
//                  int diff = firstE-array[i];
//                  if (diff>0)
//                  {
//                      totalCollectedWater+=diff;
//                  }
//                  else
//                  {
//                      firstE = array[i];
//                  }
//
//              }
//              else
//              {
//                  j-=1;
//
//                  int diff = lastE-array[j];
//                  if (diff>0)
//                  {
//                      totalCollectedWater+=diff;
//                  }
//                  else
//                  {
//                      lastE = array[j];
//                  }
//              }
//
//          }




                // initialize output
                int result = 0;

                // maximum element on left and right
                int left_max = 0, right_max = 0;

                // indices to traverse the array
                int lo = 0, hi = n - 1;

                while (lo <= hi) {
                    if (array[lo] < array[hi]) {
                        if (array[lo] > left_max)

                            // update max in left
                            left_max = array[lo];
                        else

                            // water on curr element =
                            // max - curr
                            result += left_max - array[lo];
                        lo++;
                    }
                    else {
                        if (array[hi] > right_max)

                            // update right maximum
                            right_max = array[hi];

                        else
                            result += right_max - array[hi];
                        hi--;
                    }
                }



          System.out.println(result);
            test-=1;
        }




    }
}
