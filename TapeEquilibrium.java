class Solution
{
    public int solution(int[] A) 
    {
        // write your code in Java SE 8
        int start = 0;
        int end = A.length - 1;
        int firstpart = 0;
        int lastpart = 0;
        while (start <= end)
        {
            if (Math.abs(firstpart) > Math.abs(lastpart))
            {
                lastpart += A[end];
                end--;
            }
            else
            {
                firstpart += A[start];
                start++;
            }
        }
        return Math.abs(firstpart - lastpart);
    }
}