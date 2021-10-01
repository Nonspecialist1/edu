package ch04;

public class ForStartTest2 {
    public static void main(String[] args){
        /*
        if star = 2
        _*
        **
        if star = 3
        __*
        _**
        ***
        */

        int star = (int)(Math.random() * 5) +2; // 2~6
        System.out.printf("star = %d\n", star);

        for(int i=0; i<star; i++){
            for(int j=0; j<star; j++){
                if(i == star){
                    System.out.print("★");
                }
                System.out.print("-");

            }
            System.out.println();
        }






        /*
        System.out.printf("star = %d\n", star);
        for(int i=1; i<=star; i++){
            for(int z=0; z<star; z++){
                if(z < star -i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(int i=star; i>0; i--){
            for(int z=1; z<=star; z++){
                if(z<i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        */

    }
}
