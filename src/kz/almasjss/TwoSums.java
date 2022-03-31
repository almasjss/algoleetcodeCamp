package kz.almasjss;

public class TwoSums {
    public int[] twoSum(int[] nums,int target){
        int n = nums.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        TwoSums twoSums  = new TwoSums();
        int [] arr={2,7,11,15};
        int target = 9;
        System.out.println(twoSums.twoSum(arr,target).toString());

    }
}
