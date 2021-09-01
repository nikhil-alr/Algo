package com.company.lovebabar.stack_queue;

public class NonRepeatingVal {

    public static void main(String args[])
    {
FirstNonRepeating("hrqcvsvszpsjammdrw");
    }

    static public String FirstNonRepeating(String A)
    {
        int array[] = new int[26];

        int index = A.charAt(0)-97;
        array[index]+=1;

        String ansString = ""+A.charAt(0);
        for (int i=1;i<A.length();i++)
        {
            if (A.charAt(i)==A.charAt(i-1))
            {
                ansString+="#";
            }
        else
            {
                for (int j=0;i<array.length;j++)
                {
                    if (array[j]==1)
                    {
                        int charIndex = 97+j;
                        char ch = (char) charIndex;
                        ansString+=ch;
                        break;
                    }

                }
            }
             index = A.charAt(i)-97;
            array[index]+=1;
        }

        return ansString;
    }

}
