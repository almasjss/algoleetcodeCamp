package kz.almasjss;

public class KadaneAlgorithm {
    public int maxSubArray(int[] nums){
        int maxSoFar = Integer.MIN_VALUE;
        int maxEnd = 0;
        for (int i:nums){
            maxEnd = maxEnd+i;
            maxEnd=Integer.max(maxEnd,i);
            maxSoFar = Integer.max(maxSoFar,maxEnd);
        }
        return maxSoFar;
    }

}
