package ch05;

import java.util.Scanner;

public class CheckUp9 {
    public static void main(String[] args) {
        int studentNum = 0;
        int[] scores = null;
        int high = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택 > ");

            int selectNo = sc.nextInt();

            if(selectNo == 1){
                System.out.print("학생수 > ");
                studentNum = sc.nextInt();
                scores = new int[studentNum];
            } else if(selectNo == 2){
                for(int i =0; i<studentNum; i++){
                    System.out.printf("scores[%d]> ",i);
                    int value = sc.nextInt();
                    scores[i] = value;
                }
            } else if(selectNo == 3){
                for(int i =0; i<studentNum; i++){
                    System.out.printf("scores[%d] : %d \n",i ,scores[i]);
                }
            } else if(selectNo == 4){
                for(int i =0; i<studentNum; i++){
                    if(scores[i] > high){high = scores[i];}
                    sum += scores[i];
                }
                System.out.printf("최고 점수 : %d\n", high);
                System.out.printf("평균 점수 : %.1f\n", (float)sum / studentNum);
            } else if(selectNo == 5){break;}
              else {System.out.println("없는 번호 입니다.");}
        }

        System.out.println("프로그램 종료");

    }

}
