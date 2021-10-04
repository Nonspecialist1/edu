package ch06;

public class CalcTest {
    public static void main(String[] args) {
        // 클래스명.메소드 -> static이다. 웬만하면 static 다 붙여라
        String str = "10";
        int instr = Integer.parseInt(str);
        System.out.println(instr + 10);

        int result = StaticCalc.sum(10, 20);
        System.out.println("static sum : " + result);

        //Calc의 메소드 호출해서 결과물 받아서 출력하세요
        //매소드에 static이 없으므로 객체화해야함
        Calc ca = new Calc();
        ca.n1 = 10;
        ca.n2 = 20;
        int result2 = ca.sum();
        System.out.println("instance sum : " + result2);

    }


}
