package org.example.concurrency.threadpool;

import java.util.concurrent.Callable;

public class ProcessImageTask implements Runnable {

    private final ImageProcessingStatus status;

    public ProcessImageTask(ImageProcessingStatus status) {
        this.status = status;
    }


    @Override
    public void run() {
        for(int i=0;i<10_000;i++){
            if(Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }
        System.out.println("Image Processing Complete: "+ Thread.currentThread());
    }


}
