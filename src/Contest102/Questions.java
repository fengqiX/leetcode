package main.leetcode.Contest102;

public class Questions {

    public int totalFruit(int[] tree) {
        int len=tree.length;
        int curlen = 0;
        int i=0;
        int total=0;
        int baskets[] = new int[2];
        baskets[0]=tree[0];
        baskets[1]=-1;
        while(i<len)
        {
                if(tree[i] != baskets[0] && tree[i] !=baskets[1])
                {
                    if(baskets[1]==-1)
                    {
                        baskets[1]=tree[i];
                    }
                    else
                    {
                        baskets[0]=tree[curlen];
                        baskets[1]=tree[i];
                        total=i-curlen;
                        curlen=i;
                    }

                }
                else
                {
                    total++;
                    if(i!=0)
                    {
                        if(tree[i] != tree[i-1])
                        {
                            curlen=i;
                        }
                    }
                }
                i++;
        }
        return total;
    }

    public int[] sortArrayByParity(int[] A) {
        int i=0,j=A.length-1;
        int temp;
        while(i<j)
        {
            if(A[i]%2==1)
            {
                while(A[j]%2!=0 &&j>0)
                {
                    j--;
                }
                if(j<0 || i>j) break;
                System.out.println(A[i]+" "+A[j]);
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
            i++;
        }
        return A;
    }

    public int sumSubarrayMins(int[] A) {
        int i,j;
        int res = 0;
        int modulor = 1000000007;
        int min = Integer.MAX_VALUE;
        for(i=0;i<A.length;i++)
        {
            min = A[i];
            for(j=i;j<A.length;j++)
            {
                if(A[j]<min) min = A[j];
                res += min;
            }
            res = res%modulor;
       //     System.out.println(min);
        }

        return res;
    }
}
