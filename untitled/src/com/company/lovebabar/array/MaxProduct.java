package com.company.lovebabar.array;

public class MaxProduct {


    public static void main(String argsp[])
    {
        System.out.print("MAX PRODUCT");

        int array[] = {6,-3,-10,0,2};

        int maxProduct = 0;
        int tmpProduct = 1;
        int isLastElmentE = 1;
        for (int i=0;i<array.length;i++)
        {
            if(array[i]<0)
            {
                if (isLastElmentE<0)
                {
                    tmpProduct = tmpProduct*array[i];
                    tmpProduct = tmpProduct*isLastElmentE;
                    isLastElmentE = 1;

                    if (tmpProduct>maxProduct)
                        maxProduct = tmpProduct;
                }
                else
                {
                    isLastElmentE = array[i];

                }
                continue;
            }


                if(array[i]==0)
                {
                    tmpProduct = 1;
                    continue;

                }


            else
                tmpProduct = tmpProduct*array[i];


            if (tmpProduct>maxProduct)
                maxProduct = tmpProduct;
        }

        System.out.print(maxProduct);

    }

}
