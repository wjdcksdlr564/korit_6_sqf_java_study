package com.study.java_study.ch03_함수;

public class FunctionMain03 {
    public static void main(String[] args) {
        Function03 fx = new Function03();

        fx.fx01(1234, "정찬익", 26, "01036654872");

        Student student = new Student();
        student.studentCode = 1234;
        student.name = "정찬익";
        student.age = 26;
        student.phone = "01036654872";
    }
}