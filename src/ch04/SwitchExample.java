package ch04;

public class SwitchExample {
    public static void main(String[] args){
        int num = (int)(Math.random() * 6) + 1;

        // switch 인자는 정수, 문자열 데이터 타입만 가능
        switch(num) {
            case 1: // 값이 1인 경우 실행
                System.out.println("1번이 나왔습니다.");
                break; // break가 없으면 다음 case까지 계속 실행
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default: // esle와 같은 기능 case 이외에 모든 경우 = default 위치는 상관없음, 맨 뒤라서 break 생략, 어차피 종료됨
                System.out.println("6번이 나왔습니다.");
        }
    }
}
