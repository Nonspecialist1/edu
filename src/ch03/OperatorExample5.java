package ch03;

public class OperatorExample5 {
    public static void main(String[] args){
        // 삼항식
        int n1 = 10;
        int n2 = 11;
        System.out.println(n1 >= n2 ? "n1이 n2랑 같거나 크다" : "n2가 n1보다 크다"); // 결과값은 우좌항 같은 데이터 타입이어야함, String 타입

        // mod(나머지 %)
        System.out.println(10 % 2); // 홀짝 구하는데 나누기에서 2를 많이 사용한다
        System.out.println(11 % 2);
        System.out.println(12 % 2);
        System.out.println(13 % 2);
        // 원시타입과 레퍼런스 타입은 데이터 저장체계가 다르므로 형변환이라는 개념x parse 개념 o
        String str1 = Integer.toString(n2);
        String str2 = String.valueOf(n2);
    }
}
