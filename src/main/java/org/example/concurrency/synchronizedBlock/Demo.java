package org.example.concurrency.synchronizedBlock;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void show(){
        DownloadStatus status= new DownloadStatus();
        List<Thread> threads= new ArrayList<>();


        for(int i=0;i<10;i++){
            Thread thread=new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for(Thread thread: threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(status.getTotalBytes());
    }
}
