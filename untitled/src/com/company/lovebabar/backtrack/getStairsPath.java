package com.company.lovebabar.backtrack;

import java.util.ArrayList;

public class getStairsPath {

    public static void main(String args[])
    {
        dp = new int[4];
        System.out.print(getAllStepCount(3));;
        System.out.print(getAllStairsPath(3));;


    }
    static int dp[];

    static ArrayList<String> getAllStairsPath(int remainingStep)
    {
        ArrayList<String> allPaths = new ArrayList<>();



        if (remainingStep==0)
        {
            return new ArrayList<String>();
        }

        for (int i=1;i<=remainingStep;i++)
        {
           ArrayList<String> subPaths =  getAllStairsPath(remainingStep-i);
           if (subPaths.size()==0)
           {
               allPaths.add(""+i);
               continue;
           }
           for (String subPath:subPaths)
           allPaths.add(i+subPath);
        }
return allPaths;
    }

    static int getAllStepCount(int remainStep)
    {
    int allSteps = 0;

        if (dp[remainStep]>0)
            return dp[remainStep];

    if(remainStep==0)
        return 1;

    for (int i=1;i<=remainStep;i++)
    {
        allSteps = allSteps+getAllStepCount(remainStep-i);
    }


    return dp[remainStep] = allSteps;
    }


}
