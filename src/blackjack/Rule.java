package blackjack;

import java.util.List;

public class Rule {
    //Dealer랑 소스 중복, Dealr에서 Rule 참조해서 한번에 해결하는게 맞음
    public int getScore(List<Card> cards){
        int sumPoint = 0;
        for(int i=0; i< cards.size(); i++){
            Card c = cards.get(i);
            sumPoint += c.getPoint();
        }
        return sumPoint;
    }

    public void getWinner(Dealer dealer, Gamer gamer){
        int dealerScore = getScore(dealer.openCards());
        int gamerScore = getScore(gamer.openCards());

        System.out.println("dealerScore : " + dealerScore);
        System.out.println("gamerScore : " + gamerScore);
        System.out.println("==================");
        //경우의 수 3(비기는 경우, 딜러 승, 게이머 승)
        final int ST_SCORE = 21;

        if(dealerScore == gamerScore || (dealerScore > ST_SCORE && gamerScore > ST_SCORE)){
            System.out.println("비겼습니다.");
        }else if( (gamerScore > ST_SCORE) || (dealerScore <= ST_SCORE && dealerScore > gamerScore) ){
            System.out.println("딜러 승");
        }else{
            System.out.println("게이머 승");
        }
    }


}
