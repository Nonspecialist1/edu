package ch04;

public class SwitchTest2 {
    public static void main(String[] args){
        String position = new String("과장");
        System.out.printf("%s ", position);

        switch (position){
            case "부장":
                System.out.println("700만원");
                break;
            case "과장":
                System.out.println("500만원");
                break;
            default:
                System.out.println("300만원");
        }

    }
}