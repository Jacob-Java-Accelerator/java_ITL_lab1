package org.example.concurrency.synchronizedBlock;

public class DownloadFileTask implements Runnable{
    private DownloadStatus status;
    public DownloadFileTask(DownloadStatus status) {
        this.status=status;
    }

    @Override
    public void run() {
        for(int i=0;i<10_000;i++){
            if(Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }
        System.out.println("Download Complete: "+ Thread.currentThread());
    }
}
