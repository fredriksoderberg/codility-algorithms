// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution 
{
    public int solution(int[] A) 
    {
        
        if(A.length == 0)
            return 0;
            
        Arrays.sort(A);
        int distinct = 1;
        int previous = A[0];
        
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] != previous)
                distinct++;
            previous = A[i];
        }
        return distinct;
        
    }
}