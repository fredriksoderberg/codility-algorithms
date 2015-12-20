import java.util.Arrays;cb4 


class Solution 
{
    public int solution(int[] A)
    {
     // write your code in Java SE 8cf3 cb4 strokec3
             Arrays.sort(A);
        for(int i = 0; i < A.length; i++)
        {
             if (i != (A[i]- 1))
                return 0;
        }
        return 1;
    }
}