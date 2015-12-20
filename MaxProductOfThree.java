// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int l = A.length-1;
        int one, two,three = 0;
        one = A[0]*A[1]*A[l];
        two = A[0]*A[1]*A[2];
        three = A[l]*A[l-1]*A[l-2];
        
        if(one > two && one >three)
            return one;
        if(two > one && two > three)
            return two;
        return three;
    }
}