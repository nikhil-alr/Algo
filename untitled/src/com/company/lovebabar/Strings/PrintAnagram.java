package com.company.lovebabar.Strings;

import java.util.*;

public class PrintAnagram {

    public static void main(String args[])
    {
        String words[] = {"act","god","cat","dog","tac"};
        List<List<String>> ans = Anagrams(words);
         System.out.print("");
    }

    static public List<List<String>> Anagrams(String[] string_list) {

        HashMap<Character,Character>[] hashMaps= new HashMap[string_list.length];
        boolean processedString[] = new boolean[string_list.length];
        for (int i=0;i< string_list.length;i++)
        {
            hashMaps[i] = new HashMap<>();
        }


        for (int i=0;i< string_list.length;i++)
        {
            char[]tmpArray = string_list[i].toCharArray();
            Arrays.sort(tmpArray);
            string_list[i] = new String(tmpArray);
        }

        List<List<String>> ans = new ArrayList();
        for (int i=0;i< string_list.length;i++)
        {
            if(processedString[i])
                continue;
            processedString[i] = true;
            List<String> list = new ArrayList<>();
            list.add(string_list[i]);
            for (int j=i+1;j< string_list.length;j++)
            {

                if(string_list[i].equalsIgnoreCase(string_list[j]))
                {
                    processedString[j] = true;
                    list.add(string_list[j]);
                }
            }
            ans.add(list);
        }

        // Your Code here
return ans;

    }

}
