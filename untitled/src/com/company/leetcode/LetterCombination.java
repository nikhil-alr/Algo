package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LetterCombination {

    public static void main(String args[])
    {
System.out.print(letterCombinations("2"));
    }

    static HashMap<String,String> hashMap = new HashMap<>();


    static public List<String> letterCombinations(String digits) {

        if (digits.equals(""))
            return new ArrayList<>();
        hashMap.put("2","abc");
        hashMap.put("3","def");
        hashMap.put("4","ghi");
        hashMap.put("5","jkl");
        hashMap.put("6","mno");
        hashMap.put("7","pqrs");
        hashMap.put("8","tuv");
        hashMap.put("9","wxyz");
     return getAllCombinations(digits);
    }

    static public List<String> getAllCombinations(String digits) {

        List<String>ans = new LinkedList<>();
        if (digits.equals(""))
        {
            return null;
        }


String keyPadVal = hashMap.get(""+digits.charAt(0));

        for (int i=0;i<keyPadVal.length();i++)
        {
            List<String> list = getAllCombinations(digits.substring(1));
            if (list==null)
            {
                ans.add(""+keyPadVal.charAt(i));
            }
            else
            {
                for (int index=0;index<list.size();index++)
                {
                    ans.add(""+keyPadVal.charAt(i)+list.get(index));
                }

            }
        }

        return ans;
    }



}
