public class Player{
    private int[] hand = new int[0];
    private int handSize = 0;
    private int playerScore = 0;

    public void takeCard (int card){
        for (int i = 0; i < handSize){
            if (hand[i] == card){
                score += card;
                handSize = 0;
                return;
            }
        }

        hand[handSize] = card;
        handSize++;
    }





    // add a take card function for players
    // make a player array for all the players
}