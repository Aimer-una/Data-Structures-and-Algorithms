package hot100;

import linkList.ListNode;

public class 合并两个有序链表 {
    // 迭代
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
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
        pre.next = list1 == null? list2 : list1;
        return dummy.next;
    }

    // 递归
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }else if (list2 == null){
            return list1;
        }else if (list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else {
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}
