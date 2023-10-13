package blackJack;

import java.util.Scanner;

public class Dealer extends Player{

    @Override
    public boolean needMoreCards() {
        if(countBallInHand() < 18){
            return true;
        }
        return false;
    }
}
