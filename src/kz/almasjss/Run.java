package kz.almasjss;

public class Run {
    public static void main(String[] args) {
       int arr[] = {2,2,1}; //6
//        Solution2 maxi = new Solution2();
//        System.out.println(maxi.maxSubArray(arr));
//        KadaneAlgorithm kadaneAlgorithm = new KadaneAlgorithm();
//        System.out.println(kadaneAlgorithm.maxSubArray(arr));
   SingleNumber single = new SingleNumber();
  int res = single.singleNumber(arr);
        System.out.println(res);
    }
}
