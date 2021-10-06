package other;

public class NumberBox {
    private int val;
    private String str;

    public NumberBox(int val){
        this.val = val;
    }
    public int getVal(){
        return this.val;
    }






    @Override
    public boolean equals(Object obj){
        NumberBox temp = (NumberBox)obj;
        return temp.val == this.val;
    }
    @Override
    public String toString(){
        return String.valueOf(this.val);
    }
}
