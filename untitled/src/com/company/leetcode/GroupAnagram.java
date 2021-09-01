package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static void main(String args[])
    {
        String[] strs = {"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};
        List list = groupAnagrams(strs);
        System.out.print("");
    }

    static public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> groupAnagrams = new ArrayList<>();
        HashMap<HashMap<Character,Integer>,List<String>> hashMap = new HashMap<>();



        for (String item:strs)
        {
            HashMap<Character,Integer> hashNumber = getHashCode(item);
            List list = hashMap.get(hashNumber);
            if (list!=null)
            {
                list.add(item);
            }
            else
            {
                List<String> stringList = new ArrayList<>();
                stringList.add(item);
                groupAnagrams.add(stringList);
                hashMap.put(hashNumber,stringList);
            }
        }

        return groupAnagrams;
    }


    static HashMap<Character,Integer> getHashCode(String item)
    {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (char ch:item.toCharArray())
        {
           if(hashMap.get(ch)!=null)
           {
               hashMap.put(ch,hashMap.get(ch)+1);
           }
           else
           {
               hashMap.put(ch,1);
           }
        }
    return hashMap;
    }

}
