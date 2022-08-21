package ru.netology;



public class Main {
    public static final int CALL = 60;

    public static void main(String[] args) {

        ATC atc = new ATC();
        atc.start();
        new Operator("Леонид", atc).start();
        new Operator("Петр", atc).start();


    }
}