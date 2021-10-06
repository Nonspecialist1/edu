package ch07;

public class AnimalTest2 {

    public static void main(String[] args){
        BigCat bc = new BigCat(); //Animal bc = new BigCat(); 으로 해도 상관없음
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        AnimalTest2 at2 = new AnimalTest2();

        at2.animalCrying(bc);
        at2.animalCrying(cat);
        at2.animalCrying(dog);
        at2.animalCrying(cow);
    }
    // 다형성을 이용하면 동물이 2000마리여도 코드 한줄로 끝남
    // 매소드는 파라미터에서 다형성을 활용
    public void animalCrying(Animal classType){classType.crying();}

}
