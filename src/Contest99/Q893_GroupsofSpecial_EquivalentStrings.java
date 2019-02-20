package main.leetcode.Contest99;

import java.util.Arrays;
import java.util.HashMap;

public class Q893_GroupsofSpecial_EquivalentStrings {
    public int numSpecialEquivGroups(String[] A) {
        HashMap hm =new HashMap();
        String str = "";
        int index = 0;
    //    int res = 0;
        for(int i =0;i<A.length;i++)
        {
            str = resort(A[i]);

            if(hm.containsValue(str)==false)
            {
                hm.put(index, str);
                index++;
            }
        }
        return index;

    }
    private String resort(String str)
    {
        String str1="", str2="";
        int i=0;
        while(i<str.length())
        {
            str1+=str.charAt(i)+"";

            i++;

            if(i<str.length())
            {
                str2+=str.charAt(i)+"";
                i++;
            }
        }
        str1 = sortString(str1);
        str2 = sortString(str2);

        return str1+str2;

    }
    public static String sortString(String inputString)
    {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }
}
