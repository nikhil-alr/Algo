package com.company.lovebabar.array;

public class SeprateElement {

    public static void main(String args[])
    {

        int array[] = {0,2,1,2,0};
        seprateUsingFlag(array);
        System.out.print("");

    }

    public static void seprateUsingFlag(int array[])
    {
int left = -1;
int right = array.length;
int i=0;
while (i< array.length)
{
    if (array[i]==0)
    {
        left+=1;
        int tmp = array[i];
        array[i] = array[left];
        array[left] = tmp;
        if(i==left) {
            i += 1;
            continue;
        }
        }
    if (array[i]==2)
    {
        if(i>=right)
        {
            i+=1;
continue;
        }

        right-=1;
        int tmp = array[i];
        array[i] = array[right];
        array[right] = tmp;
    }
    if (array[i]==1)
    {
i+=1;
    }

}

    }



    }

