package 灵茶山艾府.链表数回溯.链表;

import linkList.ListNode;

public class 合并零之间的节点 {
    public ListNode mergeNodes(ListNode head) {
        ListNode tail = head;
        for(ListNode cur = tail.next; cur.next != null; cur = cur.next){
            if (cur.val != 0){
                tail.val += cur.val;
            }else {
                tail = tail.next;
                tail.val = 0;
            }
        }
        tail.next = null;
        return head;
    }
}
