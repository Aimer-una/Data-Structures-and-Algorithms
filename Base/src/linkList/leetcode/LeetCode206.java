package linkList.leetcode;

import linkList.ListNode;

public class LeetCode206 {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        reverseRecursion(head,null);
    }

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

    // 反转链表(递归)
    public static ListNode reverseRecursion(ListNode cur , ListNode pre){
        if (cur == null) return pre;
        // 定义一个临时指针，来保存cur的下一个节点
        ListNode temp = null;
        temp = cur.next;
        cur.next = pre;
       return reverseRecursion(temp,cur);
    }
}
