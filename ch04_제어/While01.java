package com.study.java_study.ch04_제어;

import java.util.Random;
import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int num = random.nextInt(10);  // 0 ~ 9까지 중 랜덤한 값을 가지고 옴
                                       // + 1을 하면 -> 1 ~ 10까지의 랜덤값

        while(true) {
            System.out.print("입력: ");
            int data = scanner.nextInt();
            if(num == data) {
                System.out.println("정답은: " + data + "입니다.");
                break;
            }
            System.out.println("틀렸습니다. 다시 입력하세요.");
        }

    }
}
