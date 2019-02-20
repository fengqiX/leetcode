package main.leetcode;

import org.junit.Test;

public class Q7_ReverseInteger {
    public int reverse(int x) {
        String num = x + "";
        String parse ="";
        int res=0;
     //   System.out.println(num+" "+num.length());

        int start =0;

        if(x<0) start=1;

        for(int i=start;i<num.length();i++)
        {
            parse = num.charAt(i)+parse;
        }
        try {
            res = Integer.parseInt(parse);
            if (x < 0) res = 0 - res;
        } catch (NumberFormatException e)
        {
            res = 0;
        }
        System.out.println(res);
        return res;
    }

/*    public static void  main(String args[])
    {
        Q7_ReverseInteger start = new Q7_ReverseInteger();

        start.reverse(9646324351);
    }*/
//    Exception in thread "main" java.lang.NumberFormatException: For input string: "9646324351"
//    at java.lang.NumberFormatException.forInputString(NumberFormatException.java:22)
//    at java.lang.Integer.parseInt(Integer.java:540)
//    at java.lang.Integer.parseInt(Integer.java:572)
//    at Solution.reverse(Solution.java:17)
//    at __DriverSolution__.__helper__(__Driver__.java:8)
//    at __Driver__.main(__Driver__.java:52)
}
