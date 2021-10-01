package ch04;

import java.util.Scanner;

public class WhileTest {
    /*
        숫자를 입력하세요 (정지:0) : 14
        숫자를 입력하세요 (정지:0) : 10
        숫자를 입력하세요 (정지:0) : 0

        더한 수 : 24
        0을 입력하기 전까지 계속 나옴
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int sum = 0;
        while(true){
            System.out.println("숫자를 입력하세요 (정지:0) : ");
            int num = sc.nextInt();
            if(num == 0){break;}
            sum += num;
        }
        System.out.printf("합계 : %d\n", sum);
        */
        System.out.print("숫자를 입력하세요 (정지0) : ");
        int num = sc.nextInt();
        int sum = num;
        while (num != 0) {
            System.out.print("숫자를 입력하세요 (정지0) : ");
            num = sc.nextInt();
            sum += num;
        }
        System.out.printf("합계 : %d", sum);
    }
}
