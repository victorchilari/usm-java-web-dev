import javax.swing.*;
import java.awt.*;

// Var5 - to draw a gentelman. Image with gentelman can be found in this path.
public class Var5 extends JFrame {
    JPanel canvas = new JPanel();
    int width = 600;
    int height = width;


    Var5(){
        this.add(canvas);
        this.setSize(width, height);
        this.setBackground(Color.decode("#A1ADBD"));
    }

    public void paint(Graphics pen) {
        pen.setColor(Color.WHITE);
        pen.drawString("Var 5", 284, 52);

        // draw face
        pen.setColor(Color.decode("#ECD9CA"));
        drawCircle(pen,140, 156, 318);
        // distanceFromTo(148, width-148) | (width-148*2) | if(600) -> 304

        // draw eyes left and right
        pen.setColor(Color.WHITE);
        pen.fillOval(210, 232, 65, 46);
        pen.fillOval(width-210-65, 232, 65, 46);

        // draw _
        pen.setColor(Color.decode("#69A140"));
        drawCircle(pen, 226, 246, 34);
        drawCircle(pen, width-226-34, 246, 34);

        // draw nose
        pen.setColor(Color.BLACK);
        pen.drawLine(width/2, 232+12, 210+65+4, 360); // L1
        pen.drawLine(210+65+4, 360, width-(210+65+4), 360); // L2

        // draw mouth
        pen.drawLine(210+65+2, 392, 210+65+2+68, 392); // L1

        // con
        pen.setColor(Color.BLACK);
        pen.fillRect(200,70, coordSimetricFrom(200), distanceFromTo(70, 162));
        // peak
        pen.fillRect(130,164, coordSimetricFrom(130), distanceFromTo(164, 216));

        pen.setColor(Color.WHITE);
        pen.drawString("Good afternoon, I'm gentelman", 218, 530);

    }

    public int coordSimetricFrom(int coordonate) {
        // boolean isFromFirstHalf = width/2 > coordonate;
        return width - coordonate * 2;
    }

    public int distanceFromTo(int c1, int c2) {
        return c2 - c1;
    }

    public void drawCircle(Graphics pen, int x, int y, int diameter) {
        pen.fillOval(x, y, diameter, diameter);
    }

    public void drawCoord(Graphics pen, int x, int y) {
        drawCircle(pen, x-1, y-1, 3);
//        pen.drawString(x + " " + y, x+1, y+1);
    }

    public static void main(String args[]) {
        Var5 A = new Var5();
        A.setVisible(true);
    }
}