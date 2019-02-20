package main.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Q119_PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> rowlist = new ArrayList<>();
        if(rowIndex==0) rowlist.add(1);
        else
        {
            for(int i=0;i<=rowIndex;i++)
            {
//                rowlist.add(Cnk(rowIndex,i));
            }
        }
        return rowlist;
    }



    private long factorial(int num)
    {
        long res = 1;
        for(int i=1;i<=num;i++)
        {
            res = i*res;
        }
        return res;
    }
    @Test
    public void run()
    {
        List<Integer> list = getRow(14);
        System.out.println(list.toString());
    }
}
