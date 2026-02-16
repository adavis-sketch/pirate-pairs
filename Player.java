public class Player{
    private int[] hand = new int[0];
    private int handsize = 0;
    private int playerScore = 0;

    player.takeCard(int card){
        if (hand.contains(card)){
            score += card;
        }
    }

    //use this for later:
    /*
        boolean same = false;
    for (int j = 0; j < handIndex; j++){
        if (hand[j] == card){
            playerScore += card;
            same = true;
            break;
        }
    }
    if (!same && handIndex < hand.length) {
        hand[handIndex] = card;
        handIndex++;
    }
     */


    // add a take card function for players
    // make a player array for all the players
}