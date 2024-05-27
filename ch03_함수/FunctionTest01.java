package com.study.java_study.ch03_함수;

public class FunctionTest01 {
    int fx01_1() {
        return 10;
    }
    int fx01_2() {
        return 20;
    }
    void printResult() {
        FunctionTest02 functionTest02 = new FunctionTest02();
        System.out.println(functionTest02.getAddData(fx01_1(), fx01_2()));
        //functionTest02 안에 있는 getAdddata의 값 출력
    }   // fx01_1과 fx01_2는 같은 클래스 안에 있어서 참조x (같은 주소에 있음)
        // getAddData의 값이 test02에 있기에 test02로 전달
        // test02에서 값을 리턴받음, 30이라는 값이 왔고, 프린트 스크린 호출은 main에서 했기에 값을 main으로 리턴
}       // 이 main문을 끝내는 것이 목표
