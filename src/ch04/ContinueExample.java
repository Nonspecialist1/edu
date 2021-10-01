package ch04;

public class ContinueExample {
    public static void maSin(String[] args){
        for(int i=0; i<100; i++){
            if(i == 50 && i == 55){
                continue; //skip
            }
            System.out.println(i);
        }
    }
}
