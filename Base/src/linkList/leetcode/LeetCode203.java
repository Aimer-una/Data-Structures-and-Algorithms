package linkList.leetcode;

import linkList.ListNode;

public class LeetCode203 {

    // 方法一：定义虚拟头节点
    public ListNode removeElementsMethod(ListNode head, int val) {
        // 设置一个虚拟的头结点
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    // 方法二：原链表删除元素
    public ListNode removeElements2(ListNode head, int val){
        while (head != null && head.val == val){
            head = head.next;
        }
        ListNode cur = head;
        while (cur != null && cur.next != null){
            if (cur.next.val == val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
}
