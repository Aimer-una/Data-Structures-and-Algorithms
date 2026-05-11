package hot100;


import org.w3c.dom.Node;

public class 随机链表的复制 {
    public Node copyRandomList(Node head) {
        // 复制每个节点，把新节点直接插到原节点的后面
       for (Node cur = head; cur != null; cur = cur.next.next){
            cur.next = new Node(cur.val,cur.next);
       }

       // 遍历交错链表中的原链表节点
       for (Node cur = head; cur != null; cur =  cur.next.next){
            if (cur.random != null){
                // 要复制的 random 是 cur.random 的下一个节点
                cur.next.random = cur.random.next;
            }
       }

        // 把交错链表分离成两个链表
       Node dummy = new Node(0);
       Node tail = dummy;
       for (Node cur = head; cur != null; cur = cur.next,tail = tail.next){
           Node copy = cur.next; // 新节点
           tail.next = copy; // 把新节点插在 tail 的后面，构建新的链表
           cur.next = copy.next; // 恢复原节点的 next
       }
       return dummy.next;
    }
}
