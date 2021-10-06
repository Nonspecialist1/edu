package blackjack;

public class Card {
    private String pattern; //무늬
    private String denomination; //숫자, 값
    //setter 대신 생성자를 쓴 이유 -> 프로그램 끝날 때 까지 c1에 스페이드 A 값이 불변하게 하기위해
    public Card(String pattern, String denomination){
        this.pattern = pattern;
        this.denomination = denomination;
    }
    //getter
    public String getPattern(){return this.pattern;}
    public String getDenomination(){return this.denomination;}

    public int getPoint(){
        /*
        switch (denomination){
            case "A": return 1;
            case "J": case "Q": case "K": return 10;
            default: return Integer.parseInt(denomination);
        }
        */
        if(denomination == "A"){return 1;}
        else if(denomination == "J" || denomination == "Q" || denomination == "K"){return 10;}
        else{ return Integer.parseInt(denomination); }
    }

    @Override
    public String toString(){return String.format("%s - %s", this.pattern, this.denomination);} //printf랑 같은 매소드


}
