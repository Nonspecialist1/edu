package other;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        /*
        int[] arr = new int[0];
         */
        // 초기에는 Object 객체로 모든 값 수용가능, <제네릭>으로 데이터 타입 고정
        // add, size(), get(), remove() 알고 있기
        List<Integer> list = new ArrayList(); // List는 인터페이스 ArrayList는 이것을 구현한 클래스 - 상속관계
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(100);

        //list.remove(2); 삭제한 값을 return 해줌 - remove 알고리즘 구현해보기...
        int removeVal = list.remove(0);
        System.out.println("removeVal : "+removeVal);

        for(int i=0; i<list.size(); i++){
            System.out.printf("(%d) - %d\n", i, list.get(i)); //get은 특정 칸의 값을 가져오기
        }


        /*
        System.out.println(list);

        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(100);
        myList.print();
        */

    }



}
