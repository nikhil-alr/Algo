package com.company.lovebabar.stack_queue;

public class TheCelebrityProblem {

    public static void main(String args[])
    {

    }

    int celebrity(int M[][], int n)
    {
        int celebrity = -1;
        for (int i=0;i<M.length;i++)
        {
            boolean isCelebrity = true;
            for (int j=0;j<M[i].length;j++)
            {
                if (M[i][j]==1)
                {
                    isCelebrity = false;
                    break;
                }
            }
            if (isCelebrity)
                celebrity = i;
        }
    return celebrity;
    }
}
