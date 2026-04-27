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
}
