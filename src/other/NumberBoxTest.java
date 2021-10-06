package other;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox bn1 = new NumberBox(10); //setter가 아닌 생성자로 값을 넣을시 해당 객체의 값은 고정됨, 새로 넣을려면 새로운 객체 생성해야함
        NumberBox bn2 = new NumberBox(24);

        System.out.println(bn1 == bn2); // 레퍼런스 변수 간 == 비교는 주소값비교
        System.out.println(bn1.equals(bn2)); // equals는 원래 주소값 비교하는 매소드, String의 equals는 셀계자가 값비교로 오버라이딩 해놓은 것임(우리도 하자)
        System.out.println(bn1.getVal());
        System.out.println(bn2.getVal());

        System.out.println("bn1 : "+bn1);
        System.out.println(bn1.toString());
        System.out.println("bn2 : "+bn2);
        System.out.println(bn2.toString());

        String str = new String("abc");
        System.out.println(str); //println 은 전부다 String 으로 바꾸려는 특징, 주소값이 들어오면 toString()으로 변환하는 것임
        System.out.println(str.toString());

    }

}
