package main.leetcode.Contest96;

import java.util.Arrays;

public class Q885_BoatstoSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int len = people.length;
        int i=0, j = len-1;
        Arrays.sort(people);
        int res=0;
        while(i<=j)
        {
            if(people[i]+people[j]<=limit)
            {
                i++;
                j--;
                res++;
            }
            else
            {
                j--;
                res++;
            }
        }
        return res;
    }
}
