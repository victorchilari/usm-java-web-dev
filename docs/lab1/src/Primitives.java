import javax.swing.*;
import java.awt.*; //abstract window toolkit

public class Primitives extends JFrame {
    JPanel p = new JPanel();


    Primitives(){
        this.add(p);
        this.setSize(200, 600);

    }
    public void paint(Graphics pen) {
        // p.setBackground(Color.blue);
        pen.drawLine(20,10,100,30);
        pen.drawRect(20, 50, 80, 30);
        pen.fillRect(20,100,80, 30);
        pen.drawOval(20, 150, 80, 50);
        pen.fillOval(20,220,80,50);
        pen.drawArc(20,280,80,40,0,-180);
        pen.fillArc(20,330,80,40,0,-180);
        int[] x = {20, 50, 80, 100};
        int[] y = {500, 520, 510, 515};
        pen.drawPolyline(x, y, 4);
        pen.drawString("message", 20, 560);

    }


    public static void main(String args[]) {
        Primitives A = new Primitives();
        A.setVisible(true);
    }
}