import javax.swing.*;
import java.awt.*;

public class DrawShapesExtended extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw line
        g.setColor(Color.BLUE);
        g.drawLine(20, 30, 150, 30);

        // Draw rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 50, 100, 60);

        // Draw filled rectangle
        g.setColor(Color.GREEN);
        g.fillRect(200, 50, 100, 60);

        // Draw oval
        g.setColor(Color.MAGENTA);
        g.drawOval(50, 150, 100, 60);

        // Draw filled oval
        g.setColor(Color.ORANGE);
        g.fillOval(200, 150, 100, 60);

        // Draw string
        g.setColor(Color.BLACK);
        g.drawString("Shapes Example", 130, 250);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Shapes Extended");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new DrawShapesExtended());
        frame.setVisible(true);
    }
}
