public class Deck {
    private static int[] deck = new int[55];
    private static int index = 0;

    for (int num = 1; num <= 10; num++){
        for (int count = 0; count < num; count++){
            deck[index] = num;
            index++;
        }
    }

    public static int drawCard(){
        int card = deck[0];
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
        removeTopCard();
        return card;
    }

    public static void removeTopCard(){
        int[] newDeck = new int[deck.length - 1];
        for (int i = 1; i < deck.length; i++){
            newDeck[i - 1] = deck[i];
        }
        deck = newDeck;
    }

    public Deck();
}
