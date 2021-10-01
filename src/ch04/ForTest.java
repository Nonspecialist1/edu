package ch04;

public class ForTest {
    public static void main(String[] args) {
        int dan = (int) (Math.random() * 8) + 2;  // dan : 2 ~ 9

        //for(int j=2; j<10; j++){
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "단 " + dan + " x " + i + " = " + dan * i);
            // System.out.printf("%d단 %d x %d = %d\n", j, j, i, j*i);
        }
        System.out.println();
        for (int i = 10; i <19; i++) {
            System.out.printf("%d단 %d x %d = %d\n", dan, dan, i-9, dan * (i-9));
        }
    }
}