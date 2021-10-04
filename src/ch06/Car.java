package ch06;
/*
    객체화 = 인스터스 = 메모리에 올라간다 모두 같은 의미
    클래스는 2가지로 구성
    - 맴버필드 (변수, 상수)
    - 메소드
*/
public class Car {
    String nm;
    String brand;
    // 기본 생성자(중요)
    // 1. 이름이 클래스와 똑같다.
    // 2. return 타입이 없어야 한다. -> 있으면 매소드(관습적으로 소문자로 시작하세요)
    // *생성자가 하나도 없으면 컴파일러가 자동으로 넣어줌
    Car() {}
    Car(String brand, String nm){
        this.brand = brand;
        this.nm = nm;
    }

    public void drive(){
        System.out.printf("%s의 %s가 달린다.\n", brand, nm);
    }
    public void stop(){
        System.out.printf("%s의 %s가 멈춘다.\n", brand, nm);
    }

}
