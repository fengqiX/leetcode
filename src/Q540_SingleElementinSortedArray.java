package main.leetcode;

import org.junit.Test;

public class Q540_SingleElementinSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length-1;
        int mid;
        if(nums.length<3) return nums[0];
        while(l<r)
        {
            mid=(l+r)/2;

            if(nums[mid]==nums[mid-1])
            {
                if((mid-1)%2==2)
                {
                    r=mid-1;
                }
                else
                {
                    l=mid;
                }
            }
            else if(nums[mid]==nums[mid+1])
            {
                if(mid%2==2)
                {
                    l=mid;
                }
                else
                {
                    r=mid-1;
                }
            }
            else return nums[mid];

        }
      // System.out.println();
        return nums[(r+l)/2];
    }
    @Test
    public void run()
    {
        int[] nums={1,1,2};
        System.out.println(singleNonDuplicate(nums) );
    }
}
