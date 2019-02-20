package main.leetcode.Contest103;

import org.junit.Test;

import java.util.Arrays;

public class Question {


    @Test
    public void run()
    {
        int res = 0;
        int i= 0 ;
        for( i=2 ;i<=14;i+=3)
        {res++;}
        if(i>13) res+=100;
        System.out.println(res);
    }
}
