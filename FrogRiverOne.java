class Solution 
{
    public int solution(int X, int[] A) 
    {
        // write your code in Java SE 8
        
        boolean[] leaves = new boolean[X]; 
        
        
        for (int i = 0; i < A.length; i++)
        {
            if(leaves[A[i]-1] == false)
                leaves[A[i]-1] = true;
            if(AllLeavesFallen(leaves))
                return i;
        }
        
        return -1;
    }

    private boolean AllLeavesFallen(boolean[] leaves)
    {   
        for(int i = 0; i < leaves.length; i++)
        {
            if(leaves[i] == false)
                return false;
        }
        return true;
    }
}}