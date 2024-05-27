package com.study.java_study.ch04_제어;

public class Gugudan {
    public static void main(String[] args) {
        /*
        [2단]
        2 x 1 = 2
        2 x 2 = 4
        ...
        2 x 9 = 18

        ...

        [9단]
        9 x 1 = 9
        ...
        9 x 9 = 81
         */
        System.out.println("[구구단]");

        for(int i = 1; i < 10; i++) {
            System.out.println("[" + i + "단]");
            for(int j = 1; j <10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }
    }
}
