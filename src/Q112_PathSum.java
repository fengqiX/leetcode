package main.leetcode;

import main.leetcode.commen_structure.TreeNode;

public class Q112_PathSum {
    /*
    to sum all the path from root to all leafs, need to check if a node has one child
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;

        return _f(root,sum);

    }

    public boolean _f(TreeNode node, int wallet)
    {
        if(node==null)
        {
            return wallet==0;
        }

        if(node.left != null && node.right==null)
        {
           return _f(node.left, wallet-node.val);
        }

        if(node.right!=null && node.left == null )
        {
           return  _f(node.right, wallet-node.val);
        }
        return _f(node.left, wallet-node.val) || _f(node.right, wallet-node.val);
    }
}
