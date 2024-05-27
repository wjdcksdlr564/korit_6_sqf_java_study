package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String("");  // 공백조차 하나의 리터럴이다.*
        String name = "정찬익";        // 값의 자료형 String
        String phone = null;     // 값의 자료형 null(아무것도 아니다)

   StringUtils stringUtils = new StringUtils();

        if(stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return; // 함수 자체가 void로 시작하기에 가능, int로 시작하면 무조건 숫자를 리턴해줘야함
                    // 이름이 비어있다면, 함수 자체를 리턴시켜버림,( name이 비어있습니다 만 출력)
                    // 이름이 들어가있다면, 다음인 phone으로 넘어가짐
        }

        if(stringUtils.isEmpty(phone)){
            System.out.println("phone이 비어있습니다."); // 위와 같음
            return;
        }

        if(stringUtils.isEmpty(text)){
            System.out.println("text가 비어있습니다.");
            return; // 의미없음, 여기 리턴까지 오면 함수 자체가 끝나버렸다는 의미
        }
    }
}
