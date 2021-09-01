package com.company.lovebabar.trie;

import java.util.HashMap;

class TrieNode
{
    char val = ' ';
    int wordCount = 0;
    HashMap<Character,TrieNode> trieNodeHashMap = new HashMap<>();
}

public class Trie {




    public static void main(String args[])
    {
       // System.out.print("Hello");
        String words[] = {"aba","abc","ab","bab","ba"};

        HashMap<Character,TrieNode> trie = genrateTrie(words);
        TrieNode trieNode = findData(trie,"bab");
        if (trieNode!=null)
        {
            trieNode.wordCount = -1;
        }

        trieNode = findData(trie,"bab");
        if(trieNode!=null)
        {
            System.out.print("Found");
        }
        else
        {
            System.out.print("Not Found");
        }


    }


    public static void removeData(HashMap<Character,TrieNode> trie,String value)
    {

    }

    public static TrieNode findData(HashMap<Character,TrieNode> trie,String value)
    {
        TrieNode trieNode = null;
       for (char ch : value.toCharArray())
       {
           trieNode = trie.get(ch);
           if(trieNode==null)
               return null;
           trie = trieNode.trieNodeHashMap;
       }

       return trieNode.wordCount==0?trieNode:null;

    }

    public static HashMap<Character,TrieNode> genrateTrie(String words[])
    {
        HashMap<Character,TrieNode> parentNodeHashMap = new HashMap<>();
        HashMap<Character,TrieNode> trieNodeHashMap = new HashMap<>();


        for (int i=0;i< words.length;i++)
        {
            TrieNode trieNode = null;
            trieNodeHashMap = parentNodeHashMap;
            for (int j=0;j< words[i].length();j++)
            {
                char ch = words[i].charAt(j);
                //System.out.print(ch);
                trieNode = trieNodeHashMap.get(ch);
                if(trieNode==null)
                {
                    trieNode = new TrieNode();
                    trieNode.val = ch;
                    trieNodeHashMap.put(ch,trieNode);
                    trieNodeHashMap = trieNode.trieNodeHashMap;
                    trieNode.wordCount +=1;

                    continue;
                }
                trieNode.wordCount +=1;

                trieNodeHashMap = trieNode.trieNodeHashMap;

            }
            trieNode.wordCount = 0;
            //System.out.println();
        }

        return parentNodeHashMap;

    }


}
