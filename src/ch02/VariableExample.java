package ch02;

public class VariableExample {
    public static void main(String[] args){
        // 정수 변수의 형태 4가지
        // 과거에만 사용, 메모리가 적은 대신 느림
        byte b;
        short s;
        int score; // int는 4바이트 단위라서 가장 속도가 빠름(CPU의 처리 속도 4바이트)
        // 데이터 크기가 클 때 사용 but, 거의 int로 처리 가능
        long l;
        
        /* 데이터 용량을 초과할 때, 오버플로우 및 언더플로우 현상 - int는 거의 안 발생
        s = 128;
        b = (byte)s;
        System.out.println(b);
        */

        score = 10; // 변수 선언 = 은 우항의 결과값(오직 1가지)을 복사하여 좌항에 붙여넣는 것
        System.out.println(score);
        System.out.println(10+"\n");

        score = 20;
        System.out.println(score);
        System.out.println(20+"\n");

        System.out.println(score + score);
        System.out.println(score+"\n");

        score = score + score + score;
        System.out.println(score);

        // final을 붙이면 상수, 10은 literal 값 그자체
        final int score2 = 10;
        // 상수란 한 번 입력된 값은 변경 불가능
        // score2 = 20;
    }
}
