package linkList.leetcode;

import linkList.ListNode;

public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 定义一个虚拟头节点
        ListNode dummy = new ListNode();
        dummy.next = head;

        // 定义两个快慢指针.并且都在虚拟头节点的位置
        ListNode fastPointer = dummy;
        ListNode slowPointer = dummy;

        // 快指针至少比慢指针快n+1个节点
        // 为什么是n+1呢，因为只有这样同时移动的时候slow才能指向删除节点的上一个节点（方便做删除操作）
        for (int i = 0; i <=n ; i++) {
            fastPointer = fastPointer.next;
        }

        // 快慢指针一起动
        while (fastPointer != null){
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        // 慢指针指向下一个节点的下一个节点，删除完成
        slowPointer.next = slowPointer.next.next;
        return dummy.next;
    }

}
