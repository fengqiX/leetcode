package main.leetcode;

import java.util.Arrays;

public class Q1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int targetSum=0;
        int[] res=new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return null;
    }

}
