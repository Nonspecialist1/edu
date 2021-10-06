package ch07;

public class DmbCellPhoneTest {
    public static void main(String[] args){
        DmbCellPhone dcp = new DmbCellPhone("갤럭시 S21", "black", 10);

        dcp.powerOn();
        dcp.powerOff();
        dcp.printInfo();
        System.out.println("채널 : " + dcp.channel);
        dcp.sendMsg("안녕~~");
    }
}

// final 키워드는 클래스, 맴버필드, 매소드 앞에 사용가능 - 강사님은 안 써봤음, 굳이 수정을 금지하고 싶으면 사용
// 클래스 앞에 오면, 클래스 상속금지 - 대표적으로 String
// 맴버필드 앞에 오면, 값이 상수가 됨
// 매소드 앞에 오면, 매소드 오버라이딩 금지


