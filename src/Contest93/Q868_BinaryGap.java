package main.leetcode.Contest93;

import org.junit.Test;

public class Q868_BinaryGap {
    public int binaryGap(int N) {
        String str = Integer.toBinaryString(N);
        System.out.println(str);
        int maxDis = 0;
        int dis=0;
        boolean meet1=false;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                if(meet1==false) meet1=true;
                else
                {
                    if(dis>maxDis) {
                        maxDis=dis;

                    }
                    dis=0;
                }
            }
            if(meet1==true) dis++;
        }
        return maxDis;
    }
    @Test
    public void run()
    {
        System.out.println(binaryGap(2897));
    }
}
