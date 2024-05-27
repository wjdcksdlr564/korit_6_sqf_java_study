package com.study.java_study.ch01_변수의_자료형;

public class Operation01 {
    public static void main(String[] args) {
        // 연산자

        //산술연산자 (사칙연산 + 나머지 값 구하기)
        int num1 = 10 + 20;
        int num2 = 9 / 2; // 실수를 정수에 집어 넣음, 소숫점 결과 안나옴, 다운캐스팅 해야함
        System.out.println(num2);
        int num3 = 9 % 2; // % == 나머지 구하기
        System.out.println(num3);
        boolean num4 = 5 % 2 == 0; // 나머지가 1이면 홀수, 0이면 짝수(홀짝구분) == -> 같다는 뜻(등호)
        System.out.println(num4);

        System.out.println("///////////////////////////////////////");

        // 증감연산
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i); // 앞의 값을 증가시켜라 (선증가), 앞의 값에서 증가시키라는 뜻
        System.out.println(i++); // 뒤의 값을 증가시켜라 (후증가), 이 명령이 끝나고 난 후 증가시켜라는 뜻
        System.out.println(i);
        System.out.println(--i); // 앞의 값을 감소시켜라 (선감소)
        System.out.println(i--); // 뒤의 값을 감소시켜라 (후감소)
        System.out.println(i);

        System.out.println("////////////////////////////////");

        // 논리연산자
        // true => 1
        // false => 0
        // && => AND(곱)
        // || => OR(합)
        System.out.println(true && true); // 1 x 1 == 1(true)
        System.out.println(true && false); // 1 x 0 == 0(false)
        System.out.println(true || true); // 1 + 1, 0이 아니므로 참이다.(true)
        System.out.println(false || false); // 0 + 0 == 0(false)
        System.out.println(!true && true); // false x true == 0 x 1 == 0 (false)
        System.out.println("/////////////////////////");

        // 관계연산자

        System.out.println(3 > 2 && 1 == 1); // 조건이 둘다 참일때 true
        System.out.println(1 != 1);
        System.out.println("/////////////////////////");

        // 조건연산자
        // 처음에 조건이 나와야 한다 ?뒤쪽에 있는 결과로 나옴
        System.out.println(3 > 2 ? 10 : 20); // 뒷숫자로 결과 나와서 10
        int x = 10;
        int y = 2;
        String result = x % y == 0 ? "y의 배수입니다." : "y의 배수가 아닙니다.";
        String result2 = "" + 10 / 2;
        System.out.println(result);



        // 복합대입연산자
        int number = 10;
        number += 5;
        number -= 1;
        number *= 2;
        number /= 2;
        number %= 2;



    }
}
