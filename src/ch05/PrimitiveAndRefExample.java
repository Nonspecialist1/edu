package ch05;

public class PrimitiveAndRefExample {
    public static void main(String[] args) {

      int val = 10;
      Box box = new Box();
      box.val = 20;

      Box box4 = box;
      box4.val = 40;


      System.out.println("val : " + val);
      changeVal(val);
      System.out.println("val : " + val);
      System.out.println("-------------");

      System.out.println("box.val : " + box.val);
      changeVal(box4);
      System.out.println("box.val : " + box.val);
    }
    public static void changeVal(int pVal){pVal = 30;}
    public static void changeVal(Box pBox){pBox.val = 130;}

}


class Box {
    int val;
}

class Tv {

}
