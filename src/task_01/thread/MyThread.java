package task_01.thread;

import java.io.File;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;


public class MyThread implements Runnable {

    @Override
    public void run() {
        int[] array = generateArray();
        String adress = "src\\resources\\arrays.txt";
        try {
            System.out.println("Поток " + Thread.currentThread().getName() + " запущен.");
            File file = new File(adress);
            file.createNewFile();
            Files.write(Paths.get(adress),
                    (Thread.currentThread().getName() + " сгенерировал массив " + Arrays.toString(array) + "\n").getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.APPEND);
            System.out.println("Поток " + Thread.currentThread().getName() + " закончил свою работу.");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * Метод генерирует массив из 10 псевдо случайных чисел
     *
     * @return возвращает полученный массив
     */
    private int[] generateArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }


}
