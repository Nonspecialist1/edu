package ch04;

public class ForTest3 {
    public static void main(String[] args){
        int magicNumber = 10;
        for(int i=2; i<magicNumber; i++){
            if(i != 2) {
                System.out.println("------------------");
            }
            for(int z=1; z<magicNumber; z++){
                System.out.printf("%d단 : %d x %d = %d\n", i, i, z, i*z);
            }
        }
    }
}
