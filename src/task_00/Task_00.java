package task_00;

import task_00.thread.MyThread;

public class Task_00 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
    }
}
