package ch02;

public class StringExample {
    public static void main(String[] args){
        // 원시 타입은 그 값을 그대로 저장하지만, 레퍼런스 타입은 객체의 메모리 주소값을 저장
        String str1 = "안녕하세요";

        System.out.println(str1);
        System.out.println(str1 + " 그래요~ " + str1);

        str1 = str1 + 13; // 숫자 원시타입들은 String 타입과 + 로 만나면 모두 자동 형변환 "13"
        System.out.println(str1);

        String str2 = 10 + "10" + 10;
        System.out.println(str2);
    }
}
