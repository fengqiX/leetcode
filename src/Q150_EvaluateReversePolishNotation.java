package main.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q150_EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stN = new Stack();


        String operators  = "+-*/";
        String operator;
        int operand1,operand2,res=0;

        int len = tokens.length;

        for(int i=0;i<len;i++)
        {
            if(operators.indexOf(tokens[i])==-1)
            {
                stN.push( Integer.valueOf(tokens[i]));
            }
            else {
                operand2 = stN.pop();
                operand1 =stN.pop();
                operator = tokens[i];
                if (operator.equals("+")) {
                    res = operand1 + operand2;
                } else if (operator.equals("-")) {
                    res = operand1 - operand2;
                } else if (operator.equals("*")) {
                    res = operand1 * operand2;
                } else
                {
                    res = operand1 / operand2;
                }
                stN.push(res);
            }
        }
        return stN.pop();
    }
}
