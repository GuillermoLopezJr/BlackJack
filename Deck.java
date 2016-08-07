public class Deck {
   
    private int MAX_CARDS = 52;
    private String[] SUITS = { "spades", "diamonds", "hearts", "clovers" };
    private String[] FACE_CARDS = {"king", "queen", "jack", "ace"};
    private Card[] Cards;

    public Deck() {
        System.out.println("here 1:");
        buildDeck();
    }

    public void buildDeck() {
        System.out.println("here 2");
        for (int i = 2; i <= 10; i++) {
            for (String s : SUITS) {
                Card c = new Card(i,s);
                System.out.println(c);
            }
        }

        for (String f : FACE_CARDS) {
            for (String s : SUITS) {
                Card c = new Card(f, s);
                System.out.println(c);
            }
        }
    }

    public void shuffle() {
        
    }

    public void drawCard() {
    }
}
