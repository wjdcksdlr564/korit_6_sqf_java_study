package com.study.java_study.ch09_클래스04;

public class StringContains {

    public static void main(String[] args) {
        String str = "법의 해석, 학리적 해석, 논리적 해석, 확장 해석";

        boolean isContains = "법의 해석, 학리적 해석, 논리적 해석, 확장 해석".contains("해석");

        System.out.println(isContains);
    }
}
