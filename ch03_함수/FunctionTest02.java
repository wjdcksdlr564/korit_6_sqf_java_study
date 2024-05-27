package com.study.java_study.ch03_함수;

public class FunctionTest02 {

    int getAddData (int a, int b) {
        // getAddData가 출력 되려면 값이 2개 필요(정수형)
        FunctionTest03 functionTest03 = new FunctionTest03();
        return functionTest03.add(a, b);
        // add 값은 test03에 있음, add 값을 구하기 위해 test03으로 넘김
        // 결과를 test03에서 리턴 받아서 test01로 넘김
    }
}
// FunctionTest02에는 getAddData 의 값이 있음
