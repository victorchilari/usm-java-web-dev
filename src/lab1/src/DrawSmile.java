import javax.swing.*;
import java.awt.*; //abstract window toolkit


public class DrawSmile extends JFrame {
    JPanel p = new JPanel();

    DrawSmile() {
        this.add(p);
        this.setSize(300, 250);
    }

    public void paint(Graphics pen) {
        p.setBackground(Color.yellow);
        pen.setColor(Color.pink);
        pen.fillOval(70, 30, 150, 150);
        pen.setColor(Color.blue);
        pen.fillOval(100, 70, 20, 20); //primul ochi
        pen.fillOval(165, 70, 20, 20); //al doilea ochi
        pen.setColor(Color.blue);
        pen.fillArc(101,120,80,40,0,-180);
        pen.setColor(new Color(15, 59, 70));
        pen.drawString("Don't worry, be happy", 20, 230);

    }

    public static void main(String args[]) {
        DrawSmile B = new DrawSmile();
        B.setVisible(true);
    }
}