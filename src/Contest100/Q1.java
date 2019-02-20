package main.leetcode.Contest100;

import main.leetcode.commen_structure.TreeNode;
import oracle.jrockit.jfr.StringConstantPool;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class Q1 {
    public boolean isMonotonic(int[] A) {
        String str1 = Arrays.toString(A).replaceAll(" ","");

        Arrays.sort(A);
        String str2 = Arrays.toString(A).replaceAll(" ","");
        Integer[] newObj = toObject(A);
       Arrays.sort(newObj, Collections.reverseOrder());
    //    Integer[] newObj = toObject(A);

        String str3 = Arrays.toString(newObj).replaceAll(" ","");;

        return (str1.equals(str2)||str1.equals(str3));
    }
    public  Integer[] toObject(int[] intArray) {

        Integer[] result = new Integer[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            result[i] = Integer.valueOf(intArray[i]);
        }
        return result;
    }
    @Test
    public void run()
    {
        System.out.println(1|4);
    }

        public TreeNode increasingBST(TreeNode root) {

            TreeNode node = null;

            TreeNode leftNode;
            TreeNode leftRightNode;

            while(root.left!= null)
            {
                node = root;

               leftNode = node.left;
                leftRightNode = leftNode.right;
                leftNode.right = node;
                node.left=leftRightNode;

                root=leftNode;
            }

            node = root;
            TreeNode pre = node;

            while(node.left!=null || node.right!=null)
            {
                if(node.left!=null)
                {
                    leftNode = node.left;
                    leftRightNode = leftNode.right;
                    leftNode.right = node;
                    node.left=leftRightNode;

                    if(pre!=node)
                    {
                        pre.right=leftNode;
                    }
                    node = leftNode;
                }
                else
                {
                    pre= node;
                    node = node.right;
                }
            }
            return root;
        }


}
