class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
         int count = 0;
         int diff = B - A;
         if (A % K == 0)
            count++;
         if (B != A && B % K == 0)
            count++;
         count += diff / K;
         return count;         
    }
}