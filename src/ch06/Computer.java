package ch06;

public class Computer {
    static String brand;
    int cpu;

    public void print(){
        System.out.printf("컴퓨터 브랜드는 %s이고, 핵심은 %d 입니다\n", brand, cpu);
    }
    //static이 객체화보다 빠르므로, 객체화 했음에도 불구하고 cpu가 객체화 되지 않은 것으로 인식됨
    //public static void print2(){
      //System.out.printf("컴퓨터 브랜드는 %s이고, cpu는 %d입니다\n", brand, cpu);}

}
