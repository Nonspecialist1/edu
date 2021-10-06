package blackjack;

import java.util.List;
import java.util.ArrayList;

public class CardTest {
    public static void main(String[] args) {
        //스페이드, A
        Card c1 = new Card("스페이드", "A");
        Card c2 = new Card("스페이드", "2");
        //배열 or ArrayList
        List<Card> cards = new ArrayList();
        cards.add(c1);
        cards.add(new Card("스페이드", "2"));

        Card ccc = cards.get(0);
        System.out.println(ccc);

        System.out.println(c1.getPattern());
        System.out.println(c1.getDenomination());

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("==============");

        CardDeck cd = new CardDeck();
        cd.showAllCards();
        //52장의 카드가 "스페이드 - A ~ K"부터 "하트" "클럽" "다이아몬드" 다 나오려면?


    }

}
