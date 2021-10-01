package ch04;

import java.util.Scanner;

public class ForTest4 {
    public static void main(String[] args) {
        /*
        for(int i=1; i<10; i++){
            for(int z=2; z<10; z++){
                System.out.printf("%d x %d = %d \t", z, i, i*z);
            }
            System.out.println();
        }
        확인문제 3번
        int sum = 0;
        int number = 50;
        for (int i = 1; i < 101; i++) {
            if (i % number == 0) {
                sum += i;
            }
        }
        System.out.printf("%d의 배수 합계 : %d", number, sum);

        확인문제 4번
        while(true){
            int n1 = (int)(Math.random() * 6) + 1;
            int n2 = (int)(Math.random() * 6) + 1;
            System.out.printf("(%d, %d)", n1, n2);
            if(n1 + n2 == 5){break;}
        }
        확인문제 5번
        for(int x=1; x<11; x++){
            for(int y=1; y<11; y++){
                if((4*x) + (5*y) == 60){
                    System.out.println("("+x+" , "+y+")");
                }
            }
        }
        확인문제 6번
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("★");
            }
            System.out.println();
        }
        확인문제 7번
        */
        boolean run = true;
        int balance = 100000000;
        int withdraw = 50000000;
        Scanner sc = new Scanner(System.in);

        while(run){
            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택> ");

            int choice = sc.nextInt();

            if(choice == 1){System.out.printf("예금액> %d\n\n", balance);}
            else if(choice == 2){System.out.printf("출금액> %d\n\n", withdraw);}
            else if(choice == 3){System.out.printf("잔고> %d\n\n", balance-withdraw);}
            else if(choice == 4) {
                System.out.println();
                break;
            } else {System.out.printf("없는 번호 입니다.\n\n");}
        }

        System.out.println("프로그램 종료");


    }
}
