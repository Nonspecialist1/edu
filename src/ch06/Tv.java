package ch06;

public class Tv {
    // 클래스 안 변수에는 이제 아묻따 private 선언, 상수는 안해도됌
    private String brand; // 초기값 null
    private int inch; // 초기값 0

    // getters, setters 외부와 교류할 수 있는 통로 - 변수 하나당 둘다 선언 (매우 중요)
    // set은 리턴 타입 void 파라미터는 같은 데이터 타입, get은 리턴 타입이 데이터 타입과 똑같음, 파라미터는 없음 -> 매소드 순서는 상관없음
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setInch(int inch) {this.inch = inch;}
    public int getInch() {
        return inch;
    }

}

