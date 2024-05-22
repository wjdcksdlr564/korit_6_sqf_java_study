package com.study.java_study.ch03_함수;

public class Function02 {
    //매개변수 x, 리턴 x 리턴값에 따라 정해지는 함수와는 다르게 이 함수는 값이 없다
    void fx01() {
        System.out.println("fx01 함수 호출");
    }
    //매개변수 o, 리턴 x // 리턴 x -> void 시작
    void fx02(int num1, int num2) {        // int num1, int num2 는 선언(작명), 니 이름은 앞으로 num이여
        System.out.println("fx02 함수 호출");
        System.out.println("num1: " + num1);    // num1: 숫자 이런식으로 출력
        System.out.println("num2: " + num2);    // num2: 숫자 이런식으로 출력
    }
    String 빙수만들기(String 재료, int count) {
        return 재료 + "빙수 " + count + "개";
    }
}