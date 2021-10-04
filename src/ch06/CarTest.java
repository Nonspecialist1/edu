package ch06;

public class CarTest {
    public static void main(String[] args) {
        String car2 = new String("");
        Car car = new Car(); // new는 객체화하는 방법, 이것 없이 객체화 불가능, 새로운 주소값 할당

        car.brand = "현대"; // 주소값. 점은 주소값에 접근하는 방법
        car.nm = "소나타";
        car.drive();
        car.stop();

        Car car3 = new Car();
        car3.brand = "기아";
        car3.nm = "K5";
        car3.drive();
        car3.stop();

        System.out.println(car == car3);

    }
}
