package main.leetcode;

import org.junit.Test;

public class Q605_CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0;
        if(flowerbed.length==1)
        {
            if(flowerbed[0]==0) return true;
            else if(flowerbed[0]==1 && n>0) return false;
            else return true;
        }
        while(i<flowerbed.length)
        {
            if(i==0)
            {
                if(flowerbed[i]==0 && flowerbed[i+1] == 0)
                {
                    flowerbed[i]=1;
                    n--;
                }
            }else if(i==flowerbed.length-1)
            {
                if(flowerbed[i]==0 && flowerbed[i-1]==0)
                {
                    flowerbed[i]=1;
                    n--;
                }
            }else{
                if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1] == 0)
                {
                    flowerbed[i]=1;
                    n--;
                }
            }
            i++;
        }
        return n<=0?true:false;
    }

    @Test
    public void run()
    {
        int[] array = {1,0,0,0,1,0,0};
        int n=2;
        System.out.println(canPlaceFlowers(array,n));
    }
}
