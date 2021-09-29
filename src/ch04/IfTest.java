package ch04;

public class IfTest {
    public static void main(String[] args) {
        int score = 75;
        // 점수가 90점 이상이면 A등급
        // 점수가 80점 이상이면 B등급
        // 점수가 70점 이상이면 C등급
        // 70점 미만이면 D등급
        // C등급 이상으로는 7점 이상이면 + / 3점 이하이면 -
        if (score >= 90) {
            if (score >= 97) {
                System.out.println("A+등급");
            } else if(score <= 93){
                System.out.println("A-등급");
            } else {
                System.out.println("A등급");
            }
        } else if (score >= 80) {
            if (score >= 87) {
                System.out.println("B+등급");
            } else if(score <= 83){
                System.out.println("B-등급");
            } else {
                System.out.println("B등급");
            }
        } else if (score >= 70) {
            if (score >= 77) {
                System.out.println("C+등급");
            } else if(score <= 73){
                System.out.println("C-등급");
            } else {
                System.out.println("C등급");
            }
        } else {
            System.out.println("D등급");
        }
    }
}
