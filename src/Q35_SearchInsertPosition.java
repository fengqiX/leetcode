package main.leetcode;

public class Q35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int begin = 0, end= nums.length-1;
        int middle ;
        while(begin<end)
        {
            middle = (begin+end)/2;
            if(target>nums[middle])
            {
                begin = middle+1;
            }
            else if(target<nums[middle])
            {
                end = middle-1;
            }
            else
            {
                return middle;
            }

        }
        return begin;
    }
}
