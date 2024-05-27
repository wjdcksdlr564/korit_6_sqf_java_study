package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {
        // "정찬익" ==> 999

        String a = "정찬익";                // 999
        String b = new String("정찬익");    // 200 -> 999

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "정찬익");
        System.out.println(b == "정찬익");

        String[] names = new String[2];
        names[0] = "정찬익";
        names[1] = new String("정찬익");

        String[] names2 = {"정찬익", new String("정찬익"), null}; // null을 쓸때마다 주소가 달라짐

        System.out.println(names[0] == names2[0]);
        System.out.println(names[1] == names2[1]);
        System.out.println(names == names2);

        System.out.println(new String[2]);
        System.out.println(new String[] {"a", "b"});
    }
}
