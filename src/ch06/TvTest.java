package ch06;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.setBrand("삼성");
        tv.setInch(50);
        System.out.println("tv brand : "+tv.getBrand());
        System.out.println("tv inch : "+tv.getInch());
        //tv.brand = "삼성"; - 이렇게 직접적으로 변수 선언하면 안됨
        //tv.inch = 34;

        Tv tv2 = new Tv();
        tv2.setBrand("LG");
        tv2.setInch(60);
        System.out.println("tv2 brand : "+tv2.getBrand());
        System.out.println("tv2 inch : "+tv2.getInch());
        //tv2.brand = "삼성";
    }
}