package main.leetcode.Contest105;

import main.leetcode.commen_structure.TreeNode;

import java.util.ArrayList;

public class Questions {
    public String reverseOnlyLetters(String S) {
        int start=0,end=S.length()-1;
        char f,l,temp;
        char[] res = S.toCharArray();

        while(start<end)
        {
            f=S.charAt(start);
            l=S.charAt(end);
            if(Character.isLetter(f) && Character.isLetter(l))
            {
                res[start]=l;
                res[end]=f;
                start++;
                end--;
            }
            if(!Character.isLetter(f)) start++;
            if(!Character.isLetter(l)) end--;
        }
        return new String(res);
    }

    public int maxSubarraySumCircular(int[] A) {
        int len = A.length;
        int res = A[0];
        int max=A[0];
        int i,maxindex=0;
        int temp;
        for(i = 0;i<len;i++)
        {
            if(max<A[i])
            {
                max=A[i];
                maxindex=i;
            }
        }
        if(max<=0) return max;


            temp  = 0;
            for(int j = maxindex ; j< len+maxindex;j++)
            {
                temp += A[j%len];
                if(temp<0)
                {
                    temp = 0;
                }
                else
                {
                    res = Math.max(res,temp);
                }
            }
        for(int j = maxindex ; j< len+maxindex;j--)
        {
            temp += A[(j+len)%len];
            if(temp<0)
            {
                temp = 0;
            }
            else
            {
                res = Math.max(res,temp);
            }
        }
        return res;
    }

    class CBTInserter {

        TreeNode head ;
        int parent=0;
        public CBTInserter(TreeNode root) {
            this.head = root;
        }

        public int insert(int v) {
                TreeNode newNode = new TreeNode(v);
                insertBinary(head,newNode);
                return parent;
        }

        public TreeNode get_root() {
                return head;
        }

        public  TreeNode insertBinary(TreeNode root, TreeNode node){
            if(root == null)
                return node;
            else if(node == null)
                return root;
            if(root.left == null){
                parent = root.val;
                root.left = node;
                return root;
            }
            else if(root.right == null){
                parent = root.val;
                root.right = node;
                return root;
            }

            int lrh = 0;
            int rrh = 0;
            TreeNode pNode = root.left;
            while(pNode != null){
                lrh++;
                pNode = pNode.right;
            }

            pNode = root.right;
            while(pNode != null){
                rrh++;
                pNode = pNode.left;
            }

            if(lrh != rrh){
                parent = root.val;
                insertBinary(root.right, node);
            }
            else {
                parent = root.val;
                insertBinary(root.left, node);
            }
            return root;
        }

    }
}
