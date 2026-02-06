package 灵茶山艾府.链表数回溯.链表;

import linkList.ListNode;

public class 删除链表中的节点 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
