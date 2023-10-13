package blackJack;

import java.util.ArrayList;

public class BlackJack {
    private ArrayList<Player> players = new ArrayList<>();

    public void addPlayerToGame(Player player){
        players.add(player);
    }

    public void dealTwoCardsToAllPlayers(Koloda koloda){
        for(Player p : players){
            p.addCardToHand(koloda.getRandomCard());
        }
        for(Player p : players){
            p.addCardToHand(koloda.getRandomCard());
        }
    }

    public void dealAllNeedCards(Koloda koloda){
        for(Player p: players){
            while(p.needMoreCards()){
                p.addCardToHand(koloda.getRandomCard());
            }
        }
    }

    public void printWinner(){
        /**
         *
         */
        for(Player p : players) {
            if(p.countBallInHand() > 21){
                p.setCanWin(false);
            }
        }

        if(countPlayersWhoCanWin() == 0){
            for(Player p : players){
                if(p instanceof Dealer){
                    System.out.println("Dealer wins Hes cards: ");
                    p.openHand();
                    return;
                }
            }
        }

        if(countPlayersWhoCanWin() == 1){
            for(Player p : players){
                if(p.isCanWin()){
                    System.out.println("Win " + p.getName() + "his cards: ");
                    p.openHand();
                    return;}

            }
        }

        int ballWinner = -1;
        for(Player p : players){
            if(p.isCanWin() && p.countBallInHand() > ballWinner){
                ballWinner = p.countBallInHand();

            }
        }

        for(Player p : players){
            if(p.countBallInHand() == ballWinner){
                System.out.println("Winner " + p.getName() + " cards: ");
                p.openHand();
            }
        }




    }

    private int countPlayersWhoCanWin(){
        int count = 0;
        for (Player p : players){
            if(p.isCanWin()){
                count++;
            }
        }
        return count;
    }



}


