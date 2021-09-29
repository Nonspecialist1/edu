package ch02;

public class VariableExample3 {
    public static void main(String[] args){
        char c = 'B'; //char는 결국 정수 타입 데이터(아스키 코드상 숫자)
        System.out.printf("%c : %d\n", c, (int)c);
        int i = 67;
        System.out.printf("%c : %d\n", (char)i, i);

        boolean bl = false;
        System.out.println(bl);
    }
}
// 아래 8개만 원시타입(소문자로 시작), 나머지는 레퍼런스 타입(대문자로 시작)
// byte = char < short < int < long(8바이트) < float(4바이트 but, 지수로 계산해서 8로 떨어지는 long보다 큼) < double < String
// 숫자가 아닌 타입 boolean