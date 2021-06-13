package com.company.adityavrma.dp;

public class BooleanPernthiez {

   static String bString = "T|T&F^T";

    public static void main(String args[])
    {
        System.out.print("BP");
        System.out.print(solveBP(0,bString.length()-1,true));
    }

    static int solveBP(int start,int end,boolean shouldTrue)
    {
        int count = 0;
       int tCount = 0;
       int fCount = 0;
       if (start==end)
       {
           if (shouldTrue&&bString.charAt(start)=='T')
           {
               
               return 1;
           }
           if (shouldTrue&&bString.charAt(start)=='F')
           {
               return 0;
           }
           if (!shouldTrue&&bString.charAt(start)=='T')
           {
               return 0;
           }
           if (!shouldTrue&&bString.charAt(start)=='F')
           {
               return 1;
           }
       }


        int tmp = 0;
       for (int i=start+1;i<end;i+=2)
       {


           int lt = solveBP(start,i-1,true);
           int lf = solveBP(start,i-1,false);
           int rt = solveBP(i+1,end,true);
           int rf = solveBP(i+1,end,false);



           switch (bString.charAt(i))
           {
               case '|':
                   if (shouldTrue)
                   {
tCount = tCount+lt*rt;
                   }
                   else
                   {
fCount = fCount+(lt*rf)+(lf*rt)+(lf*rf);
                   }

                   break;
               case '&':
                   if (shouldTrue)
                   {
                       tCount = tCount+(lt*rf)+(lf*rt)+(lt*rt);
                   }
                   else
                   {
                       fCount = fCount+lf*rf;
                   }
                   break;
               case '^':
                   if (shouldTrue)
                   {
                       tCount = tCount+(lt*rt)+(lf*rf);
                   }
                   else
                   {
                       fCount = fCount+(lf*rt)+(rf*lt);
                   }
                   break;
           }



       }

count = shouldTrue?tCount:fCount;
       return count;
    }

}
