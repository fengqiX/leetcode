package main.leetcode;

import main.leetcode.commen_structure.TreeNode;

public class Q532_KdiffPairs_in_anArray {

    // 连续的 最长 相同数值 节点长度
    int maxLen=Integer.MIN_VALUE;
    public int longestUnivaluePath(TreeNode root) {
        if(root!= null)
            helper(root, -1);

        return maxLen;
    }
    public int helper(TreeNode node, int value)
    {
        if(node == null ) return 0;

        int left = helper(node.left, node.val);
        int right = helper(node.right, node.val);
        return 0;

    }
}
