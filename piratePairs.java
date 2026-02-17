public class piratePairs {
    public static void main(String[] args){

        Deck deck = new Deck();
        deck.shuffle();

        int scoreLimit = 60 / (5 + 1);

        Player[] players = new Player[5];
        for (int i = 0; i < 5; i++){
            players[i] = new Player();
        }

        while (!deck.isEmpty()){
            for (int i = 0; i < players.length; i++){
                Player p = players[i];
                if (p.isOut()) continue;
                int card = deck.drawCard();
                if (card == -1){
                    break;
                }
                System.out.println("Player " + i + " drew " + card);
                if (p.getScore() > scoreLimit){
                    p.eliminate();
                }
            }
        }
        System.out.println("Game over");





    }


    

    


}
