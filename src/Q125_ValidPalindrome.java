package main.leetcode;

import org.junit.Test;

public class Q125_ValidPalindrome {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("^[^a-zA-Z0-9_+-]$","");
        StringBuffer copy = new StringBuffer(s);
        String s2 = copy.reverse().toString();
        System.out.println(s);
        System.out.println(copy);

        return s.equalsIgnoreCase(s2);
    }
    @Test
    public void run()
    {
        System.out.println(isPalindrome("0P"));
    }
}
