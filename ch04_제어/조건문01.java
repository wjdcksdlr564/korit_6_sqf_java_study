package com.study.java_study.ch04_제어;

public class 조건문01 {
    public static void main(String[] args) {
        // 1. if, else if, else - 조건 해석이 들어가야함
        // 2. switch, case, default
        // 3. continue, break - 추가로 쓸수있는 애들

        if(true) {
            System.out.println("참입니다.");
        } else {
            System.out.println("거짓입니다.");
        }

        int num = 8;
        if(num % 2 == 0 && num % 10 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        if(num % 7 == 0) {
            System.out.println("2의 배수입니다.");
        } else if(num % 3 == 0) {
                System.out.println("3의 배수입니다.");
            } else if(num % 7 == 0) {
                    System.out.println("7의 배수입니다.");
            } else {
            System.out.println("2의 배수도 아니고 3의 배수도 아닙니고 7의 배수도 아닙니다.");
        }

    }
}
