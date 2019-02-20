package main.leetcode;

import org.junit.Test;

public class Q168_ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        String resString="";
        int res=0;
        while(n>0)
        {
            n--;
            resString =  alph.charAt(n%26) + resString;
            n=n/26;
        }
        return resString.toUpperCase();
    }

    @Test
    public void run()
    {
        System.out.println(convertToTitle(701));
    }
}
