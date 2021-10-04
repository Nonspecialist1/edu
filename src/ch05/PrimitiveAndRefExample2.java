package ch05;

public class PrimitiveAndRefExample2 {
    public static void main(String[] args) {
        // String은 비파괴 객체, 절대 자기 값을 바꿀 수 없다
        String s1 = new String("Hello");
        System.out.println(s1);
        //changeVal(s1);
        System.out.println(s1.toLowerCase());
    }
    public static void changeVal(String str){
        str = "안녕";
    }
}