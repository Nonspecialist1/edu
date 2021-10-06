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
    // *생성자가 하나도 없으면 컴파일러가 기본 생성자(파라미터 없는)를 자동으로 넣어줌
    public Car() { super(); }
    // 오버로딩 : 똑같은 이름의 매소드를 여러개 만들 수 있는 기술 (파라미터만 다르면 됨 = 구분할 수 있어야함) -> 오버라이딩과 다름
    // 파라미터의 데이터 타입과 갯수 순서가 중요 / 이름과 리턴 타입은 상관없음 !
    Car(int a, String b){}
    Car(String a, int b){}
    // 생성자를 이용해서 값 설정을 빠르게 함
    Car(String brand, String nm){
        this.brand = brand; // 지역변수, 전역변수, this는 현재 Class의 맴버필드 참조
        this.nm = nm;
    }
    // 매소드는 웬만하면 public이며 private은 거의 없음
    public void drive(){
        System.out.printf("%s의 %s가 달린다.\n", brand, nm);
    }
    public void stop(){
        System.out.printf("%s의 %s가 멈춘다.\n", brand, nm);
    }

}
