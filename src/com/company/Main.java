package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        boolean res = (x == 10 || ++y == 20); // "Y" nece biti uvecan zato sto je prvi uslov ispunjen

        System.out.println(res);
        System.out.println(x);
        System.out.println(y);
    }
}
