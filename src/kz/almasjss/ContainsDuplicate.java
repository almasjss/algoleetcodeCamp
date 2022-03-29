package kz.almasjss;

import java.util.HashSet;
//First task in Data Structures
public class ContainsDuplicate {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {1,2,35,55,35};
        System.out.println(solution.containsDuplicate(nums));
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }
        int len = nums.length;
        /*Хеш-таблица представляет такую структуру данных, в которой все объекты имеют уникальный ключ или хеш-код. Данный ключ позволяет уникально идентифицировать объект в таблице
        *
        * */
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            if (!set.add(nums[i])) {
                if (!set.add(nums[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}

