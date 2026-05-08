package hot100;

import linkList.ListNode;

public class K个一组翻转链表 {
    public ListNode reverseKGroup(ListNode head, int k) {
        // 统计节点个数
        int n = 0;
        for (ListNode cur = head;  cur != null ; n++) {
            cur = cur.next;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode p0 = dummy;
        ListNode pre = null;
        ListNode cur = head;
        
        // k个一组处理
        for (; n >= k ; n-=k) {
            for (int i = 0; i < k; i++) {
                ListNode nxt = cur.next;
                cur.next = pre;
                pre = cur;
                cur = nxt;
            }

            ListNode nxt = p0.next;
            p0.next.next = cur;
            p0.next = pre;
            p0 = nxt;
        }
        return dummy.next;
    }
}
