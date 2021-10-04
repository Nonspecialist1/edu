package ch05;

public class MethodExample {
    // 리턴타입은 크게 void 형과 not void 형으로 구분됨 (쌤피셜)
    // void는 리턴안하는 것, 아웃풋이 없음
    // /     /   리턴타입 매소드명(파라미터){} = 매소드 선언부(){매소드 구현부}
    public static void main(String[] args) {
        sum(10, 20);
        sum(50, 120);
        minus(100, 50);
    }
    public static void sum(int n1, int n2){System.out.println("sum : " + (n1 + n2));}
    public static void minus(int n1, int n2){
        System.out.println("minus : " + (n1 - n2));
    }

}
