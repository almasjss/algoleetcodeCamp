package kz.almasjss;

import java.util.HashSet;
import java.util.Iterator;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i:nums){
            if (!set.add(i))
                set.remove(i);
        }
        Iterator<Integer> iterator = set.iterator();
        return iterator.next();
    }
}

