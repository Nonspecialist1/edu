package ch06;

public class StaticCalc {
    //클래스는 그냥 문서이기 때문에 사용하기 위해서는 직접 메모리에 올려야 한다 -> 객체화
    //static은 메모리에 스스로 올라간다. (클래스 메모리 영역), 미리 메모리에 올라가 있다.
    //static은 객체화(인스터스)가 필요 없음 - 바로 사용가능
    public static int sum(int n1, int n2){return n1 + n2;}
    // static 메소드 장려 !!
    // 1.파라미터 값만 사용할 때 - 위처럼 맴버필드가 없을 때
    // 2.맴버필드를 사용하는데 그 맴버필드가 static인 경우
}
