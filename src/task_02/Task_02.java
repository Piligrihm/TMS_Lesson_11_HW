package task_02;


import task_02.thread.MyThread;

public class Task_02 {
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
