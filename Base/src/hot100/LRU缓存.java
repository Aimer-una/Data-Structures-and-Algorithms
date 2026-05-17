package hot100;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRU缓存 {
}
// 标准库
class LRUCache {
    private final int capacity;
    private final Map<Integer,Integer> cache = new LinkedHashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer value = cache.remove(key);
        if (value != null){
            cache.put(key,value);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.remove(key) != null){
            cache.put(key,value);
            return;
        }
        // key 不在 cache 中，那么就把 key 插入 cache，插入前判断 cache 是否满了
        if (cache.size() == capacity){
            Integer eldestKey = cache.keySet().iterator().next();
            cache.remove(eldestKey); // 移除最久未使用 key
        }
        cache.put(key,value);
    }
}

// 手写双向链表
class LRUCacheWrite {

    private static class Node{
        int key,value;
        Node prev,next;

        Node(int k,int v){
            key = k;
            value = v;
        }
    }
    private final int capacity;
    private final Node dummy = new Node(0,0); // 哨兵节点
    private final Map<Integer,Node> keyToNode = new HashMap<>();

    public LRUCacheWrite(int capacity) {
        this.capacity = capacity;
        dummy.prev = dummy;
        dummy.next = dummy;
    }

    public int get(int key) {
        Node node = getNode(key); // getNode 会把对应节点移到链表头部
        return node != null ? node.value : -1;
    }

    public void put(int key, int value) {
        Node node = getNode(key); // getNode 会把对应节点移到链表头部
        if (node != null){ // 有这本书
            node.value = value;
            return;
        }
        node = new Node(key,value); // 新书
        keyToNode.put(key,node);
        pushFront(node); // 放到最上面
        if (keyToNode.size() > capacity){ // 书太多了
            Node backNode = dummy.prev;
            keyToNode.remove(backNode.key);
            remove(backNode); // 去掉最后一本书
        }
    }

    // 获取key对应的节点，同时把该节点移动到链表头部
    private Node getNode(int key){
        if (!keyToNode.containsKey(key)){ // 没有这本书
            return null;
        }
        Node node = keyToNode.get(key); // 有没这本书
        remove(node); // 把这本书抽出来
        pushFront(node); // 把这本书放到最上面
        return node;
    }

    // 删除一个节点（抽出一本书）
    private void remove(Node x){
        x.prev.next = x.next;
        x.next.prev = x.prev;
    }


    // 在链表头添加一个节点（把一本书放到最上面）
    private void pushFront(Node x){
        x.prev = dummy;
        x.next = dummy.next;
        x.prev.next = x;
        x.next.prev = x;
    }
}
