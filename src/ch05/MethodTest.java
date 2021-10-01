package ch05;

public class MethodTest {
    public static void main(String[] args) {
        //printMyself("황장군", 180.82f, 17, 'A');
        // 호출할 때 =을 붙이면 void형이 100%아님, 타입이 다른 경우 제외하고
        // =을 안 붙였다고 해서 void형이 100%인것은 아니다 -> non void이지만, return을 안 받은 경우 존재

        int mon = (int)(Math.random() * 12) +1; //1~12
        printSeason(mon);
    }
    public static void printSeason(int mon){
        System.out.printf("%d월 ", mon);
        if(mon < 3 || mon == 12){
            System.out.printf("겨울");
        } else if(mon < 6){
            System.out.printf("봄");
        } else if(mon < 9){
            System.out.printf("여름");
        } else if(mon < 12){
            System.out.printf("가을");
        } else {
            System.out.printf("알 수 없음");
        }
    }

    public static void printMyself(String name, float height, int age, char blood){
        System.out.printf("%s의 키는 %.2f cm, 나이는 %d세, 혈액형은 %c이다.",
                name, height, age, blood);
    }
}
