package org.example.collections.threadsafecache;    

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Cache {
    private final ConcurrentHashMap<Integer, String> cacheStore = new ConcurrentHashMap<>();
    private final AtomicInteger keyGenerator = new AtomicInteger();


    public void add(String value) {
        int key = keyGenerator.getAndIncrement();
        cacheStore.put(key, value);
    }

    public void add(int key, String value) {
        cacheStore.put(key, value);
    }

    public String get(int key) {
        return cacheStore.get(key);
    }

    public void remove(int key) {
        cacheStore.remove(key);
    }


    public boolean containsKey(int key) {
        return cacheStore.containsKey(key);
    }

    public void print() {
        cacheStore.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
