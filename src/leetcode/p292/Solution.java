package leetcode.p292;

public class Solution {
    public boolean canWinNim(int n) {
        return (n < 4) || (n%4 != 0);
    }
}

/*
4 (lose)
=> 1,3 | 2,2 | 3,1

5 (win)
=> 1,4(win) | 2,3(lose) | 3,2(lose)

6 (win)
=> 1,5(lose) | 2,4(win) | 3,3(lose)

7 (win)
=> 1,6(lose) | 2,5(lose) | 3,4(win)

8 (lose)
=> 1,7(lose) | 2,6(lose) | 3,5(lose)

9 (win)
=> 1,8(win) | 2,7(lose) | 3,6(lose)

10 (win)
=> 1,9(lose) | 2,8(win) | 3,7(lose)

11 (win)
=> 1,10(lose) | 2,9(lose) | 3,8(win)

12 (lose)
=> 1,11 (lose) | 2,10(lose) | 3,9(lose)
*/