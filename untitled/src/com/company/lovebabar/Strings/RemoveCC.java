package com.company.lovebabar.Strings;

public class RemoveCC {

    public static void main(String args[])
    {
System.out.print(removeConsecutiveCharacter("aabaa"));
    }

    static public String removeConsecutiveCharacter(String S){
StringBuffer newString = new StringBuffer();
for (int i=0;i<S.length();i++)
{
    if(newString.length()==0){
        newString.append(S.charAt(i));
continue;
    }

    if (newString.charAt(newString.length()-1)!=S.charAt(i))
        newString.append(S.charAt(i));


}
return new String(newString);
    }

}
