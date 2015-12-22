package leetcode.p2;

import java.math.BigInteger;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {

    public static void main(String args[]) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode answer = new Solution().addTwoNumbers(l1, l2);

        for (ListNode node=answer; node!=null; node=node.next)
            System.out.println(node.val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder num1Builder = new StringBuilder();
        StringBuilder num2Builder = new StringBuilder();
        for (ListNode node=l1; node!=null; node=node.next)
            num1Builder.append(node.val);
        for (ListNode node=l2; node!=null; node=node.next)
            num2Builder.append(node.val);
        BigInteger num1 = new BigInteger(num1Builder.reverse().toString());
        BigInteger num2 = new BigInteger(num2Builder.reverse().toString());
        BigInteger sum = num1.add(num2);
        String sumString = new StringBuilder(sum.toString()).reverse().toString();
        char[] numArray = sumString.toCharArray();
        ListNode result = new ListNode(numArray[0]-'0');
        for (int i=1; i<numArray.length; i++) {
            ListNode target = result;
            while (target.next != null)
                target = target.next;
            target.next = new ListNode(numArray[i]-'0');
        }
        return result;
    }
}
