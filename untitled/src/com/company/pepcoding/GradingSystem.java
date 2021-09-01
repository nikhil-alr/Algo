package com.company.pepcoding;

import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {
        // input - don't change this code
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        // input - don't change this code

        String score = "";
if (marks>90)
{
    score = "excellent";
}
        else if (marks>80&&marks<=90)
        {
            score = "good";
        }
        else if (marks>70&&marks<=80)
        {
            score = "fair";
        }
        else if (marks>60&&marks<=70)
        {
            score = "expectations";
        }
        else if (marks<=60)
        {
            score = "below par";
        }


        System.out.print(score);
        // code here


        int i = 10;
        if(i++ == i)
            System.out.println(i + " is good");
        else
            System.out.println(i + " is bad");

        int j = 20;
        if(++j == j)
            System.out.println(j + " is good");
        else
            System.out.println(j + " is bad");
    }

}

