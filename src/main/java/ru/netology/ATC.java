package ru.netology;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ATC extends Thread {

    final int generateOfAtc = 60;
    private static final int sleepAtc = 100;

    BlockingQueue calls = new ArrayBlockingQueue(20);


    @Override
    public void run() {
        for (int i = 0; i < generateOfAtc; i++) {
            try {
                calls.put("Звонок № " + (i+1));
                System.out.println("Поступил звонок № " + (i+1));
                Thread.sleep(sleepAtc);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
