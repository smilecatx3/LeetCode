package leetcode.p3;

import java.util.HashMap;
import java.util.Map;

// O(n)
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int start = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && (map.get(c) >= start)) {
                max = Math.max(max, i-start);
                start = map.get(c) + 1;
            }
            map.put(c, i);
        }
        return Math.max(max, s.length()-start);
    }
}
