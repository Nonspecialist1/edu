package ch07;

// 실제로 존재하지 않는 객체 - 동물, 포유류 등등은 abstract을 붙여서 사용
// 추상 클래스와 인터페이스는 대부분 설계자가 작성함 -> 네이밍을 전부 맞추도록, 실제로 매소드를 오버라이드만 할 때
// 1. 객체화 금지 - 추상 매소드가 하나라도 있으면 클래스도 무조건 추상 클래스가 되어야한다
public abstract class Animal {
    public void crying(){
        System.out.println("동물이 울다.");
    }
    // 2. 추상 매소드, 어차피 자식클래스들이 오버라이딩할 것이므로 사용, 매소드를 알긴 알아야하는데 값은 필요없을 때,
    // 추상 매소드는 강제성이 있다. 자식은 추상 매소드를 꼭 구현해야 한다.
    // 인터페이스는 추상 매소드만 있는 것
    public abstract void eat();

    // class 키워드 왼쪽에 abstract를 붙이면 추상 클래스가 된다.
    // 추상 클래스가 되면 객체화 불가능
}
