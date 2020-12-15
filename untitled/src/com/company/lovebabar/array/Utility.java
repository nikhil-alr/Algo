package com.company.lovebabar.array;

import java.util.StringTokenizer;

public class Utility {

    public static void main(String args[])
    {
       String val =  "178 116 294 236 287 193 250 122 63 128 291 260 264 227 241 127 173 137 12 69 268 130 183 231 63 224 68 236 30 103 223 259 270 268";

        StringTokenizer stringTokenizer = new StringTokenizer(val);
        while (stringTokenizer.hasMoreElements())
        {
            System.out.print(stringTokenizer.nextElement()+",");
        }


    }

}
