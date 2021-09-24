package task_04.thread;

import java.util.SortedMap;

public class MySleepyThread implements Runnable{
    private long timeMillis;
    private Thread testThread;

    public MySleepyThread(Thread testThread) {
        this.testThread = testThread;
    }

    public MySleepyThread(long timeMillis) {
        testThread = new Thread(this);
        this.timeMillis = timeMillis;
        testThread.start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(timeMillis);
            System.out.println("Я поток " + Thread.currentThread().getName() + ". Я спал: " + timeMillis + " сек");
            System.out.println("Введите число секунд...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
