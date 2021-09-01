package com.company.lovebabar.backtrack;

import java.util.ArrayList;

public class KeyWorkCombination {

    static String [][]numberCombination={
                              {"0","?!"},{"1","abc"},
                                         {"2","def"},
                                         {"3","ghi"},
                                         {"4","jkl"},
                                         {"5","mno"},
                                         {"6","pqrs"},
                                         {"7","tuv"},
                                         {"8","wxyz"},
                                         {"9",".,"},
                                         };

    public static void main(String args[])
    {

        System.out.print(getAllCombination("678"));


    }

    public static ArrayList<String> getAllCombination(String digit)
    {

       if (digit.length()==0)
           return new ArrayList<>();
       int indexNumber = Integer.valueOf(digit.charAt(0))-48;
        String value = numberCombination[indexNumber][1];
        ArrayList<String> numberCombinationAns = getAllCombination(digit.substring(1,digit.length()));
        ArrayList<String> ansList = new ArrayList<>();

        if (numberCombinationAns.size()==0)
        {
            for (char ch : value.toCharArray())
                ansList.add(""+ch);
            return ansList;
        }

        for (char ch : value.toCharArray())
        {
            for (String convertedNumber:numberCombinationAns)
            {
                ansList.add(ch+convertedNumber);
            }
        }
    return ansList;
    }

}
