package linkList.leetcode;

import linkList.ListNode;

public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        // 定义两个快慢指针
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        //
        while (fastPointer != null && fastPointer.next != null){
            // 快指针每次移动两个节点，慢指针移动一个
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            // 快慢指针相遇(说明找到了环)
            if (fastPointer == slowPointer){
                // 记录相遇位置和起始位置
                ListNode meet = fastPointer;
                ListNode begin = head;
                // 起始位置和快慢指针相遇位置再继续走
                // 如果相遇则该节点就是入口
                while (meet != begin){
                    meet = meet.next;
                    begin = begin.next;
                }
                return meet;
            }
        }
        return null;
    }
}
