package ch04;

public class ForStartTest {
    public static void main(String[] args){
        int star = (int)(Math.random() * 3) + 2;
        System.out.printf("star : %s ", star);

        System.out.println();

        for(int i=0; i<star; i++){
            for(int j=0; j<star; j++){
                if(j <= i) {
                    System.out.printf("-");
                }
                else {
                    System.out.printf("★");
                }
            }
            System.out.println();
        }
    }
}
