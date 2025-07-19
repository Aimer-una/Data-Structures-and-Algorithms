package linkList.leetcode;

import linkList.ListNode;

public class LeetCode24 {
    public ListNode swapPairs(ListNode head) {
        // 定义一个虚拟头节点
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = dummyHead;
        // 1和3的指针方向没了，所以加入临时节点
        ListNode temp1;
        ListNode temp2;
        while (cur.next != null && cur.next.next != null){
            // 定义一个临时节点来存储第一个节点
            temp1 = cur.next;
            // 定义一个临时节点来存储第三个节点
            temp2 = cur.next.next.next;
            // 虚拟头节点指向节点2
            cur.next = cur.next.next;
            // 节点2指向节点1
            cur.next.next = temp1;
            // 节点1指向节点3
            temp1.next = temp2;
            cur = cur.next.next;
        }
        return dummyHead.next;
    }
}
