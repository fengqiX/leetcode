package main.leetcode;

public class Q9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        boolean res = true;
        int i =0;
        int len = str.length()-1;

        while(i<=len/2)
        {
            if(str.charAt(i) != str.charAt(len-i))
            {
                res=false;
                break;
            }
            i++;
        }
        return res;
    }
}
