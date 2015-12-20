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
            if(chars[i] == '(')
                stack.push('(');
            else
            {
                if (!stack.empty())
                    stack.pop();
                else
                    return 0;
            }
        }
        return stack.empty() ? 1 : 0;    
    }
}