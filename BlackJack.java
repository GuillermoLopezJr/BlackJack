import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JButton;

public class BlackJack extends JPanel {
    private Deck deck;
    private String player;
    private Hand playerHand;
    private Hand dealerHand;

    public BlackJack() {
        initGame();
        start();
    }

    private void initGame() {
        deck = new Deck();
        playerHand = new Hand();
        dealerHand = new Hand();
    }

    public void start() {

    }
}
