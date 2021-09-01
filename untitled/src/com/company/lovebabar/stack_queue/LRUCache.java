package com.company.lovebabar.stack_queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LRUCache {

    public static void main(String args[])
    {

    }


    static Queue<Integer> queue = new LinkedList<>();
    static HashMap<Integer,Integer> hashMap = new HashMap<>();
    static int cap = 0;


    //Constructor for initializing the cache capacity with the given value.
    LRUCache(int cap)
    {
        this.cap = cap;
    }

    //Function to return value corresponding to the key.
    public static int get(int key)
    {

       if (hashMap.get(key)==null)
       {
           return -1;
       }

       return hashMap.get(key);
    }

    //Function for storing key-value pair.
    public static void set(int key, int value)
    {

        if (cap==queue.size())
        {
            int keyToFlush = queue.poll();
            hashMap.remove(keyToFlush);
        }
        else
        {
            queue.add(key);
            hashMap.put(key,value);
        }
    }

}
