package ch02;

public class VariableTest {
    public  static  void main(String[] args){
        //1. 정수는 실수 값을 저장할 수 없다.
        //2. 작은 타입에서 큰 타입으로는 자동변환이 이뤄진다.(물론 수동도 된다)
        //2. 큰 타입에서 작은 타입으로는 자동변환이 안 된다.(무조건 수동으로 해야된다)
        int n1 = 10;
        int n2 = 3;
        double result = (float)n1 / n2; // float으로 하면 정확도가 낮아짐, 약간의 값변경 = 사람이 볼 때는 차이가 없는 수준
        System.out.println("결과 : "+ result);
    }
}
