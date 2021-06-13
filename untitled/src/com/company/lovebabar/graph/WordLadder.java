package com.company.lovebabar.graph;

import java.util.*;

public class WordLadder {

    public static void main(String args[])
    {
        String beginWord = "hit", endWord = "cog";
        String[] wordList = {"hot","dot","dog","lot","log","cog"};
        List<String> list = new ArrayList<String>(Arrays.asList(wordList));
        System.out.print(ladderLength(beginWord,endWord,list));
    }

    static class Pair
    {
        int step = 0;
        String word = "";

        Pair(int step,String word)
        {
            this.step = step;
            this.word = word;
        }
    }

    static public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        int totalStep = 0;

        if(!wordList.contains(endWord))
            return totalStep;

        HashMap<String,Boolean> usedWord = new HashMap<>();
       Queue<Pair> queue = new LinkedList<>();
        List<String> newWordList = getListWithOneChange(beginWord,wordList,usedWord);

        for (String word:newWordList)
            queue.add(new Pair(2,word));

        while (!queue.isEmpty())
        {
            Pair pair = queue.poll();
            if (pair.word.equals(endWord))
            {
                totalStep = pair.step;
                break;
            }

            newWordList = getListWithOneChange(pair.word,wordList,usedWord);
            for (String word:newWordList)
                queue.add(new Pair(pair.step+1, word));

        }





        return totalStep;

    }


    static List<String> getListWithOneChange(String word,List<String> wordList,HashMap<String,Boolean> usedWord)
    {
        List<String> newWordList = new ArrayList<>();
        for (String listWord:wordList)
        {
            if(usedWord.get(listWord)!=null)
                continue;
            int diff = 0;
            for (int i=0;i<listWord.length();i++)
            {
                if(word.charAt(i)!=listWord.charAt(i))
                    diff+=1;
                if(diff>1)
                    break;
            }
            if (diff==1)
            {
                newWordList.add(listWord);
                usedWord.put(listWord,true);
            }


        }
        return newWordList;
    }

}
