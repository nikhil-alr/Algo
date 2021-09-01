package com.company.leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class LongestSubstring {

    public static void main(String args[])
    {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

//    static public int lengthOfLongestSubstring(String s) {
//
//        int longestSub = 0;
//
//        for (int i=0;i<s.length();i++)
//        {
//           int len =  getUniqueSubLen(s.substring(i));
//           if (len>longestSub)
//               longestSub = len;
//        }
//
//
//        return longestSub;
//
//    }

    static int getUniqueSubLen(String value)
    {
        HashMap<Character,Boolean> hashMap = new HashMap<>();

        int uniqueLen = 0;

        for (char ch:value.toCharArray())
        {
            if(hashMap.get(ch)!=null)
            {
                break;
            }
            uniqueLen+=1;
            hashMap.put(ch,true);
        }

        return uniqueLen;
    }



    static public int lengthOfLongestSubstring (String s)
    {
        int longestLength = 0;

        Deque<Character> deque = new LinkedList<>();
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (int i=0;i<s.length();i++)
        {
            if (hashMap.get(s.charAt(i))!=null)
            {
                char ch = deque.pollFirst();
                hashMap.remove(ch);
            while (ch!=s.charAt(i))
            {
                ch = deque.pollFirst();
                hashMap.remove(ch);
            }
            deque.addLast(s.charAt(i));
            hashMap.put(s.charAt(i),i);
            }
            else
            {
                hashMap.put(s.charAt(i),i);
                deque.addLast(s.charAt(i));
            }

            if(longestLength<deque.size())
                longestLength = deque.size();



        }



        return longestLength;
    }


}
