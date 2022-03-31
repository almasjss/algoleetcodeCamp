package kz.almasjss;

import java.util.Arrays;

public class MergeSortedArray {

static boolean merge(int[] arr, int m, int[] b, int n){
    for (int i=0;i<n;i++){
        arr[i+m] = b[i];
    }
    Arrays.sort(b);
    return false;
}

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 ={1,2,3,0,0,0};
        int m=3;
        int n=3;
        int[] nums2={2,5,6};
        System.out.println(mergeSortedArray.merge(nums1,m,nums2,n));
    }
}
