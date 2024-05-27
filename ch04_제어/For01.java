package com.study.java_study.ch04_제어;

public class For01 {

    public static void main(String[] args) {
        for(int i = 0; i < 10000; i++) { //int i = 0 -> 초기문, i < 10000 -> 반복문
            System.out.println(i + 1);
        }
        for(int i = 0; i < 10000; i++) {
            System.out.println(10000 - i);
        }
    }

}
