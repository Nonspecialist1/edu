package ch05;

public class ArrayInArrayTest {
    public static void main(String[] args) {
        /*
            김영희 총점 : 몇점     평균 : 몇점
            김철수 총점 : 몇점     평균 : 몇점
            홍길동 총점 : 몇점     평균 : 몇점
            수학 총점 : 몇점     평균 : 몇점
            영어 총점 : 몇점     평균 : 몇점
            국어 총점 : 몇점     평균 : 몇점
         */
        int[][] scores = { //[3][3]
                {75, 100, 88}, //수학
                {98, 100, 76}, //영어
                {100, 90, 100} //국어
        };
        String[] names = {"김영희", "김철수", "홍길동"};
        String[] subjects = {"수학", "영어", "국어"};
        int[] stuScore = new int[names.length];
        int[] subScore = new int[subjects.length];

        for(int i=0; i<scores.length; i++){
            for(int j=0; j<stuScore.length; j++){
                int score = scores[i][j];
                subScore[i] += score;
                stuScore[j] += score;
            }
        }
        for(int i=0; i< names.length; i++) {
            System.out.printf("%s님의 총점 : %d점 \t 평균 : %.2f점\n", names[i], stuScore[i], (float) stuScore[i] / subjects.length);
        }
        for(int i=0; i< subjects.length; i++) {
            System.out.printf("%s과목 총점 : %d점 \t 평균 : %.2f점\n", subjects[i], subScore[i], (float) subScore[i] / stuScore.length);
        }
















        /*
        int[] studScore = new int[names.length];
        String[] clsArr = {"수학", "영어", "국어"};
        int[] clsScore = new int[clsArr.length];

        for(int i=0; i< scores.length; i++){
            for(int z=0; z< scores[i].length; z++){
                int score = scores[i][z];
                clsScore[i] += score;
                studScore[z] += score;
            }
        }
        for(int i=0; i<studScore.length; i++){
            System.out.printf("%s 총점: %d점, 평균 : %.1f점\n", names[i], studScore[i], (float)studScore[i] / clsArr.length);
        }
        for(int i=0; i<clsScore.length; i++){
            System.out.printf("%s 총점: %d점, 평균 : %.1f점\n", clsArr[i], clsScore[i], (float)clsScore[i] / names.length);
        }
        */



    }
}
