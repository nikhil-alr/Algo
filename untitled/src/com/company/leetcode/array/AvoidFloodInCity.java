package com.company.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AvoidFloodInCity {


    public static void main(String args[])
    {
        System.out.print("AVOID FLOOD IN CITY");
    int rainyDayArry[] = {69,0,0,0,69};

    int array[] = avoidFloodInCity(rainyDayArry);


    for (int i=0;i< array.length;i++)
    {
        System.out.print(array[i]+",");
    }

    }



    //---- Stable ALgo -----
    static int[] avoidFloodInCity(int rainyDayArray[])
    {
        List<Integer> dryDay = new ArrayList<>();

        int ansArray[] = prepareAnsArray(rainyDayArray);

        boolean isFloodArived = tryToAvoidFloodInLake(rainyDayArray,ansArray,dryDay);

        if(isFloodArived)
        {
            ansArray = new int[0];

        }
        else
        {
            if(dryDay.size()>0)
            dryExsisitingLake(rainyDayArray,dryDay,ansArray);
        }

        return ansArray;
    }

    static int[] prepareAnsArray(int rainyDayArray[])
    {
        int array[] = new int[rainyDayArray.length];



        for (int i=0;i<rainyDayArray.length;i++)
        {
            array[i] = -1;
        }

        return array;
    }

    static boolean tryToAvoidFloodInLake(int[] rainyDayArray,int[] ansArray,List<Integer> dryDay)
    {
        boolean isFloodArived = false;
        HashMap<Integer,Integer> map = new HashMap();
        int totalRainyDay = 0;



        for (int i=0;i<rainyDayArray.length;i++)
        {


            if (map.get(rainyDayArray[i])!=null)
            {

//                if (dryDay.size()==0)
//                {
//                    isFloodArived = true;
//                    break;
//                }

                isFloodArived = true;
                for (int j=0;j<dryDay.size();j++)
                {
                    if(map.get(rainyDayArray[i])<dryDay.get(j))
                    {
                        ansArray[dryDay.get(j)] = rainyDayArray[i];
                        dryDay.remove(j);
                        isFloodArived = false;
                        break;
                    }
                }
                if (isFloodArived)
                    return isFloodArived;



            }

            if (rainyDayArray[i]>0)
            {
                map.put(rainyDayArray[i],i);
                totalRainyDay+=1;
            }
            else
                dryDay.add(i);
            }



        return isFloodArived;
    }

    static void dryExsisitingLake(int[] rainyDay,List<Integer> dryDay,int[] ansArray)
    {
        int filledLakeVal = 0;
        for (int i=0;i< ansArray.length;i++)
        {
            if (ansArray[i]>0)
            {
                filledLakeVal = i;
break;
            }
        }

        if(filledLakeVal==0)
        {
            for (int i=0;i< rainyDay.length;i++)
            {
                if (rainyDay[i]>0)
                {
                    filledLakeVal = rainyDay[i];
                    break;
                }
            }
        }


        for (int i=0;i<dryDay.size();i++)
        {
            ansArray[dryDay.get(i)] = filledLakeVal;
        }
    }

    //---- Stable ALgo -----
}
