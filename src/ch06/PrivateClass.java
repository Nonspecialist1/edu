package ch06;

public class PrivateClass {
    private int val; // 같은 클래스 안에서만 가능
    int defaultVal; // 접근제어자 선언하지 않으면 default

    public PrivateClass(){} // 생성자에 public private 다 올 수 있음, default는 어디든 거의 안씀,,
    // 모든 객체의 맴버필드는 은닉화,캡슐화해야 함

    public void print(){
        System.out.printf("프린트 !! %d", defaultVal);
    }
}
