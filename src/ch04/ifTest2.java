package ch04;

public class ifTest2 {
    public static void main(String[] args){
        int score = 69;
        char grade = 'D';
        char pm = ' ';

        if(score >= 90){
            grade = 'A';
            if(score >= 97){pm = '+';}
            else if(score <= 93){pm = '-';}
        } else if(score >= 80){
            grade = 'B';
            if(score >= 87){pm = '+';}
            else if(score <= 83){pm = '-';}
        } else if(score >= 70){
            grade = 'C';
            if(score >= 77){pm = '+';}
            else if(score <= 73){pm = '-';}
        }
        System.out.printf("%c%c", grade, pm);
    }
}
