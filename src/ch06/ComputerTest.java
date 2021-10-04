package ch06;

public class ComputerTest {
    // main 매소드에 static이 붙는 이유는 일단 메모리에 올려놓아야 호출이 되기 때문에
    public static void main(String[] args) {
        //static맴버필드, brand는 인스턴스를 아무리 많이 만들어도 값이 한 개만 저장된다. 바꾸면 바꾼값 1개만 저장됨
        //static맴버필드가 아닌 인스턴스맴버필드, cpu는 각 객체마다 값 저장이 가능
        //static일 때, 바로 사용가능
        // Computer.print(); NON static 매소드는 static 메인 안에서 호출할 수 없다?
        Computer.brand = "삼성";
        System.out.println("Computer.brand : " + Computer.brand);
        //static이 아닐 때, 클래스를 객체화하여 사용가능
        Computer c1 = new Computer();
        c1.brand = "애플";
        c1.cpu = 10;
        System.out.println("Computer.brand : " + Computer.brand);
        System.out.println("c1.brand : " + c1.brand);
        System.out.println("c1.cpu : " + c1.cpu);

        Computer c2 = new Computer();
        c2.brand = "리눅스";
        c2.cpu = 30;
        System.out.println("c2.brand : " + c2.brand);
        System.out.println("c2.cpu : " + c2.cpu);
        System.out.println("c1.cpu : " + c1.cpu);
        System.out.println("c1.brand : " + c1.brand);


    }
}
