import java.util.*;


class Solution
{
    public int solution(int[] A)
    {

        if(A.length == 0)
            return -1;
        if(A.length == 1)
            return 0;


        int[] sortArray = new int[A.length];
        sortArray = A.clone();

        Arrays.sort(sortArray);
        int dominantRange = sortArray.length / 2;
        int dominantInteger = 0;
        boolean dominantFound = false;

        for(int i = 0; i < sortArray.length - dominantRange; i++)
        {

            if(sortArray[i] == sortArray[i + dominantRange])
            {
                dominantFound = true;
                dominantInteger = sortArray[i];
                break;
            }
        }

        if (!dominantFound)
        {
            return -1;
        }
        else
            for(int i = 0; i <= dominantRange; i++)
            {
                if(A[i] == dominantInteger)
                    return i;
            }
        return -1;
    }
}