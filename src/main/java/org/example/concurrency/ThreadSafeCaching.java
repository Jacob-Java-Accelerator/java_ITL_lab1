package org.example.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeCaching<K,V> {

    private final ConcurrentHashMap<Integer,V> cacheStore= new ConcurrentHashMap<>();
    private final AtomicInteger key= new AtomicInteger();
    public  void  add(V v){
        int currentKey=key.getAndIncrement();
        cacheStore.put(currentKey,v);

    }

    public void print(){
        for(var value: cacheStore.entrySet()){
            System.out.println(value.getValue());
        }
    }

}
