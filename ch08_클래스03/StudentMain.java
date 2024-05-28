package com.study.java_study.ch08_클래스03;

public class StudentMain {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Student[] students = new Student[5];

        numbers[0] = 10;
        int[] nums = new int[3];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;

        Student[] student = new Student[3];
        student[0] = new Student(20240501, "정찬일", 26);
        student[1] = new Student(20240502, "정찬이", 27);
        student[2] = new Student(20240503, "정찬삼", 28);

        for(int i = 0; i < students.length; i++) {
            System.out.println("학번: " + students[i].getCode());
            System.out.println("이름: " + students[i].getName());
            System.out.println("나이: " + students[i].getAge());

        }
    }
}
