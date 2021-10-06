package ch07;

public class AnimalTest4 {
    public static void main(String[] args) {
        Animal ani = new Cat();
        Cat cat = (Cat) ani;
        //BigCat bc = (BigCat) cat; - 2번 자식타입 BigCat은 부모객체인 Cat 타입의 주소를 저장할 수 없다.
        //bc.sleep();

        //Animal, Cat, Object
    }
}
