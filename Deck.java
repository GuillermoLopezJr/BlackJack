import java.util.Random;
public class Deck {
    
    private int MAX_CARDS = 52;
    private String[] SUITS = { "spades", "diamonds", "hearts", "clovers" };
    private String[] FACE_CARDS = {"jack", "queen", "king", "ace"};
    private Card[] deck;
    private int topOfDeck;

    public Deck() {
        buildDeck();
        shuffle();
        topOfDeck = MAX_CARDS-1;
    }

    private void buildDeck() {
        deck = new Card[MAX_CARDS];
        int cardIndex = 0;

        for (int i = 2; i <= 10; i++) {
            for (String s : SUITS) {
                Card c = new Card(i,s);
                deck[cardIndex++] = c; 
            }
        }

        for (String f : FACE_CARDS) {
            for (String s : SUITS) {
                Card c = new Card(f, s);
                deck[cardIndex++] = c;
            }
        }
    }

    //fisher yates shuffle
    public void shuffle() {
        Random ran = new Random();
        for (int i = deck.length-1; i > 0; i--) {
            int ranIndex = ran.nextInt(i);
            swap(deck, i, ranIndex);
        }
    }

    private void swap(Card[] arr, int i, int j) {
        Card temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public boolean isEmpty() {
        return (topOfDeck < 0);
    }
        
    public Card drawCard() {
       if (isEmpty()){
           return (new Card(99, "dead"));
       }
       else {
           Card c = deck[topOfDeck];
           topOfDeck--;
           return c;
       }
    }
}
