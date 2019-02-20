package main.leetcode;

import org.junit.Test;

import java.util.HashMap;

public class Q13_RomantoInteger {
    public int romanToInt(String s) {
        HashMap hm  = new HashMap();
        hm.put("I",1);
        hm.put("V",5);
        hm.put("X",10);
        hm.put("L",50);
        hm.put("C",100);
        hm.put("D",500);
        hm.put("M",1000);

        int len = s.length();
        int i =0;
        int sum = 0;
        while(i<len)
        {
            if(s.charAt(i)=='I' && i+1!=len && (s.charAt(i+1)=='V'||s.charAt(i+1)=='X'))
            {
                sum += (int)hm.get(s.charAt(i+1)+"") - (int)hm.get(s.charAt(i)+"");
                i++;
            }
            else if(s.charAt(i)=='X' && i+1!=len && (s.charAt(i+1)=='L'||s.charAt(i+1)=='C'))
            {
                sum += (int)hm.get(s.charAt(i+1)+"") - (int)hm.get(s.charAt(i)+"");i++;
            }
            else if(s.charAt(i)=='C' && i+1!=len && (s.charAt(i+1)=='D'||s.charAt(i+1)=='M'))
            {
                sum += (int)hm.get(s.charAt(i+1)+"") - (int)hm.get(s.charAt(i)+"");i++;
            }
            else
            {
                sum += (int)hm.get(s.charAt(i)+"");
            }
            i++;
        }
        return sum;
    }
    @Test
    public void run()
    {
        int num = romanToInt("MCMXCIV");
        System.out.println(num);
    }
}
