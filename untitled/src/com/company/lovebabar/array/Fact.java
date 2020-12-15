package com.company.lovebabar.array;




import java.util.ArrayList;
import java.util.Scanner;

public class Fact {



    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        ArrayList<java.lang.String> ans = new ArrayList<>();
        while (test>0)
        {

            int n = scanner.nextInt();
            int carryForw = 0;
            StringBuffer digitSeq= new StringBuffer("1");
            for (int i=2;i<=n;i++)
            {


if(i==23)
{
    System.out.print("");
}
                for (int j=0;j<digitSeq.length();j++)
                {

                    int tmpppp = Integer.parseInt(""+digitSeq.charAt(j));
                    int val = tmpppp*i;
                    val=(val)+carryForw;

                    int tmp = val;
                    int rem = tmp%10;
                    carryForw=tmp/10;
                    digitSeq.deleteCharAt(j);
                    digitSeq.insert(j,rem);



                }

                if (carryForw>0)
                {
                    digitSeq.append(carryForw);
                }

                carryForw = 0;





            }
            //System.out.print(digitSeq.reverse());



            test-=1;
        }

        for (java.lang.String item:ans)
            System.out.print(item);

    }

}
