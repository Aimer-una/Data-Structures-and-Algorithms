package hot100;

import linkList.ListNode;

public class 回文链表 {
    private ListNode left;
    public boolean isPalindrome(ListNode head) {
        left = head;
        return isPal(head);
    }

    public boolean isPal(ListNode right){
        if (right.next != null && !isPal(right.next)){
            return false;
        }

        if (left.val != right.val){
            return false;
        }
        left = left.next;
        return true;
    }

    public boolean isPalindrome1(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode head2 = reverseList(mid);
        while (head2 != null){
            if (head2.val != head.val){
                return false;
            }
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }

    // 876. 链表的中间结点
    private ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 206. 反转链表
    private ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
