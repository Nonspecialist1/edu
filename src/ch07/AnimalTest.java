package ch07;
// 다형성(여러가지 형태가 있는 성질) - 3가지 외우기
// 1. 부모타입은 자식객체 주소값 저장할 수 있다. (참조할 수 있다, 가리킬 수 있다)
// 2. 자식타입은 부모객체 주소값 저장할 수 없다. 컴파일에러 발생 (수동형변환도 불가능)
// 3. 매소드 호출은 타입이 알고 있는 것만 호출할 수 있고 실행되는 내용은 객체 기준이다.
public class AnimalTest {
    public static void main(String[] args) {
        // 1번
        BigCat bigCat = new BigCat();
        Cat cat = new BigCat();
        Animal animal = new BigCat();
        Animal animal2 = new Cat();
        // Animal animal3 = new Animal();
        /* 2번
        //BigCat bc = new Cat();
        //Cat cat2 = new Animal();
        */
        // 3번 - Cat타입이 crying매소드를 알고있으므로 호출 가능, 실행되는 내용은 객체인 Bigcat에 있는 crying 메소드로 실행
        Cat cat2 = new BigCat();
        cat2.crying();
        //cat2.sleep(); 이런 경우 Cat타입을 BigCat 타입으로 수동형변환하면 된다.

        BigCat bigCat1 = (BigCat) cat2;
        bigCat1.sleep();
        // 최상위 객체 Object는 리터럴 값도 참조할 수 있음
        // 원시타입에 대응하는 객체들을 참조하는 것임
        Object obj = 1;
        Object integer = new Integer(1);
        Float f = new Float(10.1);
    }
}
