package task_03.model;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (; ; ) {
            store.put(generateNumber());
        }
    }

    /**
     * Метод генерирует псевдо случайное чисел
     *
     * @return возвращает int
     */
    private int generateNumber() {
        int number = (int) (Math.random() * 100);
        return number;
    }

}
