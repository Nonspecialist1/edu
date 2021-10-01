package ch05;
import java.util.Scanner;

public class ArrayTest2 {
    /*
        숫자 3개를 입력해주세요.
        숫자1 :
        숫자2 :
        숫자3 :

        합계 :
        평균 :
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 숫자를 사용할 것입니까? : ");
        int LEN = sc.nextInt();
        int[] numberArr = new int[LEN];

        System.out.printf("숫자 %d개를 입력해주세요.\n", numberArr.length);

        // 숫자 입력 받기
        for(int i=0; i<numberArr.length; i++){
            System.out.printf("숫자%d : ", i+1);
            numberArr[i] = sc.nextInt();
        }
        // 숫자 더하기
        int sum = 0;
        for(int i=0; i<numberArr.length; i++){
            sum += numberArr[i];
        }
        // 출력
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + (float)sum / numberArr.length);
    }
}
