package ch04;

// for 문은 몇번 반복해야할지 알고 있을 때 많이 사용, while문은 어떤 조건이 되었을 때까지 반복하고 싶을 때(몇 번 반복될지 모를 때) 사용
public class WhileExample {
    public static void main(String[] args){
        int i = 0;
        while(i<5) {
            System.out.println(i);
            i++;
        }
    }
}
