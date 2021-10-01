package ch04;

import java.util.Scanner;

public class WhileBreakTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0, val = 0;

        while (true){
            System.out.print("숫자를 입력하세요 (정지:0) : ");
            val = sc.nextInt();
            if(val == 0){break;}
            sum += val;
        }
        System.out.printf("합계 : %d", sum);
    }
}
