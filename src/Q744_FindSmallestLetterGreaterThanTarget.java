package main.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Q744_FindSmallestLetterGreaterThanTarget {
         public char nextGreatestLetter(char[] letters, char target) {

             char res = target;
             int index = 1;
            // List list = Arrays.asList(letters.);
            String str = Arrays.toString(letters);
            // System.out.println(Arrays.toString(letters));
             while(index<26)
             {
                 if((char)(target+index)>'z')
                 {
                     res = (char)(((target-'a') + index)% 26 +'a');
                 }
                 else {
                     res = (char) (target + index);
                 }
                 System.out.println(res);

                 if(str.contains((res+"").toLowerCase())) return res;
                 index++;
             }
             return target;
        }
    @Test
    public void run()
    {
        char[] letters = {'c','f','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters,target));
    }

}
