/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest127;

import java.util.Arrays;

/**
 *
 * @author xiaof
 */
public class Solutions {
    
    public int clumsy(int N) {
            int  total = 0;
           int i = N;
           total = helper(N)+N-3;
           while(i>0)
           {i = i-4;
               total = total - helper(i)+i;
               
           }
           return total;
    }
    public int helper(int N)
    {
        
        if(N>2)
        {
            double num = N;
            int res = (int) Math.floor(num *(num-1)/(num-2));
            return res;
        }
        else if(N==2) return 2;
        else if(N==1) return 1;
        else return 0;
    }
    
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        
        int total =0;
        
        for(int i =0;i<A.length;i++)
        {
            if(K>0)
            {
                if(A[i]<0) 
                {
                    K--;A[i] = -A[i]; 
                }
                if(A[i]==0)
                {
                    K=0;
                }
                if(A[i]>0)
                {
                    K=K%2;
                    if(K==1) A[i]=-A[i];
                }
            }
            total += A[i];
        }
        return total;
    }
}
