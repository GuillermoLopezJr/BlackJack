import java.util.ArrayList;

public class Hand {
    
    private int score;
    private ArrayList<Card> hand; 
    
    public Hand() {
        hand = new ArrayList<Card>();
    }
    
    public void add(Card c){
        hand.add(c);
    }

    public boolean hasAce() {
        boolean found = false;
        for (int i = 0; i < hand.size(); i++) {
            Card c = hand.get(i);
            if (c.isAce()) {
                found = true;
            }
        }
        return found;
    }

    private int sumCards() {
        int sum = 0;
        for (int i = 0; i < hand.size(); i++){
            Card c = hand.get(i);
            sum += c.getVal();
        }
        return sum;
    }

    public void sort() {
        for (int i = 0; i < hand.size(); i++) {
            for (int j = i+1; j < hand.size(); j++) {
                Card c1 = hand.get(i);
                Card c2 = hand.get(j);
                if (c2.getVal() < c1.getVal()) {
                    hand.set(i, c2);
                    hand.set(j, c1);
                }
            }
        }
    }

    public int getScore() {
        sort();
        int sum = 0;
        for (int i = 0; i < hand.size(); i++) {
            Card c = hand.get(i);
            if (c.isAce()) {
                if ((sum+11) > 21) {
                    c.setVal(2);
                }
            }
            sum += c.getVal();
        }

        return sum;
    }
    
    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < hand.size(); i++) {
            res += hand.get(i) + "\n";
        }
        return res;
    }
}
