package task_03.model;

import java.util.LinkedList;
import java.util.List;

public class Store {
    LinkedList<Integer> list = new LinkedList<>();
    private int count = 0;

    /**
     * Метод добавляет число в хранилище
     * @param number
     */
    public synchronized void put(int number) {
        while (count >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        list.add(number);
        count++;

        System.out.println("Поток добавил значение в хранилище");
        System.out.println("Текущий размер хранилища: " + count);

        notify();
    }

    /**
     * Метод получает значение из хранилища
     */
    public synchronized void get() {
        while (count < 1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        list.removeFirst();
        count--;

        System.out.println("Поток получил значение из хранилища");
        System.out.println("Текущий размер хранилища: " + count);

        notify();
    }

}
