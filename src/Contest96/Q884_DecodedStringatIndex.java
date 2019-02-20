package main.leetcode.Contest96;

import org.junit.Test;

public class Q884_DecodedStringatIndex {
    public String decodeAtIndex(String S, int K) {
        StringBuilder sb = new StringBuilder();
        long repet = 0;
        String substr = "";
        int begin = 0 , end = 0;
        int numIndex = -1;
        for(int i = 0;i<S.length();i++)
        {
            if(Character.isDigit(S.charAt(i)))
            {
                if(numIndex==-1)
                {
                    numIndex=i;
                    end = i;
                }
               if(i+1<S.length() && Character.isDigit(S.charAt(i+1))) continue;
                else {
                    //System.out.println(Integer.valueOf(S.charAt(i)) + " "+ S.charAt(i));

                    substr = sb.toString() + S.substring(begin, end);
                    if(substr.length()>=K)
                    {
                        sb = new StringBuilder(substr);
                        break;
                    }
                   repet = Long.valueOf(S.substring(numIndex,i+1));
                    sb.delete(0, sb.length());
                    //System.out.println(substr);
                    for (int j = 0; j < repet; j++) {
                        sb.append(substr);
                        if(sb.toString().length()>=K) {
                            System.out.println(sb.toString());
                            break;
                        }
                    }
                    numIndex=-1;
                    // System.out.println(sb.toString());
                }
            }
            if(Character.isLetter(S.charAt(i)))
            {
                if(i!=0 && Character.isDigit(S.charAt(i-1)))
                {
                    begin=i;
                    System.out.println(begin);
                }
            }

            if(sb.toString().length()>=K) {
            System.out.println(sb.toString());
                break;
            }
        }
        if(sb.length()<K) sb = new StringBuilder(S);
        System.out.println(sb.toString());
        return sb.toString().charAt(K-1)+"";
    }

    @Test
    public void run()
    {
        System.out.println( decodeAtIndex("vzpp636m8y",2920));
    }
}
