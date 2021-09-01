package com.company.pepcoding;

import java.util.Scanner;

public class PaythgoursTriplet {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();



    int largest = getNthLargest(a,b,c,1);
    int secondLargest = getNthLargest(a,b,c,2);
    int thirdLargest = getNthLargest(a,b,c,3);

    if (largest*largest==(secondLargest*secondLargest)+(thirdLargest*thirdLargest))
    {
        System.out.print(true);
    }
    else
    {
        System.out.print(false);}
    }


static int getNthLargest(int a,int b,int c,int nth)
{
    if (nth==1)
    {
        int largest = b>c?b:c;
        largest = a>largest?a:largest;
        return largest;
    }

    if (nth==2)
    {
      int secondLargest = b>c?b:c;
      secondLargest = a>secondLargest?secondLargest:a;
      return secondLargest;
    }

    else
    {
        int thirdLargest = b>c?c:b;
        thirdLargest = a>thirdLargest?thirdLargest:a;
        return thirdLargest;
    }
}

}
