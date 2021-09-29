package ch04;

// 좋은 코드 : 중복 최소화, 변수를 한 번 바꾸면 모든 변수 변경 가능
public class ifTest3 {
    public static void main(String[] args){
        int score = (int)(Math.random()*41) + 60;
        char grade = 'D';
        char pm = ' ';

        if(score >= 90){grade = 'A';}
        else if(score >= 80){grade = 'B';}
        else if(score >= 70){grade = 'C';}

        if(score>=70) {
            int mVal = score % 10;
            if (mVal >= 7 || score == 100) {pm = '+';}
            else if (mVal <= 3) {pm = '-';}
        }
        System.out.printf("%d : %c%c", score, grade, pm);
    }
}
