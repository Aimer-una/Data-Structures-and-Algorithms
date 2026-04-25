package hot100;

import linkList.ListNode;

public class 回文链表 {
    private ListNode left;
    public boolean isPalindrome(ListNode head) {
        left = head;
        return isPal(head);
    }

    public boolean isPal(ListNode right){
        if (right.next != null && !isPal(right.next)){
            return false;
        }

        if (left.val != right.val){
            return false;
        }
        left = left.next;
        return true;
    }
}
