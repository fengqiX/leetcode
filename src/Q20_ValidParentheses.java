package main.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q20_ValidParentheses {
    //need to check that if there are un-matched pairs
    public boolean isValid(String s) {
        Stack stack = new Stack();
        Queue queue = new LinkedList();
        int len = s.length();
        for(int i =0;i<len;i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                stack.push(s.charAt(i));
            }
            if(s.charAt(i)==')' )
            {
                if(!stack.isEmpty() && (char)stack.peek()=='(')
                    stack.pop();
                else
                    queue.add(s.charAt(i));
            }
            if(s.charAt(i)==']')
            {
                if(!stack.isEmpty() && (char)stack.peek()=='[')
                    stack.pop();
                else
                    queue.add(s.charAt(i));
            }
            if(s.charAt(i)=='}' )
            {
                if(!stack.isEmpty() && (char)stack.peek()=='{')
                    stack.pop();
                else
                    queue.add(s.charAt(i));
            }

        }
        return stack.isEmpty()&&queue.isEmpty();
    }
}
