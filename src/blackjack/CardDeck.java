package blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;
    public CardDeck(){ init();}
    private void init() {
        String[] patterns = {"스페이드", "하트", "클럽", "다이아몬드"};
        cards = new ArrayList();

        for(int i=0; i<patterns.length; i++){
            for(int z=1; z<=13; z++){
                String denomination = null;
                switch (z){
                    case 1:  denomination = "A"; break;
                    case 11: denomination = "J"; break;
                    case 12: denomination = "Q"; break;
                    case 13: denomination = "K"; break;
                    default: denomination = String.valueOf(z); // 2~10 case는 정수를 문자열로 변경
                }
                Card c = new Card(patterns[i], denomination);
                cards.add(c);
            }
        }
    }
    //항상 랜덤한 카드를 준다
    public Card getCard(){
        //if 콜렉션을 배열로 했다면 먼저 셔플 후 순차적으로 카드를 주었을 것이지만, ArrayList는 램덤하게 카드 지급
        int rIdx = (int)(Math.random() * cards.size()); //remove는 값을 지우기때문에 같은 수가 나오지않도록 상수로 곱하면안됌
        return cards.remove(rIdx);
    }
    public void showAllCards() {
        /*
        for(int i=0; i<cards.size(); i++){
            Card c = cards.get(i);
            System.out.println(c);
        }
        */
        //ForEach문, 향상된 for문
        for (Card c : cards) {
            System.out.println(c);
        }
    }



}
