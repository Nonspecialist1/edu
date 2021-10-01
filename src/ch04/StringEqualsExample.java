package ch04;

public class StringEqualsExample {
    public static void main(String[] args){
        //Java 문자열 비교할 때 절대 == 비교 금지 !!!!
        //객체에게 주소값을 받아서 언제든지 접근함, new는 새로운 주소로 객체와 같은 아파트를 만드는 것
        String str1 = new String("안녕하세요"); //변수는 외부에서 알 수 없도록 은닉화, 캡슐화 됨
        String str2 = new String("안녕하세요");

        System.out.println(str1 == str2); //false

        String str3 = str2; //같은 주소값을 가진 다른 아파트
        System.out.println(str3 == str2); //true

        //아파트 안에 든 값을 비교하는 매소드 equals
        System.out.println("str1.equals(str2) = " + str1.equals(str2)); //true
        System.out.println("str1.equals(str#) = " + str1.equals(str3)); //true
    }
}
