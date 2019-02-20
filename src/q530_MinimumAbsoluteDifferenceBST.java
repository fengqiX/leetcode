package main.leetcode;

import main.leetcode.commen_structure.TreeNode;
import org.junit.Test;

public class q530_MinimumAbsoluteDifferenceBST {
    /*
    need to think about how to get the closest node with root
     */
    int dv=0;
    public int getMinimumDifference(TreeNode root) {
         helper(root);
         return dv;
    }

    public void helper(TreeNode node)
    {
/*        if(node.left==null && node.right==null) return;

        if(node.left!=null)
        {
            if(dv==0) dv=node.val-node.left.val;
            else
            {
                dv=dv>(node.val-node.left.val)?(node.val-node.left.val):dv;
            }
            helper(node.left);
        }
        if(node.right!=null)
        {
            if(dv==0) dv=node.right.val-node.val;
            else
            {
                dv=dv>(node.right.val-node.val)?(node.right.val-node.val):dv;
            }
            helper(node.right);
        }*/
        TreeNode child=null;
        if(node.left==null && node.right==null) return;
        if(node.left!=null)
        {
            if(dv==0) dv=node.val-node.left.val;
            else
            {
               // child = node.left;
                dv=dv>(node.val-node.left.val)?(node.val-node.left.val):dv;

            }
            child = node.left;
            while(child.right!=null)
            {
                child=child.right;
                dv=dv>(node.val-child.val)?(node.val-child.val):dv;
            }
            helper(node.left);
        }
        if(node.right!=null)
        {
            if(dv==0) dv=node.right.val-node.val;
            else
            {

                dv=dv>(node.right.val-node.val)?(node.right.val-node.val):dv;

            }
            child=node.right;
            while(child.left!=null)
            {
                child=child.left;
                dv=dv>(child.val-node.val)?(child.val-node.val):dv;
            }
            helper(node.right);
        }
//        helper(node.left);
//        helper(node.right);
    }

    @Test
    public void run()
    {

    }
}
