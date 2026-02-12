package 灵茶山艾府.链表数回溯.链表;

import linkList.ListNode;
//
public class 从链表中移除节点 {
    public ListNode removeNodes(ListNode head) {
        if (head.next == null){
            return head;
        }
        ListNode node = removeNodes(head.next);
        if (node.val > head.val){
            return node;
        }
        head.next = node;
        return head;
    }
}
