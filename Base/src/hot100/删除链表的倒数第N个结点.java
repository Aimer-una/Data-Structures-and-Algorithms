package hot100;

import linkList.ListNode;

public class 删除链表的倒数第N个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode right = dummy;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        ListNode left = dummy;
        while (right.next != null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }
}
