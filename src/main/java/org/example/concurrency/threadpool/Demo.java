package org.example.concurrency.threadpool;

import java.util.concurrent.Executors;

public class Demo {

    public static void show() {
        var status = new ImageProcessingStatus();
        var executor = Executors.newFixedThreadPool(2);

        try {
            for (int i = 0; i < 10; i++) {
                executor.submit(new ProcessImageTask(status));
            }
        } finally {
            executor.shutdown();
        }

        try {
            executor.awaitTermination(Long.MAX_VALUE, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total Bytes Processed: " + status.getTotalBytes());
    }
}
