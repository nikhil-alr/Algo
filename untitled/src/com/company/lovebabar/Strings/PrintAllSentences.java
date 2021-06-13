package com.company.lovebabar.Strings;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSentences {

    public static void main(String args[])
    {
String words[][] = {{"you", "we"},
        {"have", "are"},
        {"sleep", "eat", "drink"}};

        List<String> listOfSennteces = getAllSentences(words);

        for (String sentence:listOfSennteces)
        {
          System.out.println(sentence);
        }

    }


   static List<String> getAllSentences(String words[][])
   {
       List<String> listOfSentence = new ArrayList<>();

       for (int i=0;i<words[0].length;i++)
       {
           getAllSentences(words[0][i],listOfSentence,1,words);
       }

       return listOfSentence;
   }

     static void getAllSentences(String s, List<String> listOfSentence, int row,String wordList[][]) {

        if(row>= wordList.length)
        {
           listOfSentence.add(s);
            return;
        }


        for (int i=0;i<wordList[row].length;i++)
        {
            getAllSentences(s+" "+wordList[row][i],listOfSentence,row+1,wordList);
        }


    }





}
