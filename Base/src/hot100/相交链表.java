package hot100;

import linkList.ListNode;

import java.util.HashSet;
import java.util.Set;

public class 相交链表 {
    // Hash表
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while (temp != null){
            set.add(temp);
            temp = temp.next;
        }

        temp = headB;
        while (temp != null){
            if (set.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // 双指针
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while (p != q){
            if (p != null){
                p = p.next;
            }else {
                p = headB;
            }
            if (q != null){
                q = q.next;
            }else {
                q = headA;
            }
        }
        return p;
    }
}
