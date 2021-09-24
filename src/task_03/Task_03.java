package task_03;

import task_03.model.Consumer;
import task_03.model.Producer;
import task_03.model.Store;

public class Task_03 {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
