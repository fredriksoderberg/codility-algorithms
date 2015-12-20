import java.util.Arrays;

class Solution {
    public int solution(int[] A) 
    {
        // write your code in Java SE 8
        if(A.length == 1)
            if(A[0] == 1)
                return 2;
            else
                return 1;
        
        Arrays.sort(A);
        
        if(A[0] == 2)
            return 1;
        
        for(int i = 0; i < A.length - 1; i++)
        {
            if(A[i] == A[i+1])
                continue;
            if(A[i] > 0 && A[i] + 1 !=  A[i+1])
                return A[i] + 1;
        }
        return  1;
    
    }
}