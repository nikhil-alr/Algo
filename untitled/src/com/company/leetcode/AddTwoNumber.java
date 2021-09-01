package com.company.leetcode;



public class AddTwoNumber {

    static ListNode genrateLinkedList(int array[])
    {
        ListNode listNode = new ListNode();
        ListNode listNodeCounter = listNode;
        for (int i=0;i<array.length;i++)
        {
            listNodeCounter.val = array[i];
            if(i== array.length-1)
                break;
            listNodeCounter.next = new ListNode();
            listNodeCounter = listNodeCounter.next;
        }
        return listNode;
    }

    public static void main(String args[])
    {
        int array1[] = {0};
        int array2[] = {0};
        ListNode l1 = genrateLinkedList(array1);
        ListNode l2 = genrateLinkedList(array2);
        ListNode ansList = addTwoNumbers(l1,l2);
    }

    static ListNode addTwoNumbers(ListNode l1,ListNode l2)
    {
        ListNode ansList = new ListNode();
        ListNode ansLisCounter = ansList;
        int carry = 0;
        int ans = 0;

        while (l1!=null&&l2!=null)
        {
        ans = l1.val+l2.val+carry;
        carry = 0;

        if (ans>=10)
        {
        carry = ans/10;
        ans = ans%10;
        }
            ansLisCounter.val = ans;
            ansLisCounter.next = new ListNode();
            ansLisCounter = ansLisCounter.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1!=null)
        {
            ans = carry+ l1.val;
            carry = 0;
            if (ans>=10)
            {
                carry = ans/10;
                ans = ans%10;
            }
            ansLisCounter.val = ans;
            ansLisCounter.next = new ListNode();
            ansLisCounter = ansLisCounter.next;
            l1 = l1.next;

        }

        while (l2!=null)
        {
            ans = carry+ l2.val;
            carry = 0;
            if (ans>=10)
            {
                carry = ans/10;
                ans = ans%10;
            }
            ansLisCounter.val = ans;
            ansLisCounter.next = new ListNode();
            ansLisCounter = ansLisCounter.next;
            l2 = l2.next;
        }

        if (carry>0)
        {
            ansLisCounter.val = carry;
        }
        else
        {
            ansLisCounter = ansList;

         while (ansLisCounter.next.next!=null)
         {
             ansLisCounter = ansLisCounter.next;

         }
            ansLisCounter.next = null;

        }



        return ansList;
    }

}
