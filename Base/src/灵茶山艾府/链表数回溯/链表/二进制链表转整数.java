package 灵茶山艾府.链表数回溯.链表;

import linkList.ListNode;

public class 二进制链表转整数 {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        while (head != null){
            ans = ans * 2 + head.val;
            head = head.next;
        }
        return ans;
    }
}
