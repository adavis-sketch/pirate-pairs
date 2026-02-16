import java.util.Random;

public class Deck {
    private static int[] deck = new int[55];
    private int length = deck.length;
    private Random random = new Random();

    public Deck(){
        int index = 0;
        for (int num = 1; num <= 10; num++){
            for (int count = 0; count < num; count++){
                deck[index] = num;
                index++;
            }
        }
    }



    public void shuffle(){
        for (i = length - 1; i > 0; i--){
            int ran = random.nextInt(i + 1);//this random is different but when I searched the shuffle method this was what popped up
            int temp = deck[i];
            deck[i] = deck[ran];
            deck[ran] = deck[i];

        }
    }

    public int drawCard(){
        boolean isCards = true;
        if (length == 0){
            isCards = false;
            return isCards;
        }
        int card = deck(length - 1);
        length--;
        return card;
    }

    /*
       public static void removeTopCard(){
        int[] newDeck = new int[deck.length - 1];
        for (int i = 1; i < deck.length; i++){
            newDeck[i - 1] = deck[i];
        }
        deck = newDeck;
    }
     */
 
    // use fisher-yates algorithm for shuffle
    // pull last card instead so don't have to make a new array

    
}
