package task_03.model;

public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (; ; ) {
            store.get();
            try {
                Thread.sleep(waitTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * Метод генерирует псевдо случаное число от 0 до 1000
     *
     * @return возвращает int
     */
    private int waitTime() {
        int num = (int) (Math.random() * 1000);
        return num;
    }
}
