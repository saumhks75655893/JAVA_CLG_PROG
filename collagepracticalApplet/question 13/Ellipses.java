import java.awt.*;
import javax.swing.*;

public class Ellipses extends JApplet
{

    public void init() {
        setSize(200, 200);
        repaint();
    }

    public void paint(Graphics g) {
        // set Color for rectangle
        g.setColor(Color.green);

        // draw a ellipse
        g.drawOval(20,20,150,100);
    }
}
