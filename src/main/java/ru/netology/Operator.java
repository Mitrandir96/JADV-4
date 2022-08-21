package ru.netology;

public class Operator extends Thread{

    String name;
    private static final int SpeedOfOperator = 500;

    ATC atc;

    public Operator(String name, ATC atc) {
        this.name = name;
        this.atc = atc;
    }

    @Override
    public void run() {
        for (int i = 0; i < atc.generateOfAtc; i++) {
            try {
                System.out.println("Оператор " + name + " обработал " + atc.calls.take());
                Thread.sleep(SpeedOfOperator);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
