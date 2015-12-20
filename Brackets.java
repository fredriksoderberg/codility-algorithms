// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        if (S.isEmpty())
            return 1;
            
        char[] chars = S.toCharArray();
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < chars.length; i++)
        {
            if(chars[i] == '(' || chars[i] == '{' || chars[i] == '[')
                stack.push(chars[i]);
            else
            {
                if(stack.empty())
                    return 0;
                if (chars[i] == ')' && stack.peek() != '(')
                    return 0;
                else if (chars[i] == '}' && stack.peek() != '{')
                    return 0;
                else if (chars[i] == ']' && stack.peek() != '[')
                    return 0;
                else 
                    stack.pop();
            }
        }
        return stack.empty() ? 1 : 0;    
    }
}