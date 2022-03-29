package kz.almasjss;

import java.util.logging.Logger;

public class MaximumSubarray {

}
class Solution2{
    public int maxSubArray(int[] nums){
        int n =nums.length;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n-1;i++){
            int currentSum = 0;
            for (int j=i;j<=n-1;j++){
                currentSum+=nums[j];
                if (currentSum>max){
                    max = currentSum;
                }
            }
        }
        return max;
    }

}
