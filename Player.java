public class Player{
    private int[] hand = new int[0];
    private int handSize = 0;
    private int playerScore = 0;
    private boolean out = false;

    public void takeCard (int card){
        if (out){
            return;
        }
        for (int i = 0; i < handSize; i++){
            if (hand[i] == card){
                playerScore += card;
                handSize = 0;
                System.out.println("Pair! Gained " + card + " points. Score = " + score);
                return;
            }
        }

        hand[handSize] = card;
        handSize++;
    }

    public int getScore(){
        return playerScore;
    }

    public boolean isOut(){
        return out;
    }

    public void eliminate(){
        out = true;
        System.out.println("PLayer eliminated");
    }







    // add a take card function for players
    // make a player array for all the players
}