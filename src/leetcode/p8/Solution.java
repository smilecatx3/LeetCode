package leetcode.p8;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("2"));
    }

    public int myAtoi(String str) {
        boolean start = false;
        StringBuilder num = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isWhitespace(ch))
                start = true;
            if (start) {
                if (!Character.isDigit(ch) && ch != '-')
                    return 0;
                num.append(ch);
            }
        }
        try {
            System.out.println(num.toString());
            return new BigInteger(num.toString()).intValue();
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
