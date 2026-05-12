package 灵茶山艾府.链表数回溯.链表;

import linkList.ListNode;

public class 链表的中间结点 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
