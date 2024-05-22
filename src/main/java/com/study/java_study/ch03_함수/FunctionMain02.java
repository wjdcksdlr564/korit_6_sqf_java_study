package com.study.java_study.ch03_함수;

public class FunctionMain02 {

    public static void main(String[] args) {
        Function02 fx = new Function02();  // Function02라는 객체 생성, 실행되고 나면 인스턴스(주소 할당됨)

        fx.fx01(); // fx01을 호출, fx01은 Function02 안에 있음
        fx.fx02(10, 20); // fx02를 호출
        fx.fx02(86, 58); // fx02를 호출
        System.out.println(fx);
        System.out.println(fx.빙수만들기("딸기", 4) + " 주문 완료");
        String 빙수 = fx.빙수만들기("초코", 5);
        System.out.println(빙수);
    }
}
