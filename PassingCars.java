import java.util.*;

class Solution
{
   
    public int solution(int[] A)
    {
    
        // write your code in Java SE 8\
        //check if empty or one \
        
        if(A.length == 0 && A.length == 1)
            return 0;
          
        int currentOneSum = 0;
        int totalOneSum = 0;
        int currentZeros = 0;
        
        for (int i = 0; i < A.length; i++)
        
            if(A[i] == 1)
            
                currentOneSum++;
            
            if(A[i] == 0 || i == A.length-1)
            
                totalOneSum += currentZeros * currentOneSum;
                currentOneSum = 0;
                currentZeros++;
      
        return Math.abs(totalOneSum) <= Math.pow(10,9) ? totalOneSum : -1;
    
    }     
}