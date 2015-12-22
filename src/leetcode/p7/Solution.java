package leetcode.p7;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().reverse2(-2147483648));
    }

    // 8ms
    public int reverse(int x) {
        StringBuilder str = new StringBuilder(String.valueOf(x)).reverse();
        if (str.charAt(str.length()-1) == '-')
            str.deleteCharAt(str.length()-1).insert(0, '-');
        try {
            return Integer.valueOf(str.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // 4ms
    public int reverse2(int x) {
        long n = Math.abs((long)x);
        int size = (int)Math.log10(n) + 1;
        long answer = 0;
        long pow = (long)Math.pow(10, size-1);
        for (long i=1, j=pow; i<=pow; i*=10, j/=10)
            answer += ((n / j) - ((n / (j * 10)) * 10)) * i;
        if (x < 0) {
            answer *= -1;
            answer = (answer < -2147483648) ? 0 : answer;
        } else {
            answer = (answer > 2147483647) ? 0 : answer;
        }
        return (int) answer;
    }
}
