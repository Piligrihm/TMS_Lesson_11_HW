package task_04;

import task_04.thread.MySleepyThread;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        startProgram();

    }

    private static void startProgram() {
        Scanner scanner = new Scanner(System.in);
        try {
            int timeMillis;
            System.out.println("Введите число секунд...");
            for (; ; ) {
                timeMillis = scanner.nextInt();
                if (timeMillis == -1) {
                    System.out.println("Больше вводить ничего не нужно!");
                    break;
                } else if (timeMillis < 0) {
                    System.out.println("Внимание. Число не может быть отрицательным! Попробуйте снова...");
                } else {
                    MySleepyThread mySleepyThread = new MySleepyThread(timeMillis);
                }
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
