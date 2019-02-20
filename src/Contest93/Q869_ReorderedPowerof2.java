package main.leetcode.Contest93;

import java.util.Hashtable;

public class Q869_ReorderedPowerof2 {
    public boolean reorderedPowerOf2(int N) {
        Hashtable mappedNum = mapping(N);

        for(long i=0;i<32;i++)
        {
            if(mappedNum.equals(mapping(1<<i))) return true;
        }
        return false;
    }
    public Hashtable mapping(int num)
    {
        Hashtable ht = new Hashtable();
        int key, value;
        while(num>0)
        {
            key = num%10;
            if(ht.containsKey(key))  value = (Integer)ht.get(key)+1;
            else value = 1;
           ht.put(key,value);
           num = num/10;

        }
        return ht;
    }
}
