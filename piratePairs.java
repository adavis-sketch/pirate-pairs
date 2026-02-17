public class piratePairs {
    public static void main(String[] args){

        Deck deck = new Deck();
        deck.shuffle();

        int scoreLimit = 60 / (5 + 1);

        Player[] players = new Player[5];
        for (int i = 0; i < 5; i++){
            players[i] = new Player();
        }

        while (!deck.isEmpty() && playersLeft(players) > 1){
            for (int i = 0; i < players.length; i++){
                Player p = players[i];
                if (p.isOut()) continue;
                int card = deck.drawCard();
                
                if (card == -1){
                    break;
                }
                System.out.println("Player " + (i + 1) + " drew " + card);
                p.takeCard(card);
                if (p.getScore() > scoreLimit){
                    p.eliminate();
                }
            }
            
        }
        System.out.println("Game over");

        for (int i = 0; i < players.length; i++){
            if (!players[i].isOut()){
                System.out.println("Player " + (i + 1) + " wins!");
            }
        }

    }

    public static int playersLeft(Player[] players){
        int count = 0;
        for (Player p : players){
            if (!p.isOut()){   // count active players
                count++;
            }
        }
        return count;
    }


    

    


}
