package leetcode.p1;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// O(n)
public class Solution {

    public static void main(String[] args) {
        int[] array = {0,4,3,0};
        int target = 0;
        int[] ans = new Solution().twoSum(array, target);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        for (int i=0; i<nums.length; i++) {
            List<Integer> list = map.get(nums[i]);
            if (map.containsKey(nums[i]))
                list.add(i+1);
            else {
                list = new LinkedList<>();
                list.add(i+1);
                map.put(nums[i], list);
            }
        }

        for (int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                List<Integer> list = map.get(diff);
                if (list.size() > 1)
                    return new int[] {i+1, list.get(1)};
                else if (nums[i] != diff)
                    return new int[] {i+1, list.get(0)};
            }
        }

        return null;
    }
}
