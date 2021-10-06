package ch07;
public class DmbCellPhone extends CellPhone {
    int channel;
    /* 파라미터가 있는 생성자를 만들면, 기본생성자를 직접 만들어줘야함
    public DmbCellPhone(int channel) {
        this.channel = channel;
    }
    public DmbCellPhone(){}
     */
    // 알고리즘 : 부모객체 생성 -> 자신 객체 생성 -> 자신 생성자 호출 -> 부모 생성자 호출 -> 부모 생성자 실행 -> 자신 생성자 실행 -> 종료
    // 사실은 최상위 객체인 Object 객체 가장 먼저 생성
    public DmbCellPhone(String model, String color, int channel){
        // super(model, color); // 생성자에 생략되어 있음, 직속 부모의 기본생성자 호출 => 항상 제일 첫줄에 있어야함
        // 부모가 기본생성자가 없을 때(파라미터를 넣어줘야하는 생성자만 있는경우)는 직접 작성해야함
        // super("", "");
        // this, super 모두 주소 값을 담고 있는 것
        // this는 나 자신의 주소값, super는 직속 부모클래스의 주소값
        // 사용법 this. / this() / super. / super() => 점은 맴버 필드or매소드를 사용할 때, 소괄호는 생성자 호출(나 자신의 기본 생성자 / 부모의 기본 생성자 호출)
        this.channel = channel;

        // 현재는 똑같지만, 다형성 배우고나서 달라질 수 있음
        // this.printInfo();
        // super.printInfo();
    }
    // 오버로딩 vs 오버라이딩
    // 오버로딩은 똑같은 매소드를 여러개 만들 수 있는 기법 - 파라미터만 다르게
    // 오버라이딩은 매소드 재정의, 부모에 정의된 매소드를 그대로 사용하지 않고 재정의하는 것, 사용이유 - 소스 2만줄 짜리도 3줄 컷가능
    @Override //오버라이딩할 때 항상 명시하기
    void printInfo(){
        super.printInfo();
        System.out.printf("channel : %d\n", channel);
    }

}
