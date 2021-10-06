package other;

public class MyArrayList {
    private int[] arr = new int[0]; // 맴버필드에 초기값 줄 수 있는 방법 3가지 중 하나

    public MyArrayList(){
        arr = new int[0];
    }

    public void add(int val){
        int[] temp = new int[arr.length + 1];
        for(int i=0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        temp[arr.length] = val;
        arr = temp;
    }

    public int size(){
        return arr.length;
    }

    public void print(){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            if(i == arr.length - 1){System.out.printf("%d ", arr[i]);}
            else { System.out.printf("%d, ", arr[i]);}
        }
        System.out.print("]");
    }
}
