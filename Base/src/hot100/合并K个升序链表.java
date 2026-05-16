package hot100;

import linkList.ListNode;

import java.util.PriorityQueue;

public class 合并K个升序链表 {
    // 暴力
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        for (int i = 0; i < lists.length; i++) {
            ans = mergeTwoLists(ans,lists[i]);
        }
        return ans;
    }

    // 合并两个链表
    private ListNode mergeTwoLists(ListNode list1,ListNode list2){
        if (list1 == null || list2 == null){
            return list1 != null ? list1:list2;
        }
        ListNode dummy = new ListNode();
        ListNode pre = dummy;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                pre.next = list1;
                list1 = list1.next;
            }else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        pre.next = list1 == null ? list2:list1;
        return dummy.next;
    }

    // 最小堆
    public ListNode mergeKListsPriority(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val - b.val);
        for (ListNode head : lists) {
            if (head != null){
                pq .offer(head); // 添加每个链表的头节点
            }
        }

        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while (!pq.isEmpty()){ // 循环直到堆为空
            ListNode node = pq.poll(); // 剩余节点中的最小节点
            if (node.next != null){ // 下一个节点不为空
                pq.offer(node.next); // 下一个节点有可能是最小节点，入堆
            }
            cur.next = node; // 把 node 添加到新链表的末尾
            cur = cur.next; // 准备合并下一个节点
        }
        return dummy.next;
    }
}
