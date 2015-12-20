// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution 
{
    public int[] solution(String S, int[] P, int[] Q) 
    {
        // write your code in Java SE 8
        int M = P.length;
        char[] dna = S.toCharArray();
        
        // Map DNA
        HashMap<Character, Integer> dnaTypes = new HashMap<Character, Integer>();
        dnaTypes.put('A', 1);
        dnaTypes.put('C', 2);
        dnaTypes.put('G', 3);
        dnaTypes.put('T', 4);
        
        int[] minValues = new int[M];
        int currentMin = 0;
        int currentMinQuery = 0;
        int currentMaxQuery = 0;
        
        for(int i = 0; i < M; i++)
        {
            currentMinQuery = P[i];
            currentMaxQuery = Q[i];
            for (int j = currentMinQuery; j <= currentMaxQuery; j++)
            {
                currentMin = dnaTypes.get(dna[j]);
                if (currentMin == 1)
                    break;
            }
            minValues[i] = currentMin;
            currentMin = 0;
        }
        return minValues;
    }
}