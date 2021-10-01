package ch05;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[1][1] = 10;

        for(int i=0; i<arr.length; i++){
            for(int z=0; z<arr[i].length; z++){
                System.out.printf("(%d, %d) : %d\t", i, z, arr[i][z]);
            }
            System.out.println();
        }
    }
}
