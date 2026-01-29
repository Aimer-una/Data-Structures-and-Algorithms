package 灵茶山艾府.链表数回溯.链表;

import linkList.ListNode;

public class 找出临界点之间的最小和最大距离 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = 0;
        int firstCriticalIndex = -1;
        int prevCriticalIndex = -1;
        int currCriticalIndex = -1;
        ListNode pre = head;
        ListNode cur = head.next;
        int index = 1;
        while (cur.next != null){
            ListNode next = cur.next;
            if (cur.val > next.val && cur.val > pre.val || cur.val < next.val && cur.val < pre.val){
                if (firstCriticalIndex < 0){
                    firstCriticalIndex = index;
                }
                prevCriticalIndex = currCriticalIndex;
                currCriticalIndex = index;
                if (prevCriticalIndex >= 0){
                    minDistance = Math.min(minDistance,currCriticalIndex - prevCriticalIndex);
                    maxDistance = Math.max(maxDistance,currCriticalIndex - firstCriticalIndex);
                }
            }
            pre = cur;
            cur = next;
            index++;
        }
        if (minDistance <= maxDistance){
            return new int[]{minDistance,maxDistance};
        }
        return new int[]{-1,-1};
    }
}
