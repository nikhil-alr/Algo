package com.company.lovebabar.Strings;

import java.util.Collections;
import java.util.HashMap;


public class SecFreq {

    public static void main(String args[])
    {
        String arr[] = {"aaa","aaa", "aaa", "ccc", "ccc"};
secFrequent(arr,10);
    }
    static String secFrequent(String arr[], int N)
    {


        HashMap<String,Integer> hashMap = new HashMap<>();

        for (int i=0;i< arr.length;i++)
        {
            if (hashMap.get(arr[i])==null)
            {
                hashMap.put(arr[i],1);
            }
            else
            {
               hashMap.put(arr[i],1+hashMap.get(arr[i]));
            }
        }

        int pNumber =0;
        String pString = "";

        int sNumber = 0;
        String sString = "";

//        for (int i=1;i< arr.length;i++)
//        {
//            if (hashMap.get(arr[i])<pNumber)
//            {
//                 sNumber = hashMap.get(arr[i]);
//                 sString = arr[i];
//                break;
//            }
//            if(hashMap.get(arr[i])>pNumber)
//            { sNumber = pNumber;
//            sString = pString;
//            pNumber = hashMap.get(arr[i]);
//                pString = arr[i];
//                break;
//            }
//        }


        for (int i=0;i< arr.length;i++)
        {
            int newNum = hashMap.get(arr[i]);
           if(pNumber<newNum)
           {
               sNumber = pNumber;
               pNumber = newNum;
               sString = pString;
               pString = arr[i];
           }
           if (newNum<pNumber&&newNum>sNumber)
           {
              sNumber = newNum;
              sString = arr[i];
           }
        }

    return sString;
    }

}
