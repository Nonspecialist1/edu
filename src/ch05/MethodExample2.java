package ch05;

public class MethodExample2 {
    public static void main(String[] args) {
        // input, output 모두 있는 not void형 : return 키워드 필수
       int result = sum(200, 200);
        System.out.println("sum : " + result);
    }

    public static int sum(int n1, int n2){
        return n1 + n2;
    }
}
