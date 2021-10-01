package ch04;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        // 객체는 맴버 필드, 맴버 매소드로 구성됨
        Scanner scan = new Scanner(System.in); //레퍼런스 타입은 변수에 주소값이 저장됨, new는 객체화, 인스터스, 아파트 설계도를 실체화 시킨 것
        System.out.print("나이를 입력하세요 : ");
        int age = scan.nextInt();
        System.out.println("나이 : " + age);
    }
}
