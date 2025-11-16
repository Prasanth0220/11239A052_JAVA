import javax.swing.*;
import java.awt.*;

public class AwakeningFacePanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Awakening a Human Face...", 20, 20);
        g.drawOval(50, 50, 100, 100);  // Face
        g.drawLine(80, 80, 80, 100);   // Left eye
        g.drawLine(120, 80, 120, 100); // Right eye
        g.drawArc(80, 120, 40, 20, 0, -180); // Smile
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Awakening Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 250);
        frame.add(new AwakeningFacePanel());
        frame.setVisible(true);
    }
}
