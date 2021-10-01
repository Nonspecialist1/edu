package ch04;

public class ForExample {
    public static void main(String[] args){
        /*
        A는 초기화 칸, 포문 외부에 적어도 됨
        B는 반복하는 조건
        C는 증감식
        for( A ; B ; C){

        }

        // 무한루프 for문
        for(;;){

        }
        */

        for(int i=0; i<10; i++){
            System.out.println("i : " + i);
        }
    }
}
