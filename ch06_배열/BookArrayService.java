package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {

    public static void main(String[] args) {
        BookArrayUtils bookArrayUtils = new BookArrayUtils();
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while (isRun) {
            System.out.println("[도서 등록 프로그램]");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 제목 수정");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q, 프로그램 종료");
            System.out.print("메뉴 선택: ");

            String selectedMenu = scanner.nextLine();

            String[] newNames = null;
            int findIndex = -1;

            switch (selectedMenu) {
                case "1":
                    System.out.println("[도서 등록 프로그램]");
                    newNames = new String[names.length + 1];
                    for (int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록할 도서 제목: ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료!");
                    break;

                case "2":
                    System.out.println("도서 정보 수정");
                    System.out.print("수정 할 도서: ");
                    String modifyName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByName(names, modifyName);
                    if(findIndex == -1) {
                        System.out.println("해당 도서는 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("새 도서 제목: ");
                    names[findIndex] =scanner.nextLine();
                    System.out.println("수정 완료!");
                    break;

                case "3":
                    System.out.println("도서 삭제");
                    System.out.print("삭제할 도서 제목");
                    String removeName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByName(names, removeName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    newNames = new String[names.length - 1];

                case "4":
                case "5":
                case "q":
                default:
                    System.out.println("다시 입력하세요.");
            }
        }
    }
}
