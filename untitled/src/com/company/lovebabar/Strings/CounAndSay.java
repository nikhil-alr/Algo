package com.company.lovebabar.Strings;

public class CounAndSay {

    public static void main(String args[])
    {
        System.out.print(countAndSay(4));;
    }


   static public String countAndSay(int n) {

        String data = "1";
        for (int i=1;i<n;i++)
        {
            data = countString(data);
        }

        return data;
    }

    static String countString(String data)
    {
        if(data=="1")
            return "11";

        char lastVal = data.charAt(0);
        int digitCount = 1;

        StringBuilder newString = new StringBuilder();

        for (int i=1;i<data.length();i++)
        {
            if(data.charAt(i)==lastVal)
            {

                digitCount+=1;
            }
            else
            {
                newString.append(digitCount);
                newString.append(lastVal);
                lastVal = data.charAt(i);
                digitCount = 1;
            }
        }

        newString.append(digitCount);
        newString.append(lastVal);
return new String(newString);
    }
}
