package task_00.thread;

import java.util.Arrays;

public class MyThread implements Runnable {
    public MyThread() {
    }

    @Override
    public void run() {
        int[] array = generateArray();
        System.out.println("Максимальный элемент массива - " + findMaxInt(array) + " в потоке - " + Thread.currentThread().getName());
    }

    /**
     * Метод генерирует массив из 10 псевдо случайных чисел
     * @return возвращает полученный массив
     */
    private int[] generateArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    /**
     * Метод сортирует массив по возрастанию и находит максимальный элемент
     * @param array - принимаемый на вход массив
     * @return - возвращает максимальный элемент
     */
    private int findMaxInt(int[] array){
        int maxInt= 0;
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);
            maxInt = array[array.length-1];
        }
        return maxInt;
    }


}
