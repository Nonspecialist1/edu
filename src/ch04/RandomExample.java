package ch04;

public class RandomExample {
    public static void main(String[] args){
        int num = (int)(Math.random() * 6); // 결과값 0~5 = (0 ~ 곱한값 -1)
        System.out.println("num : " + num);
        // 55~108
        int num3 = (int)(Math.random() * 54) + 55;
        System.out.println("num3 : " + num3);
    }
}
