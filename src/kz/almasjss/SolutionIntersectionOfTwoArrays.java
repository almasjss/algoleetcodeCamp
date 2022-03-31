package kz.almasjss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionIntersectionOfTwoArrays {
public int[]intersect(int[] nums1,int[] nums2) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i : nums1) {
        if (map.containsKey(i)) {
            map.put(i, map.get(i) + (i) + 1);
        } else {
            map.put(i, 1);
        }

    }

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i:nums2){
        if (map.containsKey(i)){
            if (map.get(i)>1){
                map.put(i,map.get(i)-1);
            }else{
                map.remove(i);
            }
            list.add(i);
        }
    }
    int[] result =  new int[list.size()];
    int i = 0;
    while (i<list.size()){
        result[i] = list.get(i);
        i++;
    }
    return result;
}

    public static void main(String[] args) {
        SolutionIntersectionOfTwoArrays solutionIntersectionOfTwoArrays = new SolutionIntersectionOfTwoArrays();
        int nums1 [] = {1,2,3,3,4,4};
        int nums2 [] = {1,2,3,3,4,5};
        int []res = solutionIntersectionOfTwoArrays.intersect(nums1,nums2);
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]);
        }
}
}

