package task_01;

import task_01.thread.MyThread;

public class Task_01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
    }
}
