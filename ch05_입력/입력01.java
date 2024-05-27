package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력01 {
         /*
       next() 메소드 특징
       1. 공백과 줄바꿈(엔터)은 무시한다.
       2. 버퍼를 사용한다. // 공간에 값을 입력하고 엔터를 친다 -> 하나의 버퍼이다.
       3. 버퍼가 채워지지 않고 다음 버퍼를 위해 대기하는 시간을 버퍼링이라 한다.
       4. 엔터를 치는 것은 버퍼의 끝을 의미한다.
         */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        String a = scanner.next();
        System.out.println("에이:" + a);

        System.out.print("b: ");
        String b = scanner.nextLine();
        System.out.println("비:" + b);
    }
}
