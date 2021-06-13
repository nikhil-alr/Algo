package com.company.lovebabar.graph;

import java.util.Scanner;

 class Solution {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         int test = scanner.nextInt();

         while(test>0)
         {
             long totalHighFunNumber = 0;

             long l = scanner.nextInt();
             long r = scanner.nextInt();
             long max = l*r+l+r;

             //System.out.print(l);
             //System.out.print(r);

             long newL = l;
             long newR = l+1;
             long number = newL*newR+newL+newR;

             while(number<=max)
             {
                 if(number==Long.valueOf(newL+""+newR))
                 {
                     newL+=1;
                     totalHighFunNumber+=1;
                 }
                 else
                 {
                     long tmp = Long.valueOf(newL+""+newR)-number;
                     if(tmp+newR<=r)
                         newR = tmp+newR;
                     else
                         break;
                 }
                 long a = (newL*newR);
                 number = a+(newL+newR);
             }



             System.out.println(totalHighFunNumber);
             test-=1;


         }


         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     }
}
