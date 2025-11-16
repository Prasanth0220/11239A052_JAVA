import javax.swing.*;
import java.awt.*;

public class StaticCardLayoutExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create the main frame
            JFrame frame = new JFrame("Static Card Layout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a panel with CardLayout but don't switch cards
            CardLayout cardLayout = new CardLayout();
            JPanel panel = new JPanel(cardLayout);  // Container for cards

            // Create Card 1: Red background with a label
            JPanel card1 = new JPanel();
            card1.setBackground(Color.RED);
            card1.add(new JLabel("This is Card 1"));

            // Create Card 2: Green background with a label and button
            JPanel card2 = new JPanel();
            card2.setBackground(Color.GREEN);
            card2.add(new JLabel("This is Card 2"));
            card2.add(new JButton("Click Me"));

            // Create Card 3: Blue background with label and text field
            JPanel card3 = new JPanel();
            card3.setBackground(Color.BLUE);
            card3.add(new JLabel("This is Card 3"));
            card3.add(new JTextField("Text field on card 3"));

            // Add the cards to the panel (all cards will be shown in the layout)
            panel.add(card1, "Card 1");
            panel.add(card2, "Card 2");
            panel.add(card3, "Card 3");

            // Add the panel containing the cards to the frame
            frame.add(panel);
            frame.setSize(400, 300);  // Set window size
            frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));  // Stack cards vertically
            frame.setVisible(true);
        });
    }
}
