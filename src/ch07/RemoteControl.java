package ch07;
// 인터페이스와 추상클래스 전부 객체화 불가능, 부모로서 타입으로서만 역할
public interface RemoteControl {
    public static final int MAX_VOLUME = 10; // 생략해도 자동으로 앞의 형식이 됨
    int MIN_VOLUME = 0;

    // 인터페이스 안의 매소드는 모두 구현해야함
    public abstract void turnOn(); // 생략해도 자동으로 앞의 형식이 됨
    public void turnOff();
    abstract void volumeUp();
    void volumeDown();

}
