package hot100;

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
