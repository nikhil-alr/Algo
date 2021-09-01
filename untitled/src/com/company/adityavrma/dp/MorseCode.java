package com.company.adityavrma.dp;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MorseCode {

    public static void main(String args[])
    {
System.out.print(possibilities("?-?"));
    }






    public static List<String> possibilities(String signals) {

        char[] dataTree = new char[]{'0','E','T','I','A','N','M','S','U','R','W','D','K','G','O'};
        ArrayList<String> ansList = new ArrayList<String>();

        Queue<Integer> indexQueue = new LinkedList<>();
Queue<Integer> sIndexQueue = new LinkedList<>();
indexQueue.add(0);

        for (char morseCode:signals.toCharArray())
        {

            while (!indexQueue.isEmpty())
            {
                switch (morseCode)
                {
                    case  '.':
                       sIndexQueue.add(indexQueue.poll()*2+1);
                        break;
                    case  '-':
                        sIndexQueue.add(indexQueue.poll()*2+2);
                        break;
                    default:
                        int perviousIndex = indexQueue.poll();
                        sIndexQueue.add(perviousIndex*2+1);
                        sIndexQueue.add(perviousIndex*2+2);

                 }
            }
            indexQueue = new LinkedList<>(sIndexQueue);
            sIndexQueue.clear();
        }

while (!indexQueue.isEmpty())
    ansList.add(""+dataTree[indexQueue.poll()]);

        return ansList;
    }





}
