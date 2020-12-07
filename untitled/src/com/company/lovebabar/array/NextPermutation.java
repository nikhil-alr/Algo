package com.company.lovebabar.array;

public class NextPermutation {

    public static void main(String args[])
    {
        int array[]={2,3,1};
        int swap1 = -1;
        for (int i= array.length-1;i>0;i--)
        {
            if (array[i]>array[i-1])
            {
             swap1 = i-1;
              break;
            }


        }

        if(swap1==-1)
        {
            int i=swap1+1;
            int j = array.length-1;

            while (i<j)
            {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;

                i+=1;
                j-=1;

            }
            return;
        }

        int swap2 = swap1;
        for (int i= array.length-1;i>swap1;i--)
        {
            if (array[swap1]<array[i])
            {
                swap2 = i;
                break;
            }

        }

int tmp = array[swap1];
        array[swap1] = array[swap2];
        array[swap2] = tmp;

        int i=swap1+1;
        int j = array.length-1;

        while (i<j)
        {
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;

            i+=1;
            j-=1;

        }

System.out.print("");

    }

}
