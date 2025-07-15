package linkList.leetcode;

import linkList.ListNode;

public class LeetCode206 {

    // 反转链表(双指针方法)
    public ListNode reverseListNode(ListNode head){
        // 初始话两个指针
        ListNode cur = head;
        ListNode pre = null;
        ListNode temp = null;
        while (cur != null){
            // 定义一个临时指针，来保存cur的下一个节点
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
