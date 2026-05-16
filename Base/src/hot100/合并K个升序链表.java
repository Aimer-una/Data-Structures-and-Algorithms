package hot100;

import linkList.ListNode;

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
}
