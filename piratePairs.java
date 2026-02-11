import java.util.Arrays;

public class piratePairs {
    public static void main(String[] args){



        for (int num = 1; num <= 10; num++){
            for (int count = 0; count < num; count++){
                deck[index] = num;
                index++;
            }
        }
        drawCard());



 

        System.out.println(Arrays.toString(deck));
        System.out.println(Arrays.toString(hand));


    }

    private static int[] deck = new int[55];
    private static int index = 0;
    private static int playerScore = 0;
    private static int[] hand = new int[10];
    private static int handIndex = 0;

    public static int drawCard(){
        int card = deck[0];
        boolean same = false;
        for (int j = 0; j < hand.length; j++){
            if (hand[j] == card){
                playerScore += card;
                same = true;
                handIndex = 0;
                break;
            }
        }
        if (!same) {
            hand[handIndex] = card;
            handIndex++;
        }
        removeTopCard();
    }

    public static void removeTopCard(){
        int[] newDeck = new int[deck.length - 1];
        for (int i = 1; i < deck.length; i++){
            newDeck[i - 1] = deck[i];
        }
        deck = newDeck;
    }
}
