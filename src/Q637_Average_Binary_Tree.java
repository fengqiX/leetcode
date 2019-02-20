package main.leetcode;

import main.leetcode.commen_structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q637_Average_Binary_Tree {
    final double[] sum = new double[1000];
    final int[] indices = new int[1000];
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> list = new ArrayList<>();
        helper(root,0);

        for(int i=0;i<indices.length;i++)
        {
            if(indices[i]==0) break;
            list.add(sum[i]/indices[i]);
        }

        return list;
    }

    public void helper(TreeNode node, int level)
    {
        if(node == null) return ;

        indices[level]++;
        sum[level] += node.val;

        helper(node.right,level+1);
        helper(node.left, level+1);

    }
}
