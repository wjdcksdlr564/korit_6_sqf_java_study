package com.study.java_study.ch07_클래스03;

import javax.naming.Name;

public class ColorMain {
    /*
       문제.
       Color 객체 5개를 담을 수 있는 배열을 생성하여
       #CA848A, Brandied Apricot
       #FFBE98, Peach Fuzz
       #964F4C, Marsala
       #A78C7B, Almondine
       #D8C8BD, Almond Peach
       생성 데이터를 저장 한 후에 for문을 사용하여 배열에 들어있는
       모든 색상 정보를 printInfo()로 호출하여 출력한다.
       이후에 모든 code와 name의 값을 null로 바꾸어 다시 출력한다.
       이때, null로 바꿀때에는 반복문을 사용한다.
        */
    public static void main(String[] args) {
        Color[] colors = new Color[5];
        colors[0] = new Color("#CA848A", "Brandied Apricot");
        colors[1] = new Color("#FFBE98", "Peach Fuzz");
        colors[2] = new Color("#964F4C", "Marsala");
        colors[3] = new Color("#A78C7B", "Almondine");
        colors[4] = new Color("#D8C8BD", "Almond Peach");

        Color[] colors2 = new Color[] {
            colors[0] = new Color("#CA848A", "Brandied Apricot"),
            colors[1] = new Color("#FFBE98", "Peach Fuzz"),
            colors[2] = new Color("#964F4C", "Marsala"),
            colors[3] = new Color("#A78C7B", "Almondine"),
            colors[4] = new Color("#D8C8BD", "Almond Peach"),
        };


        for(Color color : colors) {
            color.printInfo();
        }

        for(Color color : colors2) {
            color.setCode(null);
            color.setName(null);
        }
        for(int i = 0; i < colors.length; i++) {
            colors2[i].printInfo();
        }
        for(Color color : colors2) {
            color.printInfo();
        }
    }
}
