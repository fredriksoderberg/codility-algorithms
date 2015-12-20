import java.util.Arrays;

class Solution 
{
    public int solution(int[] A) 
    {
        // write your code in Java SE 8
        if (A.length == 0)
            return 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++)
        {
            if(A[i] != i + 1)
                return i + 1 ;
        }
        return A.length + 1;
    }
}