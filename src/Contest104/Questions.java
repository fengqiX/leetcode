package main.leetcode.Contest104;

import org.junit.Test;

import java.util.*;

public class Questions {

    @Test
    public void run()
    {

    }

    public boolean hasGroupsSizeX(int[] deck) {
        if(deck==null || deck.length<2) return false;
        HashMap hm = new HashMap();
        int count;
        for(int i = 0 ;i<deck.length;i++)
        {
            if(!hm.containsKey(deck[i]))
            {
                hm.put(deck[i],1);
            }
            else
            {
                count = (int)hm.get(deck[i]);
                count++;
                hm.put(deck[i],count);
            }
        }

        Set set = hm.entrySet();
        Iterator it = set.iterator();
        int X=0,Y=0;
        while(it.hasNext())
        {
            Map.Entry me = (Map.Entry) it.next();
            X=(int) me.getValue();
            if(X<2) return false;
            if(Y==0) Y=X;
            else
            {
                System.out.println(maxCommonDivisor(X,Y));
                if(!(Y%X==0||X%Y==0) || maxCommonDivisor(X,Y)<2 ) return false;

                if(Y>X) Y=X;
            }
        }
        return true;
    }
    public static int maxCommonDivisor(int m, int n) {
        if (m < n) {// 保证m>n,若m<n,则进行数据交换
             int temp = m;
             m = n;
             n = temp;
        }
        if (m % n == 0) {// 若余数为0,返回最大公约数
            return n;
        } else { // 否则,进行递归,把n赋给m,把余数赋给n
           return maxCommonDivisor(n, m % n);
        }
    }


    public int partitionDisjoint(int[] A) {
        if(A.length==2) return 1;
        int possIndex = 0;
        int i=0,j=A.length-2;
        int temp = 0;
        int minIndex= 0,min=A[0];
        int leftmax=A[0],leftMaxIndex=0;
        for(;i<A.length;i++)
        {
            if(min>=A[i])
            {
                min=A[i];
                minIndex=i;
            }
        }
        for(i=0;i<minIndex;i++)
            {
                if(leftmax<A[i])
                {
                    leftmax=A[i];
                }
            }
        System.out.println(min+" "+minIndex);
        System.out.println(leftmax);

        i=A.length-2;
        j=i;
        while(i>minIndex)
        {
            if(A[i]<leftmax)
            {
                for(j=minIndex;j<i;j++)
                {
                    if(leftmax<A[j])
                    {
                        leftmax=A[j];
                    }
                }
                minIndex=i;
                i=A.length-2;
            }
           else i--;

        }
        return minIndex+1;
    }

    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> liststr = new ArrayList<>();
        String Bstr="";
        int[] count = new int[26];
        int[] temp = new int[26];

        for(String b: B)
        {
            temp = new int[26];
            for(char letter : b.toCharArray())
            {
                temp[letter-'a']++;
            }
            for(int i=0;i<count.length;i++)
            {
                count[i]=Math.max(count[i],temp[i]);
            }
        }

        boolean tell=true;
        for(String a: A)
        {
            temp = new int[26];
            for(char letter : a.toCharArray())
            {
                temp[letter-'a']++;
            }
            tell=true;
            for(int i=0;i<count.length;i++)
            {
                if(count[i]!=0 && count[i]>temp[i])
                {
                    tell=false;
                    break;
                }
            }
            if(tell) liststr.add(a);
        }
    return liststr;
    }

}
