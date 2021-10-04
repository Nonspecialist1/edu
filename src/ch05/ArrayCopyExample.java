package ch05;

public class ArrayCopyExample {
    public static void main(String[] args) {
        //int arr3[] = {10, 20, 30} -> C언어 배열 형식
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = arr1; //얕은 복사(shallow copy) (중요)

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);

        arr1[0] = 5;
        System.out.println(arr1.hashCode()); //주소값은 아니지만 해쉬코드로 대신 비교가능
        System.out.println(arr2.hashCode());
        System.out.println(arr1 == arr2);
    }
}
