package ch06;

public class CarTest3 {
    public static void main(String[] args){
        Car car = new Car();
        car.brand = "현대";
        car.nm = "소나타";
        // 생성자를 이용해서 값 설정을 빠르게 함
        Car car2 = new Car("기아", "스포티지");
        System.out.println("car2.brand : " + car2.brand);
        System.out.println("car2.brand : " + car2.nm);

        car2 = car;
        System.out.println("car2.brand : " + car2.nm);

    }

}
