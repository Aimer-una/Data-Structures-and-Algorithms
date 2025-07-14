package linkList.leetcode;

import linkList.ListNode;

public class LeetCode707 {
    //size存储链表元素的个数
    private int size;

    public LeetCode707() {
        this.size = 0;
        this.head = new ListNode(0);
    }

    //注意这里记录的是虚拟头结点
    private ListNode head;
    // 获取第index个节点的数值，注意index是从0开始的，第0个节点就是虚拟头结点
    public int get(int index){
        if (index < 0 || index >= size ){
            return -1;
        }
        ListNode cur = head;
        // 第0个节点是虚拟头节点，所以查找第 index+1 个节点
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    // 在链表头部插入节点
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        size++;
    }

    // 在链表尾部添加节点
    public void addAtTail(int val){
        ListNode newNode = new ListNode(val);
        ListNode cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = newNode;
        size++;
    }

    // 在第 index 个节点之前插入一个新节点，例如index为0，那么新插入的节点为链表的新头节点。
    // 如果 index 等于链表的长度，则说明是新插入的节点为链表的尾结点
    // 如果 index 大于链表的长度，则返回空
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size ){
            return;
        }
        ListNode cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = cur.next;
        cur.next = newNode;
        size++;
    }

    // 删除某一个节点
    public void deleteAtIndex(int index){
        if (index < 0 || index > size){
            return;
        }
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }
}
