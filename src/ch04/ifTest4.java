package ch04;

public class ifTest4 {
    public static void main(String[] args){
        String position = new String("과장");
        // 부장이면 "700만원"
        // 과장이면 "500만원"
        // 둘다 아니면 "300만원"
        if("부장".equals(position)){
            System.out.println("700만원");
        } else if(position == "과장"){
            System.out.println("500만원");
        } else {
            System.out.println("300만원");
        }
    }
}
