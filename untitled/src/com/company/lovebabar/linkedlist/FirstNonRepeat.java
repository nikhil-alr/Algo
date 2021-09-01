package com.company.lovebabar.linkedlist;

import java.util.HashMap;

public class FirstNonRepeat {

    public static void main(String args[])
    {
        System.out.print(FirstNonRepeating("zz"));
    }



    static public String FirstNonRepeating(String A)
    {
        String ans = "";
        char lastCh = '#';
        HashMap<Character,Integer> characterHashMap = new HashMap<>();

        for (int i=0;i<A.length();i++)
        {
char newChar = A.charAt(i);
if (characterHashMap.get(newChar)==null)
{
    characterHashMap.put(newChar,i);
    if (lastCh=='#')
    {
        lastCh = newChar;
    }
}
else
{
    lastCh = '#';
}
        ans += lastCh;
        }

        return ans;
    }

}

