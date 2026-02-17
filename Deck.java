import java.util.Random;

public class Deck {
    private static int[] deck = new int[55];
    private int length = 55;
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
        for (int i = length - 1; i > 0; i--){
            int ran = random.nextInt(i + 1);//this random is different but when I searched the shuffle method this was what it showed
            int temp = deck[i];
            deck[i] = deck[ran];
            deck[ran] = temp;

        }
    }

    public int drawCard(){
        if (length == 0){
            return -1;
        }
        int card = deck[length - 1];
        length--;
        return card;
    }

    public boolean isEmpty(){
        return length == 0;
    }
}

    

