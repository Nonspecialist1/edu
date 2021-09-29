package ch02;

public class PrintExample {
    public static void main(String[] args){
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("--------");
        System.out.print("안녕하세요\t");
        System.out.print("안녕하세요\n");

        String name = "홍길동";
        float height = 180.8f;
        int age = 17;
        char bloodtype = 'A';
        System.out.println(name +"의 키는 " + height +"cm, 나이는 " + age + "살이고 혈액형은 "+ bloodtype + "형이다.");
        System.out.printf("%s의 키는 %.1fcm, 나이는 %d살이고 혈액형은 %c형이다.",
                            name, height, age, bloodtype); //%s는 무적이라서 모든 변수 타입을 수용
    }
}
