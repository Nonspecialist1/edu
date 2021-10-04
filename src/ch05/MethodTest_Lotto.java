package ch05;

public class MethodTest_Lotto {
    public static void main(String[] args) {
        int rVal = getRandom(1, 45); // 1~45 랜덤한 값을 리턴하는 매소드 구현
        System.out.println(rVal);

        /*
        int absVal = getABS(20);
        int absVal2 = getABS(-20);
        System.out.println(absVal);
        System.out.println(absVal2);
        */
    }

    public static int getRandom(int n1, int n2){
        return (int)(Math.random() * (n2-n1+1) ) + n1;
    }
    // public static int getABS(int n1){return n1 < 0 ? -n1 : n1;}

}
