package kz.almasjss;

import java.util.HashMap;
//3 ms
public class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                result[0] = hashMap.get(target - nums[i]);
                result[1] = i;
                return result;
            }
        hashMap.put(nums[i] , i );
    }
        return result;
}

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        TwoSums t = new TwoSums();
        int arr[]=t.twoSum(nums,target);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}