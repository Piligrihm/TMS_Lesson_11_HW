package task_02.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread implements Runnable {

    @Override
    public synchronized void run() {
        showNameAndCurrTime();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод выводит в консоль имя текущего потока и текущую дату
     */
    private void showNameAndCurrTime() {
        String name = Thread.currentThread().getName();
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss a");
        System.out.println("Поток " + name + " Текущее время " + formatForDateNow.format(dateNow));
    }
}
