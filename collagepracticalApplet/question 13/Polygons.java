import java.awt.*;
import javax.swing.*;

public class Polygons extends JApplet {
    public void init() {
        setSize(300, 300);
        repaint();
    }

    public void paint(Graphics g) {
        // set Color for rectangle
        g.setColor(Color.green);

        // draw a pentagon
        int[] x = {50, 100, 150, 125, 75}; // x-coordinates of the pentagon vertices
        int[] y = {200, 150, 200, 250, 250}; // y-coordinates of the triangle vertices
        g.drawPolygon(x, y, 5);
    }
}
