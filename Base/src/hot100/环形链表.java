package hot100;

import linkList.ListNode;

import java.util.HashSet;
import java.util.Set;

public class 环形链表 {
    // Hash表
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode cur = head;
        while (cur != null){
            if (set.contains(cur)) {
                return true;
            }
            set.add(cur);
            cur = cur.next;
        }
        return false;
    }

    // 快慢指针
    public boolean hasCycle1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
