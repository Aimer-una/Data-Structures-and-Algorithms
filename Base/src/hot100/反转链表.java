package hot100;

import linkList.ListNode;


public class 反转链表 {
    // 迭代
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    // 递归
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode revHead = reverseList(head.next);
        ListNode tail = head.next;
        tail.next = head;
        head.next = null;
        return revHead;
    }

}
