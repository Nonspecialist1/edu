package ch07;

import javafx.scene.control.Cell;

//부모 클래스
//상속은 트리형 자료구조, 위로 갈수록 추상적이고 아래로 갈수록 구체적
//상속은 일부x 전부받아야하는 것, 아래로 갈수록 클래스 양이 커진다 (소스가 커지는 건 아님, 소드 중복을 줄이려고 상속을 사용하는 것)
//extends Object가 자동으로 들어가지만 생략되어 있는 것, 가장 최상위객체 Object가 맨 위 부모이다
public class CellPhone {
    String model;
    String color;

    public CellPhone(){
        //this.model = "노트10";
        //this.color = "white";
        //클래스 안에 다른 생성자 호출할 때 사용 가능
        //super(); 자동으로 들어가지만, this 생성자를 사용하면 여기서는 사라지고 그 생성자 안에서 자동으로 생성됨(super의 중복을 피함)
        this("노트10", "white");
    }
    //생성자 & setter -> 2가지가 유일하게 맴버필드에 값을 넣을 수 있는 방법  / 값을 불러오는 방법은 getter 매소드 하나 뿐임 (매우 중요)
    //생성자를 사용하는 이유 : setter를 이용하지 않고도 은닉화된 맴버필드에 값을 넣을 수 있음 -> 카드게임 등 값이 변하지 말아야할 때 사용
    public CellPhone(String model, String color){
        this.model = model;
        this.color = color;
    }
    void powerOn(){
        System.out.println("전원을 켭니다.");
    }
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }
    void printInfo(){
        System.out.printf("model : %s, color : %s\n", model, color);
    }
    void sendMsg(String msg){
        System.out.println("보낸 메시지 : " + msg);
    }
}
