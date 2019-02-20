package main.leetcode.Contest94;

import main.leetcode.commen_structure.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class Q1 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();

        leafvalue(root1,list1);
        leafvalue(root2,list2);
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        return list1.toString().equalsIgnoreCase(list2.toString());
    }
    private void leafvalue(TreeNode node, ArrayList list)
    {
        if(node==null) return;

        if(node.right==null && node.left==null)
        {
            list.add(node.val);
        }

        leafvalue(node.left,list);
        leafvalue(node.right,list);

    }

    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] array = new int[30001][30001];
        for(int i=0;i<obstacles.length;i++)
        {

        }
        return 10;
    }
    public int minEatingSpeed(int[] piles, int H) {
            int len = piles.length;
            Arrays.sort(piles);
        System.out.println(piles[0]);
            int maxdays = 0;
            int mindays = len;
            double ai = 0.0;
            for(int i=0;i<len;i++)
            {
                maxdays+=piles[i];

            }
            ai=len-(int)((double)(H-mindays)/(double)(maxdays-mindays)*len);
            System.out.println(ai);

            int index = (int)ai;
            if(index==0) index++;
            if(index>=len) index = len;
            int K=piles[index-1];
            int days=Integer.MIN_VALUE;
            int sub=1;

            while(days<=H)
            {
                days=0;
                for(int i=0;i<len;i++)
                {
                    days+=piles[i]/K;

                    if(piles[i]%K!=0) days++;
                }
                System.out.println(K+" "+days+" "+H );

                K--;
            }
            K=K+2;
            return K;
    }

    @Test
    public void run()
    {
        int[] piles={30,11,23,4,2};
        int H = 4;
        System.out.println(minEatingSpeed(piles,  H));
    }
}
