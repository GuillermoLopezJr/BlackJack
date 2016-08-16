import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JButton;


public class BlackJack extends JPanel implements ActionListener {
    private Deck deck;
    private String player;
    private Hand playerHand;
    private Hand dealerHand;
    private JButton hitButton;
    private JButton stayButton;

    public BlackJack() {
        initGame();
        start();
    }

    private void initGame() {
        setBackground(Color.GREEN);
        addWidgets();

        deck = new Deck();
        playerHand = new Hand();
        dealerHand = new Hand();
    }
    
    private void addWidgets() {
        hitButton = new JButton("HIT");
        stayButton = new JButton("Stay");

        hitButton.addActionListener(this);
        stayButton.addActionListener(this);
        add(hitButton);
        add(stayButton);
    }
    
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == hitButton) {
            System.out.println("you hit");
        }
        else if (event.getSource() == stayButton) {
            System.out.println("you stay");
        }
    }

    public void start() {
        playerHand.add(deck.drawCard());
        playerHand.add(deck.drawCard());
        dealerHand.add(deck.drawCard());
        dealerHand.add(deck.drawCard());
        System.out.println(playerHand);
        System.out.println(dealerHand);
    }
}
