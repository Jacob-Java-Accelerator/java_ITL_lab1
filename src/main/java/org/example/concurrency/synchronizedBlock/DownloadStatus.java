package org.example.concurrency.synchronizedBlock;

public class DownloadStatus {
    private int totalBytes;
    private final Object totalBytesLock= new Object();


    public void incrementTotalBytes(){
        synchronized (totalBytesLock) {
            totalBytes++;
        }
    }
    public int getTotalBytes() {
        return totalBytes;
    }



}
