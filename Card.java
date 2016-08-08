public class Card {

    private int val;
    private String suit;
    private String face;
    private String DEFAULT_FACE = "N/A";

    public Card(int val, String suit) {
        this.val = val;
        this.suit = suit;
        face = DEFAULT_FACE;
    }

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
        if (face.equals("ace")) {
            val = 11;
        }
        else {
            val = 10;
        }
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getSuit() {
        return suit;
    }

    public int getVal() {
        return val;
    }

    public String getFace() {
        return face;
    }

    public boolean isFaceCard() {
        return (!face.equals(DEFAULT_FACE));
    }

    @Override
    public String toString() {
        if (isFaceCard()) {
            return (face + " of " + suit);
        }
        else {
            return (val + " of " + suit);
        }
    }
}
