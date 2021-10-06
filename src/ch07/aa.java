package ch07;

public class aa {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int[] temp = {40, 50, 60, 70};
        arr = temp;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
