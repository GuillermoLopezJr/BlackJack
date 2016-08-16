import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        int WIN_WIDTH  = 1200;
        int WIN_HEIGHT = 800;
        JFrame win = new JFrame("Black Jack");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(WIN_WIDTH, WIN_HEIGHT);
        win.add(new BlackJack());
        win.setVisible(true);
    }
}

