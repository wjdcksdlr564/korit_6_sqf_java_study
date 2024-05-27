package com.study.java_study.ch04_제어;

public class 스위치 {
    public static void main(String[] args) {
        String grade = "A"; // 찾아가서 이 위치(" ")에서 부터 표현함 (바로가기 느낌) ex) C를 넣으면 C부터 시작

        switch (grade) {
            case "A":
                System.out.println("A등급");
            case "B":
                System.out.println("B등급");
            case "C":
                System.out.println("C등급");
                break; // switch case는 break를 만나는 순간 멈춘다, 원하는 곳에 멈추고 싶을때 쓰면 된다.
            case "D":
                System.out.println("D등급");
            case "F":
                System.out.println("F등급");
        }
    }
}
