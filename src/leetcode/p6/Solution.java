package leetcode.p6;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().convertWithSpace("PAYPALISHIRING", 4));
        System.out.println(new Solution().convertWithSpace("AB", 1));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        StringBuilder answer = new StringBuilder();
        for (int i=0; i<numRows; i++) {
            for (int j=i; j<s.length(); j+=(numRows-1)*2) {
                answer.append(s.charAt(j));
                if ((i>0) && (i<numRows-1)) {
                    int index = j + (numRows-i-1) * 2;
                    if (index < s.length())
                        answer.append(s.charAt(index));
                }
            }
        }
        return answer.toString();
    }

    public String convertWithSpace(String s, int numRows) {
        if (numRows <= 1)
            return s;
        StringBuilder answer = new StringBuilder();
        int gapLength = (numRows-2) * 2 + 1;
        for (int i=0; i<numRows; i++) {
            for (int j=i; j<s.length(); j+=(numRows-1)*2) {
                // | col
                answer.append(s.charAt(j));
                // / cols
                for (int k=0; k<gapLength; k++)
                    answer.append(" ");
                if ((i>0) && (i<numRows-1)) {
                    int replaceCharIndex = j + (numRows-i-1)*2;
                    if (replaceCharIndex < s.length())
                        answer.setCharAt(answer.length()-i*2, s.charAt(replaceCharIndex));
                }
            }
            answer.append("\n");
        }
        return answer.toString();
    }

}
