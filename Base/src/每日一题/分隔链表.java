package 每日一题;

import linkList.ListNode;

public class 分隔链表 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        // 获取链表长度
        ListNode temp = head;
        while (temp != null){
            n++;
            temp = temp.next;
        }
        // 计算每个分组最少应该有多少个元素
        int quotient = n / k;
        // 计算要加的数量
        int remainder = n % k;
        ListNode[] parts = new ListNode[k];
        ListNode cur = head;
        for (int i = 0; i < k && cur != null; i++) {
            parts[i] = cur;
            int size = quotient + (i < remainder ? 1:0);
            for (int j = 1; j < size; j++) {
                cur = cur.next;
            }
            ListNode next = cur.next;
            cur.next = null;
            cur = next;
        }
        return parts;
    }
}
