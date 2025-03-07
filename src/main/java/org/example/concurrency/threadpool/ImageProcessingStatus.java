package org.example.concurrency.threadpool;

import java.util.concurrent.atomic.AtomicInteger;

public class ImageProcessingStatus {
    private final AtomicInteger totalBytes=new AtomicInteger();

    public int getTotalBytes(){
        return totalBytes.get();
    }

    public  void incrementTotalBytes(){
        totalBytes.getAndIncrement();
    }
}
