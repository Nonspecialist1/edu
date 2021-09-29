package ch02;

public class VariableExample2 {
    public static void main(String[] args){
        // 실수 형태 2가지, double이 더 큰 데이터 값
        float f;
        double d;
        // 뒤에 생략하면 자동으로 d타입
        f = 10.1f;
        f = (float) 10.1;
        d = 10.1d;

        System.out.println(f);
        System.out.println(d);

        double d2 = f * f; // 자동형변환 - double형이 더 큰 데이터 값이므로 float 수용가능 - double(f * f)
        //float f2 = d *d; // 자동형변환 불가능 - 수동으로해야 함
        float f2 = (float)(d * d);
        float f3 = (float)d * (float)d;

        System.out.println(d2);
        System.out.println(f2);
        System.out.println(f3);
    }
}