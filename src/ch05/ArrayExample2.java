package ch05;

public class ArrayExample2 {
    public static void main(String[] args){
        int[] arr = new int[5]; // 숫자형 배열의 기본값은 0으로 셋팅, 레퍼런스형 배열의 기본값은 Null

        for(int i=0; i<arr.length; i++){
            arr[i] = (i+1)*100;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println( arr[i] );
        }
    }
}
