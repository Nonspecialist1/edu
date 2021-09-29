package ch03;

public class OperatorExample4 {
    public static void main(String[] args){
        int n1 = 10;
        // 앞뒤 붙는 순서는 읽을 때 제외하면 상관 없음
        n1 ++;
        ++ n1;
        System.out.println(n1);
        n1 --;
        -- n1;
        System.out.println(n1);
        System.out.println("----");

        int n2 = 40;
        // n2 값을 먼저 읽고나서 ++ 처리하므로 n2 값만 읽음
        System.out.println(n2++);
        System.out.println(n2);
        // 읽기 전에 먼저 ++ 처리하므로 증가된 값
        System.out.println(++n2);
        System.out.println(n2);
        System.out.println("----");

        int n3 = 50;
        n3 = n3 + 2;
        n3 = n3 + 2;
        System.out.println("n3 : " + n3);
        System.out.println("----");

        int n4 = 50;
        n4 += 2;
        n4 += 2;
        System.out.println("n4 : " + n4);

    }
}
