package com.study.java_study.ch02_클래스01;

import java.sql.SQLOutput;

public class ObjectMain {

    public static void main(String[] args) {
        int a = 10;
        ObjectA objectA1 = new ObjectA();    //100번
        ObjectA objectA2 = new ObjectA();    //200번

        System.out.println(a);               // a = 10
        System.out.println(objectA1);        //objectA1의 주소를 나타내라
        System.out.println(objectA2);        //objectA2의 주소를 나타내라

        objectA1.num = 20;                   //objectA1의 숫자는 20
        objectA2.num = 30;                   //objectA2의 숫자는 30

        System.out.println(objectA1.num);    //objectA1의 숫자는 20을 나타내라
        System.out.println(objectA2.num);    //objectA2의 숫자는 30를 나타내라

        System.out.println(objectA1.name);  //null 출력 -> 값이 비어잇음(공간이 비었음), String(클래스)
    }
}
