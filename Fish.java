import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Integer> upstreamFish = new Stack<Integer>();
        Stack<Integer> downstreamFish = new Stack<Integer>();

        for(int i = 0; i < A.length; i++)
        {
            if(B[i] == 1) // upstream
            {
                upstreamFish.push(A[i]);
            }
            else // downstream
            {
                while(!upstreamFish.empty())
                {
                    if(upstreamFish.peek() < A[i])
                        upstreamFish.pop(); // eats
                    else
                        break;              // is eaten
                }
                if(upstreamFish.empty())
                    downstreamFish.push(A[i]);
            }
        }
        return downstreamFish.size() + upstreamFish.size(); // total fish living.
    }
}