package com.company.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidParnthsis {

    public static void main(String args[]) {
       List list =  generateParenthesis(4);
        Collections.sort(list);
System.out.print(list);
    }

    static public List<String> generateParenthesis(int n) {
        List<String> ansList = new ArrayList<>();

        if (n == 1) {
            return new ArrayList<String>() {{
                add("()");
            }};
        }

        List<String> parenthesisList = generateParenthesis(n-1);

        for (int i=0;i<parenthesisList.size();i++)
        {
            String genratedParnthesis = parenthesisList.get(i);

            for (int k=0;k<genratedParnthesis.length();k++)
            {

                String ans = genratedParnthesis.substring(0,k)+"()"+genratedParnthesis.substring(k,genratedParnthesis.length());
                if (!ansList.contains(ans)) {
                    ansList.add(ans);
                }


            }


        }

        return ansList;
    }
}
