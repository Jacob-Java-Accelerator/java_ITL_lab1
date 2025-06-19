package org.example.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeCaching<K, V> {
    private final ConcurrentHashMap<K, V> cacheStore = new ConcurrentHashMap<>();
    private final AtomicInteger keyGenerator = new AtomicInteger();

    public K add(V value) {
        K key = (K) Integer.valueOf(keyGenerator.getAndIncrement());
        cacheStore.put(key, value);
        return key;
    }

    public void print() {
        for (var entry : cacheStore.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {
        ThreadSafeCaching<Integer, String> cache = new ThreadSafeCaching<>();
        cache.add("353");
        cache.print();
    }
}

