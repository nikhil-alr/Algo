package com.company.lovebabar.backtrack;

import java.util.ArrayList;
import java.util.Collections;

public class genrateAllSubSeq {

    public static void main(String args[])
    {
        System.out.print(printAllSub("","abc"));
    }

    static ArrayList<String> printAllSub(String ans, String value)
    {

        if (value.length()==0)
        {
            System.out.println(ans);
            ArrayList<String> ansList = new ArrayList<String>();
            ansList.add(ans);
return ansList;
        }

        ArrayList<String> ansListOne = printAllSub(ans,value.substring(1,value.length()));
        ArrayList<String> ansListTwo = printAllSub(ans+value.charAt(0),value.substring(1,value.length()));

        ArrayList<String> mainAnsList = new ArrayList<String>(ansListOne);
        mainAnsList.addAll(ansListTwo);

        Collections.sort(mainAnsList);
        return mainAnsList;

    }

}
